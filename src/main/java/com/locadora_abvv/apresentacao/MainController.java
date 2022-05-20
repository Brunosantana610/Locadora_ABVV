package com.locadora_abvv.apresentacao;

import com.locadora_abvv.negocios.ControladorCliente;
import com.locadora_abvv.negocios.ControladorFuncionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    ControladorCliente controladorCliente = new ControladorCliente();
    ControladorFuncionario controladorFuncionario = new ControladorFuncionario();

    @FXML
    private Button entrarBtn;

    @FXML
    private PasswordField senha;

    @FXML
    private TextField user;



    public Button getEntrarBtn() {
        return entrarBtn;
    }

    public void setEntrarBtn(Button entrarBtn) {
        this.entrarBtn = entrarBtn;
    }

    public PasswordField getSenha() {
        return senha;
    }

    public void setSenha(PasswordField senha) {
        this.senha = senha;
    }

    public TextField getUser() {
        return user;
    }

    public void setUser(TextField user) {
        this.user = user;
    }

    @FXML
    void entrarBtnClicked(ActionEvent event) throws IOException {
        checkLogin();
    }




    private void checkLogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent telaCliente = fxmlLoader.load(getClass().getResource("TelaCliente.fxml"));
        Parent telaFuncionario = fxmlLoader.load(getClass().getResource("TelaFuncionario.fxml"));
        Parent telaAdm = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

        Stage novaJanela = (Stage) entrarBtn.getScene().getWindow();

        if (user.getText().isEmpty() || senha.getText().isEmpty()) {
            Alert dialogoErro = new Alert(Alert.AlertType.WARNING);
            dialogoErro.setHeaderText("ERRO");
            dialogoErro.setContentText("O login ou senha está em branco");
            dialogoErro.showAndWait();

        } else if (controladorCliente.buscar(user.getText()) == null) {
            Alert dialogoErro = new Alert(Alert.AlertType.WARNING);
            dialogoErro.setHeaderText("ERRO");
            dialogoErro.setContentText("O cliente não está cadastrado");
            dialogoErro.showAndWait();

        } else if (controladorCliente.buscar(user.getText()).equals(controladorCliente.getCliente().getCpf()) && controladorCliente.buscar(senha.getText()).equals(controladorCliente.getCliente().getSenha())) {
            novaJanela.setScene(new Scene(telaCliente));


        } else if (controladorFuncionario.buscar(user.getText()) == null) {
            Alert dialogoErro = new Alert(Alert.AlertType.WARNING);
            dialogoErro.setHeaderText("ERRO");
            dialogoErro.setContentText("O funcionário não está cadastrado");
            dialogoErro.showAndWait();

        } else if (controladorFuncionario.buscar(user.getText()).equals(controladorFuncionario.getFuncionario().getCpf()) && controladorFuncionario.buscar(senha.getText()).equals(controladorFuncionario.getFuncionario().getSenha())) {
            if (controladorFuncionario.getFuncionario().getFuncao() == 1) {
                novaJanela.setScene(new Scene(telaFuncionario));
            } else if (controladorFuncionario.getFuncionario().getFuncao() == 2) {
                novaJanela.setScene(new Scene(telaAdm));
            }

        }

    }
    }