package com.locadora_abvv.apresentacao;

import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.ControladorCliente;
import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.beans.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaRemoverClienteController {
    ControladorCliente controladorCliente;
    ControladorFuncionario controladorFuncionario;

    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    private Button irBTn;

    public TextField getRemoverCpcTextField() {
        return removerCpcTextField;
    }

    @FXML
    private TextField removerCpcTextField;

    @FXML
    private Button voltarBtn;

    @FXML
    void irBtnClicked(ActionEvent event) throws ElementoNaoExisteExcepcion {
        Cliente cliente = controladorCliente.buscar(getRemoverCpcTextField().getText());
        controladorCliente.remover(cliente);

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
