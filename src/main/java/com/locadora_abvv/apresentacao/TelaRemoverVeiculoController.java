package com.locadora_abvv.apresentacao;

import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.ControladorCliente;
import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.ControladorVeiculo;
import com.locadora_abvv.negocios.beans.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaRemoverVeiculoController {

    ControladorFuncionario controladorFuncionario;
    ControladorVeiculo controladorVeiculo;

    FXMLLoader fxmlLoader = new FXMLLoader();


    @FXML
    private Button irBTn;

    @FXML
    private TextField removerPlacaTextField;

    @FXML
    private Button voltarBtn;

    public TextField getRemoverPlacaTextField() {
        return removerPlacaTextField;
    }

    @FXML
    void irBtnClicked(ActionEvent event) throws ElementoNaoExisteExcepcion {
        Veiculo veiculo = controladorVeiculo.buscar(getRemoverPlacaTextField().getText());
        controladorVeiculo.remover(veiculo);

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        if (controladorFuncionario.getFuncionario().getFuncao()==1){
            Parent tela = fxmlLoader.load(getClass().getResource("TelaFuncionario.fxml"));

            Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
            novaJanela.setScene(new Scene(tela));
        }

        else if(controladorFuncionario.getFuncionario().getFuncao()==2){
            Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

            Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
            novaJanela.setScene(new Scene(tela));
        }


    }

}
