package com.locadora_abvv.apresentacao;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenManager {


    private static ScreenManager instance;

    public static ScreenManager getInstance(){
        if (instance == null) {
            instance = new ScreenManager();
        }
        return instance;
    }


    private Stage primaryStage;
    private Scene mainScene;
    private MainController mainController;

    private Scene telaAdm;

    public static void setInstance(ScreenManager instance) {
        ScreenManager.instance = instance;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    private TelaAdmController telaAdmController;

    private Scene telaAluguelDeVeiculo;
    private TelaAluguelDeVeiculoController telaAluguelDeVeiculoController;

    private Scene telaAtualizacaoCliente;
    private TelaAtualizacaoClienteController telaAtualizacaoClienteController;

    private Scene telaAtualizacaoFuncionario;
    private TelaAtualizacaoFuncionarioController telaAtualizacaoFuncionarioController;

    private Scene telaAtualizacaoVeiculo;
    private TelaAtualizacaoVeiculoController telaAtualizacaoVeiculoController;

    private Scene telaCadastroCliente;
    private TelaCadastroClienteController telaCadastroClienteController;

    private Scene telaCadastroFuncionario;
    private TelaCadastroFuncionarioController telaCadastroFuncionarioController;

    private Scene telaCadastroVeiculo;
    private TelaCadastroVeiculoController telaCadastroVeiculoController;

    private Scene telaCliente;
    private TelaClienteController telaClienteController;

    private Scene telaFuncionario;
    private TelaFuncionarioController telaFuncionarioController;

    private Scene telaVeiculos;
    private TelaVeiculosController telaVeiculosController;

    private Scene telaBuscarCliente;
    private TelaBuscarClienteController telaBuscarClienteController;

    private Scene telaBuscarFuncionario;
    private TelaBuscarFuncionarioController telaBuscarFuncionarioController;

    private Scene telaBuscarVeiculo;
    private TelaBuscarVeiculoController telaBuscarVeiculoController;

    private Scene telaGerenciamentoCliente;
    private TelaGerenciamentoClienteController telaGerenciamentoClienteController;

    private Scene telaGerenciamentoFuncionario;
    private TelaGerenciamentoFuncionarioController telaGerenciamentoFuncionarioController;

    private Scene telaGerenciamentoVeiculo;
    private TelaGerenciamentoVeiculoController telaGerenciamentoVeiculoController;

    private Scene telaRemoverCliente;
    private  TelaRemoverClienteController telaRemoverClienteController;

    private Scene telaRemoverFuncionario;
    private TelaRemoverFuncionarioController telaRemoverFuncionarioController;

    private  Scene telaRemoverVeiculo;
    private TelaRemoverVeiculoController telaRemoverVeiculoController;

    private ScreenManager(){
        this.initialize();
    }


    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Scene getMainScene() {
        return mainScene;
    }

    public MainController getMainController() {
        return mainController;
    }

    public Scene getTelaAdm() {
        return telaAdm;
    }

    public TelaAdmController getTelaAdmController() {
        return telaAdmController;
    }

    public Scene getTelaAluguelDeVeiculo() {
        return telaAluguelDeVeiculo;
    }

    public TelaAluguelDeVeiculoController getTelaAluguelDeVeiculoController() {
        return telaAluguelDeVeiculoController;
    }

    public Scene getTelaAtualizacaoCliente() {
        return telaAtualizacaoCliente;
    }

    public TelaAtualizacaoClienteController getTelaAtualizacaoClienteController() {
        return telaAtualizacaoClienteController;
    }

    public Scene getTelaAtualizacaoFuncionario() {
        return telaAtualizacaoFuncionario;
    }

    public TelaAtualizacaoFuncionarioController getTelaAtualizacaoFuncionarioController() {
        return telaAtualizacaoFuncionarioController;
    }

    public Scene getTelaAtualizacaoVeiculo() {
        return telaAtualizacaoVeiculo;
    }

    public TelaAtualizacaoVeiculoController getTelaAtualizacaoVeiculoController() {
        return telaAtualizacaoVeiculoController;
    }

    public Scene getTelaCadastroCliente() {
        return telaCadastroCliente;
    }

    public TelaCadastroClienteController getTelaCadastroClienteController() {
        return telaCadastroClienteController;
    }

    public Scene getTelaCadastroFuncionario() {
        return telaCadastroFuncionario;
    }

    public TelaCadastroFuncionarioController getTelaCadastroFuncionarioController() {
        return telaCadastroFuncionarioController;
    }

    public Scene getTelaCadastroVeiculo() {
        return telaCadastroVeiculo;
    }

    public TelaCadastroVeiculoController getTelaCadastroVeiculoController() {
        return telaCadastroVeiculoController;
    }

    public Scene getTelaCliente() {
        return telaCliente;
    }

    public TelaClienteController getTelaClienteController() {
        return telaClienteController;
    }

    public Scene getTelaFuncionario() {
        return telaFuncionario;
    }

    public TelaFuncionarioController getTelaFuncionarioController() {
        return telaFuncionarioController;
    }

    public Scene getTelaVeiculos() {
        return telaVeiculos;
    }

    public TelaVeiculosController getTelaVeiculosController() {
        return telaVeiculosController;
    }

    public Scene getTelaBuscarCliente() {
        return telaBuscarCliente;
    }

    public TelaBuscarClienteController getTelaBuscarClienteController() {
        return telaBuscarClienteController;
    }

    public Scene getTelaBuscarFuncionario() {
        return telaBuscarFuncionario;
    }

    public TelaBuscarFuncionarioController getTelaBuscarFuncionarioController() {
        return telaBuscarFuncionarioController;
    }

    public Scene getTelaBuscarVeiculo() {
        return telaBuscarVeiculo;
    }

    public TelaBuscarVeiculoController getTelaBuscarVeiculoController() {
        return telaBuscarVeiculoController;
    }

    public Scene getTelaGerenciamentoCliente() {
        return telaGerenciamentoCliente;
    }

    public TelaGerenciamentoClienteController getTelaGerenciamentoClienteController() {
        return telaGerenciamentoClienteController;
    }

    public Scene getTelaGerenciamentoFuncionario() {
        return telaGerenciamentoFuncionario;
    }

    public TelaGerenciamentoFuncionarioController getTelaGerenciamentoFuncionarioController() {
        return telaGerenciamentoFuncionarioController;
    }

    public Scene getTelaGerenciamentoVeiculo() {
        return telaGerenciamentoVeiculo;
    }

    public TelaGerenciamentoVeiculoController getTelaGerenciamentoVeiculoController() {
        return telaGerenciamentoVeiculoController;
    }

    public Scene getTelaRemoverCliente() {
        return telaRemoverCliente;
    }

    public TelaRemoverClienteController getTelaRemoverClienteController() {
        return telaRemoverClienteController;
    }

    public Scene getTelaRemoverFuncionario() {
        return telaRemoverFuncionario;
    }

    public TelaRemoverFuncionarioController getTelaRemoverFuncionarioController() {
        return telaRemoverFuncionarioController;
    }

    public Scene getTelaRemoverVeiculo() {
        return telaRemoverVeiculo;
    }

    public TelaRemoverVeiculoController getTelaRemoverVeiculoController() {
        return telaRemoverVeiculoController;
    }

    private void initialize(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            AnchorPane mainPane = fxmlLoader.load(getClass().getResource("Main.fxml").openStream());
            this.mainScene = new Scene(mainPane);
            this.mainController = (MainController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane adminPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/telaAdm.fxml").openStream());
            this.telaAdm = new Scene(adminPane);
            this.telaAdmController = (TelaAdmController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane aluguelPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaAluguelDeVeiculos.fxml").openStream());
            this.telaAluguelDeVeiculo = new Scene(aluguelPane);
            this.telaAluguelDeVeiculoController = ( TelaAluguelDeVeiculoController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane attClientePane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaAtualizacaoCliente.fxml").openStream());
            this.telaAtualizacaoCliente = new Scene(attClientePane);
            this.telaAtualizacaoClienteController = (TelaAtualizacaoClienteController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane attFuncionarioPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaAtualizacaoFuncionario.fxml").openStream());
            this.telaAtualizacaoFuncionario = new Scene(attFuncionarioPane);
            this.telaAtualizacaoFuncionarioController = (TelaAtualizacaoFuncionarioController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane attVeiculoPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaAtualizacaoVeiculo.fxml").openStream());
            this.telaAtualizacaoVeiculo = new Scene(attVeiculoPane);
            this.telaAtualizacaoVeiculoController = (TelaAtualizacaoVeiculoController) fxmlLoader.getController();


            fxmlLoader = new FXMLLoader();
            AnchorPane cadCliPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaCadastrooCliente.fxml").openStream());
            this.telaCadastroCliente = new Scene(cadCliPane);
            this.telaCadastroClienteController = (TelaCadastroClienteController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane cadFuncPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaCadastrooFuncionario.fxml").openStream());
            this.telaCadastroFuncionario = new Scene(cadFuncPane);
            this.telaCadastroFuncionarioController = (TelaCadastroFuncionarioController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane cadVeicPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaCadastroVeiculo.fxml").openStream());
            this.telaCadastroVeiculo = new Scene(cadVeicPane);
            this.telaCadastroVeiculoController = (TelaCadastroVeiculoController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            BorderPane telaCliPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaCliente.fxml"));
            this.telaCliente = new Scene(telaCliPane);
            this.telaClienteController = (TelaClienteController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane telaFuncPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaFuncionario.fxml").openStream());
            this.telaFuncionario = new Scene(telaFuncPane);
            this.telaFuncionarioController = (TelaFuncionarioController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane telaVeicPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaVeiculos.fxml").openStream());
            this.telaVeiculos = new Scene(telaVeicPane);
            this.telaVeiculosController = (TelaVeiculosController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane buscarCliPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaBuscarCliente.fxml").openStream());
            this.telaBuscarCliente = new Scene(buscarCliPane);
            this.telaBuscarClienteController = (TelaBuscarClienteController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane buscarFunPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaBuscarFuncionario.fxml").openStream());
            this.telaBuscarFuncionario = new Scene(buscarFunPane);
            this.telaBuscarFuncionarioController = (TelaBuscarFuncionarioController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane buscarVeiPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaBuscarVeiculo.fxml").openStream());
            this.telaBuscarVeiculo = new Scene(buscarVeiPane);
            this.telaBuscarVeiculoController = (TelaBuscarVeiculoController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane gerenCliPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaGerenciamentoCliente.fxml").openStream());
            this.telaGerenciamentoCliente = new Scene(gerenCliPane);
            this.telaGerenciamentoClienteController = (TelaGerenciamentoClienteController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane gerenFunPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaGerenciamentoFuncionario.fxml").openStream());
            this.telaGerenciamentoFuncionario = new Scene(gerenFunPane);
            this.telaGerenciamentoFuncionarioController = (TelaGerenciamentoFuncionarioController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane gerenVeiPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaGerenciamentoVeiculo.fxml").openStream());
            this.telaGerenciamentoVeiculo = new Scene(gerenVeiPane);
            this.telaGerenciamentoVeiculoController = (TelaGerenciamentoVeiculoController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane remoCliPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaRemoverCliente.fxml").openStream());
            this.telaRemoverCliente = new Scene(remoCliPane);
            this.telaRemoverClienteController = (TelaRemoverClienteController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane remoFunPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaRemoverFuncionario.fxml").openStream());
            this.telaRemoverFuncionario = new Scene(remoFunPane);
            this.telaRemoverFuncionarioController = (TelaRemoverFuncionarioController) fxmlLoader.getController();

            fxmlLoader = new FXMLLoader();
            AnchorPane remoVeiPane = fxmlLoader.load(getClass().getResource("/main/resources/com/locadora_abvv/TelaRemoverVeiculo.fxml").openStream());
            this.telaRemoverVeiculo = new Scene(remoVeiPane);
            this.telaRemoverVeiculoController = (TelaRemoverVeiculoController) fxmlLoader.getController();

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
