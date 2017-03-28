package com.jeremie.springfx;

import java.util.Arrays;
import java.util.List;

/**
 * @author guanhong 2017/3/27.
 */
public enum JapaneseSyllabary {
    あ("a", "あ", "ア"),
    い("i", "い", "イ"),
    う("u", "う", "ウ"),
    え("e", "え", "エ"),
    お("o", "お", "オ"),

    か("ka", "か", "カ"),
    き("ki", "き", "キ"),
    く("ku", "く", "ク"),
    け("ke", "け", "ケ"),
    こ("ko", "こ", "コ"),

    さ("sa", "さ", "サ"),
    し("si", "し", "シ"),
    す("su", "す", "ス"),
    せ("se", "せ", "セ"),
    そ("so", "そ", "ソ"),

    た("ta", "た", "タ"),
    ち("chi", "ち", "チ"),
    つ("tsu", "つ", "ツ"),
    て("te", "て", "テ"),
    と("to", "と", "ト"),

    な("na", "な", "ナ"),
    に("ne", "に", "ニ"),
    ぬ("nu", "ぬ", "ヌ"),
    ね("ne", "ね", "ネ"),
    の("no", "の", "ノ"),

    は("ha", "は", "ハ"),
    ひ("hi", "ひ", "ヒ"),
    ふ("fu", "ふ", "フ"),
    へ("he", "へ", "ヘ"),
    ほ("ho", "ほ", "ホ"),

    ま("ma", "ま", "マ"),
    み("mi", "み", "ミ"),
    む("mu", "む", "ム"),
    め("me", "め", "メ"),
    も("mo", "も", "モ"),

    や("ya", "や", "ヤ"),
    ゆ("yu", "ゆ", "ユ"),
    よ("yo", "よ", "ヨ"),

    ら("ra", "ら", "ラ"),
    り("ri", "り", "リ"),
    る("ru", "る", "ル"),
    れ("re", "れ", "レ"),
    ろ("ro", "ろ", "ロ"),

    わ("wa", "わ", "ワ"),
    を("o", "を", "ヲ"),//wo

    ん("n", "ん", "ン");


    private String phonetic;
    private String hiragana;
    private String katakana;

    JapaneseSyllabary(String phonetic, String hiragana, String katakana) {
        this.phonetic = phonetic;
        this.hiragana = hiragana;
        this.katakana = katakana;
    }

    public String getPhonetic() {
        return this.phonetic;
    }

    public String getHiragana() {
        return this.hiragana;
    }

    public String getKatakana() {
        return this.katakana;
    }

    public static JapaneseSyllabary[] getSyllabarys() {
        return JapaneseSyllabary.values();
    }

    public static List<JapaneseSyllabary> getSyllabaryList() {
        return Arrays.asList(JapaneseSyllabary.values());
    }

    @Override
    public String toString() {
        return "[ " + this.phonetic + " , " + this.hiragana + " , " + this.katakana + " ]";
    }
}
