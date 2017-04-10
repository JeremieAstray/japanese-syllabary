package com.jeremie.springfx.view;

import com.jeremie.springfx.JavaFXMain;
import com.jeremie.springfx.loader.SpringFxmlLoader;
import com.sun.istack.internal.NotNull;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author guanhong 2017/3/30.
 */
public class ViewManager {

    private static ViewManager viewManager;

    private final static Logger logger = LoggerFactory.getLogger(ViewManager.class);

    public final static double WIDTH = 600;
    public final static double HEIGHT = 400;

    private Stage stage;
    private Scene scene;
    private AnchorPane mainPane;
    private ScrollPane mapPane;

    public static void startup(@NotNull Stage stage) {
        viewManager = new ViewManager(stage);
        viewManager.init();
    }

    private ViewManager(Stage stage) {
        this.stage = stage;
    }

    private void init() {
        try {
            this.mainPane = SpringFxmlLoader.load(JavaFXMain.class.getResource("/com/jeremie/springfx/view/main.fxml"));
            this.mapPane = SpringFxmlLoader.load(JavaFXMain.class.getResource("/com/jeremie/springfx/view/map.fxml"));
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        this.scene = new Scene(this.mainPane, WIDTH, HEIGHT);
        this.stage.setScene(scene);
        this.stage.setTitle("五十音小工具");
        this.stage.setMinHeight(HEIGHT);
        this.stage.setMinWidth(WIDTH);
        this.stage.show();
    }

    public static void changeMainPane() {
        viewManager.scene.setRoot(viewManager.mainPane);
    }

    public static void changeMapPane() {
        viewManager.scene.setRoot(viewManager.mapPane);
    }
}
