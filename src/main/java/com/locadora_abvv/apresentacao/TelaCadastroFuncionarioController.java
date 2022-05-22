package com.locadora_abvv.apresentacao;

import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.exceptions.FuncionarioInvalidoException;
import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.beans.Funcionario;
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

public class TelaCadastroFuncionarioController {

    ControladorFuncionario controladorFuncionario;

    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    private TextField CPFField;

    @FXML
    private TextField EnderecoField;

    @FXML
    private TextField emailField;

    @FXML
    private Button enviarBtn;

    @FXML
    private TextField funcaoField;

    @FXML
    private TextField matriculaField;

    @FXML
    private DatePicker nascimentoDatePicker;

    @FXML
    private TextField nomeField;

    @FXML
    private TextField salarioField;

    @FXML
    private TextField senhaFIeld;

    @FXML
    private TextField telefoneField;

    public TextField getCPFField() {
        return CPFField;
    }

    public TextField getEnderecoField() {
        return EnderecoField;
    }

    public TextField getEmailField() {
        return emailField;
    }

    public Button getEnviarBtn() {
        return enviarBtn;
    }

    public TextField getFuncaoField() {
        return funcaoField;
    }

    public TextField getMatriculaField() {
        return matriculaField;
    }

    public DatePicker getNascimentoDatePicker() {
        return nascimentoDatePicker;
    }

    public TextField getNomeField() {
        return nomeField;
    }

    public TextField getSalarioField() {
        return salarioField;
    }

    public TextField getSenhaFIeld() {
        return senhaFIeld;
    }

    public TextField getTelefoneField() {
        return telefoneField;
    }

    public Button getVoltarBtn() {
        return voltarBtn;
    }

    @FXML
    private Button voltarBtn;

    @FXML
    void enviarBtnClicked(ActionEvent event) throws ElementoNaoExisteExcepcion, FuncionarioInvalidoException {
        double salario = Double.parseDouble(getSalarioField().getText());
        int matricula = Integer.parseInt(getMatriculaField().getText());
        int funcao = Integer.parseInt(getFuncaoField().getText());
        controladorFuncionario.atualizar(new Funcionario(this.getNomeField().getText(), this.getCPFField().getText(), this.getSenhaFIeld().getText(), this.getTelefoneField().getText(),
                this.getEmailField().getText(), this.getEnderecoField().getText(), null, salario, matricula, funcao));


    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));


    }

}
