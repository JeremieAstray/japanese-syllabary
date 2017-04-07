package com.jeremie.springfx;

import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author guanhong 2017/3/27.
 */
public enum JapaneseSyllabary {
    a("a", "あ", "ア", SoundType.unvoiced, "a.wav"),
    i("i", "い", "イ", SoundType.unvoiced, "i.wav"),
    u("u", "う", "ウ", SoundType.unvoiced, "u.wav"),
    e("e", "え", "エ", SoundType.unvoiced, "e.wav"),
    o("o", "お", "オ", SoundType.unvoiced, "o.wav"),

    ka("ka", "か", "カ", SoundType.unvoiced, "ka.wav"),
    ki("ki", "き", "キ", SoundType.unvoiced, "ki.wav"),
    ku("ku", "く", "ク", SoundType.unvoiced, "ku.wav"),
    ke("ke", "け", "ケ", SoundType.unvoiced, "ke.wav"),
    ko("ko", "こ", "コ", SoundType.unvoiced, "ko.wav"),

    sa("sa", "さ", "サ", SoundType.unvoiced, "sa.wav"),
    si("si", "し", "シ", SoundType.unvoiced, "si.wav"),
    su("su", "す", "ス", SoundType.unvoiced, "su.wav"),
    se("se", "せ", "セ", SoundType.unvoiced, "se.wav"),
    so("so", "そ", "ソ", SoundType.unvoiced, "so.wav"),

    ta("ta", "た", "タ", SoundType.unvoiced, "ta.wav"),
    chi("chi", "ち", "チ", SoundType.unvoiced, "chi.wav"),
    tsu("tsu", "つ", "ツ", SoundType.unvoiced, "tsu.wav"),
    te("te", "て", "テ", SoundType.unvoiced, "te.wav"),
    to("to", "と", "ト", SoundType.unvoiced, "to.wav"),

    na("na", "な", "ナ", SoundType.unvoiced, "na.wav"),
    ni("ni", "に", "ニ", SoundType.unvoiced, "ni.wav"),
    nu("nu", "ぬ", "ヌ", SoundType.unvoiced, "nu.wav"),
    ne("ne", "ね", "ネ", SoundType.unvoiced, "ne.wav"),
    no("no", "の", "ノ", SoundType.unvoiced, "no.wav"),

    ha("ha", "は", "ハ", SoundType.unvoiced, "ha.wav"),
    hi("hi", "ひ", "ヒ", SoundType.unvoiced, "hi.wav"),
    fu("fu", "ふ", "フ", SoundType.unvoiced, "fu.wav"),
    he("he", "へ", "ヘ", SoundType.unvoiced, "he.wav"),
    ho("ho", "ほ", "ホ", SoundType.unvoiced, "ho.wav"),

    ma("ma", "ま", "マ", SoundType.unvoiced, "ma.wav"),
    mi("mi", "み", "ミ", SoundType.unvoiced, "mi.wav"),
    mu("mu", "む", "ム", SoundType.unvoiced, "mu.wav"),
    me("me", "め", "メ", SoundType.unvoiced, "me.wav"),
    mo("mo", "も", "モ", SoundType.unvoiced, "mo.wav"),

    ya("ya", "や", "ヤ", SoundType.unvoiced, "ya.wav"),
    i_y("i(y)", "い", "イ", SoundType.unvoiced, "i(y).wav"),
    yu("yu", "ゆ", "ユ", SoundType.unvoiced, "yu.wav"),
    e_y("e(y)", "え", "エ", SoundType.unvoiced, "e(y).wav"),
    yo("yo", "よ", "ヨ", SoundType.unvoiced, "yo.wav"),

    ra("ra", "ら", "ラ", SoundType.unvoiced, "ra.wav"),
    ri("ri", "り", "リ", SoundType.unvoiced, "ri.wav"),
    ru("ru", "る", "ル", SoundType.unvoiced, "ru.wav"),
    re("re", "れ", "レ", SoundType.unvoiced, "re.wav"),
    ro("ro", "ろ", "ロ", SoundType.unvoiced, "ro.wav"),

    wa("wa", "わ", "ワ", SoundType.unvoiced, "wa.wav"),
    i_w("i(w)", "い", "イ", SoundType.unvoiced, "i(w).wav"),
    u_w("u(w)", "う", "ウ", SoundType.unvoiced, "u(w).wav"),
    e_w("e(w)", "え", "エ", SoundType.unvoiced, "w(w).wav"),
    o_w("o(w)", "を", "ヲ", SoundType.unvoiced, "o(w).wav"),//wo

    n("n", "ん", "ン", SoundType.unvoiced, "n.wav");

    private String phonetic;
    private String hiragana;
    private String katakana;
    private SoundType soundType;
    private URL pronunciation;

    public enum SoundType {
        /**
         * 清音
         */
        unvoiced,
        /**
         * 浊音
         */
        voiced,
        /**
         * 半浊音
         */
        halfVoiced,
        /**
         * 拗音
         */
        bend
    }

    private static final List<JapaneseSyllabary> unvoicedList;

    static {
        unvoicedList = Stream.of(JapaneseSyllabary.values()).filter(JapaneseSyllabary::isUnvoicedSound).collect(Collectors.toList());
    }

    private URL getURL(String fileName) {
        return JapaneseSyllabary.class.getResource("/pronunciation/" + fileName);
    }

    JapaneseSyllabary(String phonetic, String hiragana, String katakana, SoundType soundType, String pronunciationFileName) {
        this.phonetic = phonetic;
        this.hiragana = hiragana;
        this.katakana = katakana;
        this.soundType = soundType;
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

    /**
     * 是否清音
     *
     * @return boolean
     */
    public boolean isUnvoicedSound() {
        return this.soundType == SoundType.unvoiced;
    }

    /**
     * 是否浊音
     *
     * @return boolean
     */
    public boolean isVoicedSound() {
        return this.soundType == SoundType.voiced;
    }

    /**
     * 是否半浊音
     *
     * @return boolean
     */
    public boolean isHalfVoicedSound() {
        return this.soundType == SoundType.halfVoiced;
    }

    /**
     * 是否拗音
     *
     * @return boolean
     */
    public boolean isBendSound() {
        return this.soundType == SoundType.bend;
    }

    public SoundType getSoundType() {
        return this.soundType;
    }

    public URL getPronunciation() {
        return this.pronunciation;
    }

    public static List<JapaneseSyllabary> getUnvoicedSyllabaryList() {
        return unvoicedList;
    }

    @Override
    public String toString() {
        return "[ " + this.phonetic + " , " + this.hiragana + " , " + this.katakana + " ]";
    }
}
