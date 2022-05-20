package com.locadora_abvv.apresentacao;

import com.locadora_abvv.negocios.ControladorCliente;
import com.locadora_abvv.negocios.ControladorFuncionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    ControladorCliente controladorCliente = new ControladorCliente();
    ControladorFuncionario controladorFuncionario = new ControladorFuncionario();
    ScreenManager sc;
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
            Stage st = (Stage) getEntrarBtn().getScene().getWindow();
            st.setScene(sc.getTelaCliente());

        } else if (controladorFuncionario.buscar(user.getText()) == null) {
            Alert dialogoErro = new Alert(Alert.AlertType.WARNING);
            dialogoErro.setHeaderText("ERRO");
            dialogoErro.setContentText("O funcionário não está cadastrado");
            dialogoErro.showAndWait();

        } else if (controladorFuncionario.buscar(user.getText()).equals(controladorFuncionario.getFuncionario().getCpf()) && controladorFuncionario.buscar(senha.getText()).equals(controladorFuncionario.getFuncionario().getSenha())) {
            Stage st = (Stage) getEntrarBtn().getScene().getWindow();

            if (controladorFuncionario.getFuncionario().getFuncao() == 1) {
                st.setScene(sc.getTelaFuncionario());
            } else if (controladorFuncionario.getFuncionario().getFuncao() == 2) {
                st.setScene(sc.getTelaAdm());
            }

        }
    }
    }