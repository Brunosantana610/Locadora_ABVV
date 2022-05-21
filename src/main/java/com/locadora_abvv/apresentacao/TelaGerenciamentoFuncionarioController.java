package com.locadora_abvv.apresentacao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaGerenciamentoFuncionarioController {
    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    private Button addButton;

    @FXML
    private Button attButton;

    @FXML
    private Button buscarBtn;

    @FXML
    private Button removerBtn;

    @FXML
    private Button voltarBtn;

    @FXML
    void addBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaCadastroFuncionario.fxml"));

        Stage novaJanela = (Stage) addButton.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

    @FXML
    void attBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaAtualizacaoFuncionario.fxml"));

        Stage novaJanela = (Stage) attButton.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));

    }

    @FXML
    void buscarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaBuscarFuncionario.fxml"));

        Stage novaJanela = (Stage) buscarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

    @FXML
    void removerBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaRemoverFuncionario.fxml"));

        Stage novaJanela = (Stage) removerBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {

        Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

}
