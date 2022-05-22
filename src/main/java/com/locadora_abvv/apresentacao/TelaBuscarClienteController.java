package com.locadora_abvv.apresentacao;

import com.locadora_abvv.negocios.ControladorCliente;
import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.beans.Cliente;
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

public class TelaBuscarClienteController {
    ControladorCliente controladorCliente;
    ControladorFuncionario controladorFuncionario;

    FXMLLoader fxmlLoader = new FXMLLoader();



    @FXML
    private TextField buscarCpcTextField;

    @FXML
    private Button irBTn;

    @FXML
    private Button voltarBtn;

    public TextField getBuscarCpcTextField() {
        return buscarCpcTextField;
    }

    @FXML
    void irBtnClicked(ActionEvent event) {
        if(controladorCliente.buscar(this.getBuscarCpcTextField().getText()) != null){
            Alert mostrarCliente = new Alert(Alert.AlertType.INFORMATION);
            Cliente cliente = controladorCliente.buscar(getBuscarCpcTextField().getText());
            String content = "Nome: " + cliente.getNome() + " CPF: " + cliente.getCpf() + " Senha: " + cliente.getSenha() + " Telefone: " + cliente.getTelefone()
                    + "\n Email: " + cliente.getEmail() + " Endereço: " + cliente.getEndereco() + " Data de nascimento: " + cliente.getDataNascimento() +
                    "\n Forma de pagamento: " + cliente.getFormaPagamento() + " CNH: " + cliente.getCnh();
            mostrarCliente.setHeaderText("Cliente: " + cliente.getNome());
            mostrarCliente.setContentText(content);
            mostrarCliente.showAndWait();
        }

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
