package com.locadora_abvv.apresentacao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaFuncionarioController {


    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    private Button gerenciarClienteBtn;

    @FXML
    private Button gerenciarVeiculoBtn;

    @FXML
    private Button veiculosDIsponiveisBtn;

    @FXML
    private Button voltarBtn;

    @FXML
    void gerenciarClienteBtnClicked(ActionEvent event) {

    }

    @FXML
    void gerenciarVeiculoBtnClicked(ActionEvent event) {

    }

    @FXML
    void veiculosDIspBtnClicked(ActionEvent event) {

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("Main.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));

    }

}
