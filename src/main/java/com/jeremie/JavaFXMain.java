package com.jeremie;

/**
 * @author guanhong 2017/3/27.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFXMain extends Application {

    private static int WIDTH = 600;
    private static int HEIGHT = 400;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane mainPane = FXMLLoader.load(JavaFXMain.class.getResource("/main.fxml"));
        Scene scene = new Scene(mainPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("五十音背诵小工具");
        primaryStage.show();
    }
}
