package com.locadora_abvv.apresentacao;

import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.beans.Cliente;
import com.locadora_abvv.negocios.beans.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaAluguelDeVeiculoController {

    ControladorFuncionario controladorFuncionario;
    FXMLLoader fxmlLoader = new FXMLLoader();
    Cliente cliente;
    Funcionario funcionario;

    @FXML
    private Button alugarBtn;

    @FXML
    private DatePicker entregaDatePicker;

    @FXML
    private DatePicker retiradaDatePicker;

    @FXML
    private Button voltarBtn;

    @FXML
    void alugarBtnClicked(ActionEvent event) {

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        if (this.getClass().isInstance(cliente)) {
            Parent tela = fxmlLoader.load(getClass().getResource("TelaCliente.fxml"));

            Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
            novaJanela.setScene(new Scene(tela));

        } else if (this.getClass().isInstance(funcionario)) {
            if (controladorFuncionario.getFuncionario().getFuncao() == 1) {
                Parent tela = fxmlLoader.load(getClass().getResource("TelaFuncionario.fxml"));

                Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
                novaJanela.setScene(new Scene(tela));
            } else {
                Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

                Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
                novaJanela.setScene(new Scene(tela));
            }

        }
    }
}
