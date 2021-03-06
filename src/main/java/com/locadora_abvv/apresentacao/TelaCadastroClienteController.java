package com.locadora_abvv.apresentacao;

import com.locadora_abvv.exceptions.ClienteInvalidoException;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNuloException;
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

public class TelaCadastroClienteController {

    ControladorCliente controladorCliente = new ControladorCliente();

    FXMLLoader fxmlLoader = new FXMLLoader();


    @FXML
    private TextField CNHField;

    @FXML
    private TextField CPFField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField enderecoField;

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

    public Button getVoltarBtn() {
        return voltarBtn;
    }

    @FXML
    void enviarBtnClicked(ActionEvent event) throws ElementoNuloException, ElementoExisteException, ClienteInvalidoException {
        Cliente cliente = new Cliente(getNomeField().getText(), getCPFField().getText(), getSenhaField().getText(), getTelefoneField().getText(
        ), getEmailField().getText(), getEnderecoField().getText(), getNascimentoDatePicker().getValue(), getPagamentoField().getText(),
                getCNHField().getText(), false);
        controladorCliente.cadastrar(cliente);

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
            Parent tela = fxmlLoader.load(getClass().getResource("Main.fxml"));

            Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
            novaJanela.setScene(new Scene(tela));
        }

}
