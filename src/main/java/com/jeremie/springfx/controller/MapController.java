package com.jeremie.springfx.controller;

import com.jeremie.springfx.view.ViewManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by jeremie on 2017/4/10.
 */
@Controller
public class MapController implements Initializable {

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TabPane tabPane;
    @FXML
    public GridPane backButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        anchorPane.setPrefWidth(scrollPane.getPrefWidth() - 2);
        scrollPane.widthProperty().addListener((observable, oldValue, newValue) -> {
            double width = scrollPane.getWidth();
            anchorPane.setPrefWidth(width - 2);
            double margin = (width - ViewManager.WIDTH) / 2;
            if (margin < 0.0001) {
                margin = 0;
            }
            AnchorPane.setLeftAnchor(tabPane, margin);
            AnchorPane.setRightAnchor(tabPane, margin);
            AnchorPane.setLeftAnchor(backButton, margin);
            AnchorPane.setRightAnchor(backButton, margin);
        });
    }

    public void changeMainPane() {
        ViewManager.changeMainPane();
    }
}
