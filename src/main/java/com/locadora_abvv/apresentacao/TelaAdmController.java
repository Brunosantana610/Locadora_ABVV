package com.locadora_abvv.apresentacao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaAdmController {

    @FXML
    private Button gerenciarClienteBtn;

    @FXML
    private Button gerenciarFuncionarioBtn;

    @FXML
    private Button gerenciarVeiculoBtn;

    @FXML
    private Button veiculosDisponiveisBtn;

    @FXML
    private Button voltarBtn;

    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    void gerenciarClienteBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaGerenciamentoCliente.fxml"));

        Stage novaJanela = (Stage) gerenciarClienteBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));

    }

    @FXML
    void gerenciarFuncionarioBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaGerenciamentoFuncionario.fxml"));

        Stage novaJanela = (Stage) gerenciarFuncionarioBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

    @FXML
    void gerenciarVeiculoBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaGerenciamentoVeiculo.fxml"));

        Stage novaJanela = (Stage) gerenciarVeiculoBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));

    }

    @FXML
    void veiculosDisponiveisBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaVeiculos.fxml"));

        Stage novaJanela = (Stage) veiculosDisponiveisBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("Main.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));

    }

}
