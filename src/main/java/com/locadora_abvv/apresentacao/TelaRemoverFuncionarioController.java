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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaRemoverFuncionarioController {
    FXMLLoader fxmlLoader = new FXMLLoader();
    ControladorFuncionario controladorFuncionario;

    @FXML
    private Button irBTn;

    @FXML
    private TextField removerCpcTextField;

    public TextField getRemoverCpcTextField() {
        return removerCpcTextField;
    }

    @FXML
    private Button voltarBtn;

    @FXML
    void irBtnClicked(ActionEvent event) throws ElementoNaoExisteExcepcion, FuncionarioInvalidoException {
        Funcionario funcionario = controladorFuncionario.buscar(getRemoverCpcTextField().getText());
        controladorFuncionario.remover(funcionario);

    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));

    }

}
