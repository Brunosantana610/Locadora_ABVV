package com.locadora_abvv.apresentacao;

import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.ControladorVeiculo;
import com.locadora_abvv.negocios.beans.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaBuscarVeiculoController {

    ControladorVeiculo controladorVeiculo;
    ControladorFuncionario controladorFuncionario;

    FXMLLoader fxmlLoader = new FXMLLoader();

    public TextField getBuscarVeiculoTextFiield() {
        return buscarVeiculoTextFiield;
    }

    @FXML
    private TextField buscarVeiculoTextFiield;

    @FXML
    private Button irBTn;

    @FXML
    private Button voltarBtn;

    @FXML
    void irBtnClicked(ActionEvent event) {
        if(controladorVeiculo.buscar(getBuscarVeiculoTextFiield().getText()) != null){
            Alert mostrarVei = new Alert(Alert.AlertType.INFORMATION);
            Veiculo veiculo = controladorVeiculo.buscar(getBuscarVeiculoTextFiield().getText());
            String content= "Cor: " + veiculo.getCor() + " Capacidade: " + veiculo.getCapacidade() + " Descrição: " + veiculo.getDescricao() +
                    "\n Placa: " + veiculo.getPlaca() + " Valor da multa: " + veiculo.getValorMulta() + " Modelo: " + veiculo.getModelo().getNomeModelo() + " Ano: " + veiculo.getModelo().getAno() +
                    "\n Fabricante: " + veiculo.getFabricante().getNomeFabricante();
            mostrarVei.setHeaderText("Veículo: " + veiculo.getPlaca());
            mostrarVei.setContentText(content);
            mostrarVei.showAndWait();
        }

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
