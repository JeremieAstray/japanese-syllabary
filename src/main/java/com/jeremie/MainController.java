package com.jeremie;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * @author guanhong 2017/3/27.
 */
public class MainController implements Initializable {

    private JapaneseSyllabary[] japaneseSyllabaries = JapaneseSyllabary.getSyllabarys();
    private Random random = new Random(System.currentTimeMillis());
    private JapaneseSyllabary japaneseSyllabary;
    @FXML
    private Label content;

    private void randomSyllabary() {
        japaneseSyllabary = japaneseSyllabaries[random.nextInt(japaneseSyllabaries.length)];
    }

    @FXML
    public void random() {
        randomSyllabary();
        this.content.setText(japaneseSyllabary.getPhonetic());
    }

    @FXML
    public void showHiragana() {
        this.content.setText(japaneseSyllabary.getHiragana());
    }

    @FXML
    public void showRoma() {
        this.content.setText(japaneseSyllabary.getPhonetic());
    }

    @FXML
    public void showFullContent() {
        this.content.setText(japaneseSyllabary.toString());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        random();
    }
}
