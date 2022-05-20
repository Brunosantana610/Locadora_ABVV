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

public class TelaBuscarFuncionarioController {
    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    private Button irBTn;

    @FXML
    private AnchorPane mostrarFuncionarioPane;

    @FXML
    private TextField removerCpcTextField;

    @FXML
    private Button voltarBtn;

    @FXML
    void irBtnClicked(ActionEvent event) {

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

}
