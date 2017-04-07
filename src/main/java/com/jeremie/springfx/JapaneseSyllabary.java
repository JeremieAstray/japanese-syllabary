package com.jeremie.springfx;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * @author guanhong 2017/3/27.
 */
public enum JapaneseSyllabary {
    a("a", "あ", "ア", "a.wav"),
    i("i", "い", "イ", "i.wav"),
    u("u", "う", "ウ", "u.wav"),
    e("e", "え", "エ", "e.wav"),
    o("o", "お", "オ", "o.wav"),

    ka("ka", "か", "カ", "ka.wav"),
    ki("ki", "き", "キ", "ki.wav"),
    ku("ku", "く", "ク", "ku.wav"),
    ke("ke", "け", "ケ", "ke.wav"),
    ko("ko", "こ", "コ", "ko.wav"),

    sa("sa", "さ", "サ", "sa.wav"),
    si("si", "し", "シ", "si.wav"),
    su("su", "す", "ス", "su.wav"),
    se("se", "せ", "セ", "se.wav"),
    so("so", "そ", "ソ", "so.wav"),

    ta("ta", "た", "タ", "ta.wav"),
    chi("chi", "ち", "チ", "chi.wav"),
    tsu("tsu", "つ", "ツ", "tsu.wav"),
    te("te", "て", "テ", "te.wav"),
    to("to", "と", "ト", "to.wav"),

    na("na", "な", "ナ", "na.wav"),
    ni("ni", "に", "ニ", "ni.wav"),
    nu("nu", "ぬ", "ヌ", "nu.wav"),
    ne("ne", "ね", "ネ", "ne.wav"),
    no("no", "の", "ノ", "no.wav"),

    ha("ha", "は", "ハ", "ha.wav"),
    hi("hi", "ひ", "ヒ", "hi.wav"),
    fu("fu", "ふ", "フ", "fu.wav"),
    he("he", "へ", "ヘ", "he.wav"),
    ho("ho", "ほ", "ホ", "ho.wav"),

    ma("ma", "ま", "マ", "ma.wav"),
    mi("mi", "み", "ミ", "mi.wav"),
    mu("mu", "む", "ム", "mu.wav"),
    me("me", "め", "メ", "me.wav"),
    mo("mo", "も", "モ", "mo.wav"),

    ya("ya", "や", "ヤ", "ya.wav"),
    i_y("i", "い", "イ", "i(y).wav"),
    yu("yu", "ゆ", "ユ", "yu.wav"),
    e_y("e", "え", "エ", "e(y).wav"),
    yo("yo", "よ", "ヨ", "yo.wav"),

    ra("ra", "ら", "ラ", "ra.wav"),
    ri("ri", "り", "リ", "ri.wav"),
    ru("ru", "る", "ル", "ru.wav"),
    re("re", "れ", "レ", "re.wav"),
    ro("ro", "ろ", "ロ", "ro.wav"),

    wa("wa", "わ", "ワ", "wa.wav"),
    i_w("i", "い", "イ", "i(w).wav"),
    u_w("u", "う", "ウ", "u(w).wav"),
    e_w("e", "え", "エ", "w(w).wav"),
    o_w("o", "を", "ヲ", "o(w).wav"),//wo

    n("n", "ん", "ン", "n.wav");

    private String phonetic;
    private String hiragana;
    private String katakana;
    private String type;
    private URL pronunciation;

    private URL getURL(String fileName) {
        return JapaneseSyllabary.class.getResource("/pronunciation/" + fileName);
    }

    JapaneseSyllabary(String phonetic, String hiragana, String katakana, String pronunciationFileName) {
        this.phonetic = phonetic;
        this.hiragana = hiragana;
        this.katakana = katakana;
        this.pronunciation = getURL(pronunciationFileName);
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

    public URL getPronunciation() {
        return this.pronunciation;
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
