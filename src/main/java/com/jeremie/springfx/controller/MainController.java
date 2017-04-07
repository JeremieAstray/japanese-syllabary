package com.jeremie.springfx.controller;

import com.jeremie.springfx.JapaneseSyllabary;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * @author guanhong 2017/3/27.
 */
@Controller
public class MainController implements Initializable {

    private List<JapaneseSyllabary> japaneseSyllabaries = JapaneseSyllabary.getUnvoicedSyllabaryList();
    private Random random = new Random(System.currentTimeMillis());
    private JapaneseSyllabary japaneseSyllabary;
    @FXML
    private Label content;

    private void randomSyllabary() {
        japaneseSyllabary = japaneseSyllabaries.get(random.nextInt(japaneseSyllabaries.size()));
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

    @FXML
    public void playSound() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        random();
    }
}
