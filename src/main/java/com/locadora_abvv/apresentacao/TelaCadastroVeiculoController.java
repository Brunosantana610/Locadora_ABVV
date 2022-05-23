package com.locadora_abvv.apresentacao;

import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNuloException;
import com.locadora_abvv.exceptions.ModeloInvalidoException;
import com.locadora_abvv.negocios.ControladorFuncionario;
import com.locadora_abvv.negocios.ControladorVeiculo;
import com.locadora_abvv.negocios.beans.Fabricante;
import com.locadora_abvv.negocios.beans.Modelo;
import com.locadora_abvv.negocios.beans.Veiculo;
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

    ControladorVeiculo controladorVeiculo;
    ControladorFuncionario controladorFuncionario;

    FXMLLoader fxmlLoader = new FXMLLoader();


    @FXML
    private TextField anoField;

    @FXML
    private TextField capacidadeField;

    @FXML
    private TextField corField;

    @FXML
    private TextArea descricaoField;

    @FXML
    private Button enviarBtn;

    @FXML
    private TextField fabricanteField;

    @FXML
    private TextField modeloField;

    @FXML
    private TextField placaField;

    @FXML
    private TextField valorMultaField;

    @FXML
    private Button voltarBtn;

    public TextField getAnoField() {
        return anoField;
    }

    public TextField getCapacidadeField() {
        return capacidadeField;
    }

    public TextField getCorField() {
        return corField;
    }

    public TextArea getDescricaoField() {
        return descricaoField;
    }

    public Button getEnviarBtn() {
        return enviarBtn;
    }

    public TextField getFabricanteField() {
        return fabricanteField;
    }

    public TextField getModeloField() {
        return modeloField;
    }

    public TextField getPlacaField() {
        return placaField;
    }

    public TextField getValorMultaField() {
        return valorMultaField;
    }

    public Button getVoltarBtn() {
        return voltarBtn;
    }

    @FXML
    void enviarBtnClicked(ActionEvent event) throws ModeloInvalidoException, ElementoNuloException, ElementoExisteException {
        int capacidade = Integer.parseInt(this.getCapacidadeField().getText());
        double multa = Double.parseDouble(this.getValorMultaField().getText());
        int ano = Integer.parseInt(this.getAnoField().getText());
        Veiculo veiculo = new Veiculo(getCorField().getText(), capacidade, getDescricaoField().getText(), getPlacaField().getText(),
                multa, new Modelo(getModeloField().getText(), ano), new Fabricante(getFabricanteField().getText()));
        controladorVeiculo.cadastrar(veiculo);

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
