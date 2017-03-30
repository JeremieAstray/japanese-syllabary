package com.jeremie.springfx;

/**
 * @author guanhong 2017/3/27.
 */

import com.jeremie.springfx.view.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        ViewManager.startup(primaryStage);
    }
}
