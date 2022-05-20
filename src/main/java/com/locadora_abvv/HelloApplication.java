package com.locadora_abvv;

import com.locadora_abvv.apresentacao.MainController;
import com.locadora_abvv.apresentacao.ScreenManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(ScreenManager.getInstance().getMainScene());
        stage.setTitle("LOCADORA ABVV");
        stage.setResizable(false);
        stage.setWidth(600);
        stage.setHeight(400);

        ScreenManager.getInstance().setStage(stage);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}