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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaAtualizacaoClienteController {

    ControladorFuncionario controladorFuncionario;
    ControladorCliente controladorCliente;

    @FXML
    private TextField CNHField;

    @FXML
    private TextField CPFField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField enderecoField;

    public TextField getCNHField() {
        return CNHField;
    }

    public TextField getCPFField() {
        return CPFField;
    }

    public TextField getEmailField() {
        return emailField;
    }

    public TextField getEnderecoField() {
        return enderecoField;
    }

    public Button getEnviarBtn() {
        return enviarBtn;
    }

    public DatePicker getNascimentoDatePicker() {
        return nascimentoDatePicker;
    }

    public TextField getNomeField() {
        return nomeField;
    }

    public TextField getPagamentoField() {
        return pagamentoField;
    }

    public TextField getSenhaField() {
        return senhaField;
    }

    public TextField getTelefoneField() {
        return telefoneField;
    }

    public FXMLLoader getFxmlLoader() {
        return fxmlLoader;
    }

    @FXML
    private Button enviarBtn;

    @FXML
    private DatePicker nascimentoDatePicker;

    @FXML
    private TextField nomeField;

    @FXML
    private TextField pagamentoField;

    @FXML
    private TextField senhaField;

    @FXML
    private TextField telefoneField;

    @FXML
    private Button voltarBtn;

    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    void enviarBtnClicked(ActionEvent event) throws ElementoNaoExisteExcepcion {
        Cliente cliente = new Cliente(getNomeField().getText(), getCPFField().getText(), getSenhaField().getText(), getTelefoneField().getText(
        ), getEmailField().getText(), getEnderecoField().getText(), getNascimentoDatePicker().getValue(), getPagamentoField().getText(),
                getCNHField().getText(), false);
        controladorCliente.atualizar(cliente);

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
