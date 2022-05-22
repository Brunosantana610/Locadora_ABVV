package com.locadora_abvv.apresentacao;

import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.beans.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaBuscarFuncionarioController {
    FXMLLoader fxmlLoader = new FXMLLoader();
    ControladorFuncionario controladorFuncionario;
    @FXML
    private Button irBTn;

    @FXML
    private TextField removerCPFTextField;

    @FXML
    private Button voltarBtn;

    public TextField getRemoverCPFTextField() {
        return removerCPFTextField;
    }

    @FXML
    void irBtnClicked(ActionEvent event) {
        if(controladorFuncionario.buscar(this.getRemoverCPFTextField().getText())!=null){
            Alert mostrarFun = new Alert(Alert.AlertType.INFORMATION);
            Funcionario funcionario = controladorFuncionario.buscar(getRemoverCPFTextField().getText());
            String content = "Nome: " + funcionario.getNome() + " CPF: " + funcionario.getCpf() + " Senha: " + funcionario.getSenha() + " Telefone: " + funcionario.getTelefone()
                    + "\n Email: " + funcionario.getEmail() + " Endereço: " + funcionario.getEndereco() + " Data de nascimento: " + funcionario.getDataNascimento()
                    + "\n Salário: " + funcionario.getSalario() + " Matrícula: " + funcionario.getMatricula() + " Função: " + funcionario.getFuncao();
            mostrarFun.setHeaderText("Funcionario: " + funcionario.getNome());
            mostrarFun.setContentText(content);
            mostrarFun.showAndWait();
        }
    }

    @FXML
    void voltarBtnClicked(ActionEvent event) throws IOException {
        Parent tela = fxmlLoader.load(getClass().getResource("TelaAdm.fxml"));

        Stage novaJanela = (Stage) voltarBtn.getScene().getWindow();
        novaJanela.setScene(new Scene(tela));
    }

}
