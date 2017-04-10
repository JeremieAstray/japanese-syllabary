package com.jeremie.springfx.controller;

import com.jeremie.springfx.JapaneseSyllabary;
import com.jeremie.springfx.effect.EffectMedia;
import com.jeremie.springfx.view.ViewManager;
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
        this.japaneseSyllabary = this.japaneseSyllabaries.get(this.random.nextInt(this.japaneseSyllabaries.size()));
    }

    @FXML
    public void random() {
        randomSyllabary();
        this.content.setText(this.japaneseSyllabary.getPhonetic());
    }

    @FXML
    public void showHiragana() {
        this.content.setText(this.japaneseSyllabary.getHiragana());
    }

    @FXML
    public void showtKatakana() {
        this.content.setText(this.japaneseSyllabary.getKatakana());
    }

    @FXML
    public void showRoma() {
        this.content.setText(this.japaneseSyllabary.getPhonetic());
    }

    @FXML
    public void showFullContent() {
        this.content.setText(this.japaneseSyllabary.toString());
        this.playSound();
    }

    @FXML
    public void playSound() {
        EffectMedia.play(this.japaneseSyllabary.getPronunciation());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        random();
    }

    @FXML
    public void changeMapPane() {
        ViewManager.changeMapPane();
    }
}
