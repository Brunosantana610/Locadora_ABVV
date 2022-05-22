package com.locadora_abvv.apresentacao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CadastroController {

    @FXML
    private Button clienteBtn;

    @FXML
    private Button funcionarioBtn;

    @FXML
    private Button voltarBtn;


    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    void clienteBtnClicked(ActionEvent event) throws IOException {
        Parent clienteCadastro = fxmlLoader.load(getClass().getResource("TelaCadastroCliente.fxml"));
        Stage novaJanela = (Stage) clienteBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(clienteCadastro));

    }

    @FXML
    void funcionarioBtnClicked(ActionEvent event) throws IOException {
        Parent funcionarioCadastro = fxmlLoader.load(getClass().getResource("TelaCadastroFuncionario.fxml"));
        Stage novaJanela = (Stage) funcionarioBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(funcionarioCadastro));

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent telaMain = fxmlLoader.load(getClass().getResource("Main.fxml"));
        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(telaMain));

    }

}
