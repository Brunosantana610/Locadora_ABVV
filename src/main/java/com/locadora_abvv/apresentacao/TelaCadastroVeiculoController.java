package com.locadora_abvv.apresentacao;

import com.locadora_abvv.negocios.ControladorCliente;
import com.locadora_abvv.negocios.ControladorFuncionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaCadastroVeiculoController {

    ControladorCliente controladorCliente;
    ControladorFuncionario controladorFuncionario;

    FXMLLoader fxmlLoader = new FXMLLoader();


    @FXML
    private TextField capacidadeField;

    @FXML
    private TextField corFIeld;

    @FXML
    private TextArea descricaoField;

    @FXML
    private Button enviarBtn;

    @FXML
    private TextField fabricanteField;

    @FXML
    private TextField modeloFIeld;

    @FXML
    private TextField placaField;

    @FXML
    private TextField valorMultaFIeld;

    @FXML
    private Button voltarBtn;

    @FXML
    void enviarBtnClicked(ActionEvent event) {

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
