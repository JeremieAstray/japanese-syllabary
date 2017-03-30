package com.jeremie.springfx.view;

import com.jeremie.springfx.JavaFXMain;
import com.jeremie.springfx.loader.SpringFxmlLoader;
import com.sun.istack.internal.NotNull;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author guanhong 2017/3/30.
 */
public class ViewManager {

    private final static Logger logger = LoggerFactory.getLogger(ViewManager.class);

    private final static int WIDTH = 600;
    private final static int HEIGHT = 400;

    private Stage stage;
    private Scene scene;
    private Pane mainPane;

    public static void startup(@NotNull Stage stage) {
        ViewManager viewManager = new ViewManager(stage);
        viewManager.init();
    }

    private ViewManager(Stage stage) {
        this.stage = stage;
    }

    private void init() {
        try {
            this.mainPane = SpringFxmlLoader.load(JavaFXMain.class.getResource("/com/jeremie/springfx/view/main.fxml"));
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        this.scene = new Scene(this.mainPane, WIDTH, HEIGHT);
        this.stage.setScene(scene);
        this.stage.setTitle("五十音背诵小工具");
        this.stage.show();
    }
}
