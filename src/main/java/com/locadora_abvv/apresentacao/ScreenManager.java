package com.locadora_abvv.apresentacao;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
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


    private Stage stage;
    private Scene mainScene;
    private MainController mainController;


    public static void setInstance(ScreenManager instance) {
        ScreenManager.instance = instance;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }


    ScreenManager(){
        this.initialize();
    }


    public Scene getMainScene() {
        return mainScene;
    }

    public MainController getMainController() {
        return mainController;
    }


    private void initialize(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            AnchorPane mainPane = fxmlLoader.load(getClass().getResource("Main.fxml").openStream());
            this.mainScene = new Scene(mainPane);
            this.mainController = (MainController) fxmlLoader.getController();

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
