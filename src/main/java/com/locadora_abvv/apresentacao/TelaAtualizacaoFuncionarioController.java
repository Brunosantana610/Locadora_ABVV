package com.locadora_abvv.apresentacao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaAtualizacaoFuncionarioController {


    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    private TextField CPFField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField enderecoField;

    @FXML
    private Button enviarBtn;

    @FXML
    private TextField funcaoField;

    @FXML
    private TextField matriculaField;

    @FXML
    private AnchorPane nascimentoDatePicker;

    @FXML
    private TextField nomeField;

    @FXML
    private TextField salarioFIeld;

    @FXML
    private TextField senhaFIeld;

    @FXML
    private TextField telefoneField;

    @FXML
    private Button voltarBtn;

    @FXML
    void enviarBtnClicked(ActionEvent event) {

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

}
