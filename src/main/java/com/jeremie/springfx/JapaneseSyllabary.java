package com.jeremie.springfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author guanhong 2017/3/27.
 */
public enum JapaneseSyllabary {
    _a("a", "あ", "ア", SoundType.unvoiced, "a.wav"),
    _i("i", "い", "イ", SoundType.unvoiced, "i.wav"),
    _u("u", "う", "ウ", SoundType.unvoiced, "u.wav"),
    _e("e", "え", "エ", SoundType.unvoiced, "e.wav"),
    _o("o", "お", "オ", SoundType.unvoiced, "o.wav"),

    _ka("ka", "か", "カ", SoundType.unvoiced, "ka.wav"),
    _ki("ki", "き", "キ", SoundType.unvoiced, "ki.wav"),
    _ku("ku", "く", "ク", SoundType.unvoiced, "ku.wav"),
    _ke("ke", "け", "ケ", SoundType.unvoiced, "ke.wav"),
    _ko("ko", "こ", "コ", SoundType.unvoiced, "ko.wav"),

    _sa("sa", "さ", "サ", SoundType.unvoiced, "sa.wav"),
    _si("si", "し", "シ", SoundType.unvoiced, "si.wav"),
    _su("su", "す", "ス", SoundType.unvoiced, "su.wav"),
    _se("se", "せ", "セ", SoundType.unvoiced, "se.wav"),
    _so("so", "そ", "ソ", SoundType.unvoiced, "so.wav"),

    _ta("ta", "た", "タ", SoundType.unvoiced, "ta.wav"),
    _chi("chi", "ち", "チ", SoundType.unvoiced, "chi.wav"),
    _tsu("tsu", "つ", "ツ", SoundType.unvoiced, "tsu.wav"),
    _te("te", "て", "テ", SoundType.unvoiced, "te.wav"),
    _to("to", "と", "ト", SoundType.unvoiced, "to.wav"),

    _na("na", "な", "ナ", SoundType.unvoiced, "na.wav"),
    _ni("ni", "に", "ニ", SoundType.unvoiced, "ni.wav"),
    _nu("nu", "ぬ", "ヌ", SoundType.unvoiced, "nu.wav"),
    _ne("ne", "ね", "ネ", SoundType.unvoiced, "ne.wav"),
    _no("no", "の", "ノ", SoundType.unvoiced, "no.wav"),

    _ha("ha", "は", "ハ", SoundType.unvoiced, "ha.wav"),
    _hi("hi", "ひ", "ヒ", SoundType.unvoiced, "hi.wav"),
    _fu("fu", "ふ", "フ", SoundType.unvoiced, "fu.wav"),
    _he("he", "へ", "ヘ", SoundType.unvoiced, "he.wav"),
    _ho("ho", "ほ", "ホ", SoundType.unvoiced, "ho.wav"),

    _ma("ma", "ま", "マ", SoundType.unvoiced, "ma.wav"),
    _mi("mi", "み", "ミ", SoundType.unvoiced, "mi.wav"),
    _mu("mu", "む", "ム", SoundType.unvoiced, "mu.wav"),
    _me("me", "め", "メ", SoundType.unvoiced, "me.wav"),
    _mo("mo", "も", "モ", SoundType.unvoiced, "mo.wav"),

    _ya("ya", "や", "ヤ", SoundType.unvoiced, "ya.wav"),
    _i_y("i(y)", "い", "イ", SoundType.unvoiced, "i(y).wav"),
    _yu("yu", "ゆ", "ユ", SoundType.unvoiced, "yu.wav"),
    _e_y("e(y)", "え", "エ", SoundType.unvoiced, "e(y).wav"),
    _yo("yo", "よ", "ヨ", SoundType.unvoiced, "yo.wav"),

    _ra("ra", "ら", "ラ", SoundType.unvoiced, "ra.wav"),
    _ri("ri", "り", "リ", SoundType.unvoiced, "ri.wav"),
    _ru("ru", "る", "ル", SoundType.unvoiced, "ru.wav"),
    _re("re", "れ", "レ", SoundType.unvoiced, "re.wav"),
    _ro("ro", "ろ", "ロ", SoundType.unvoiced, "ro.wav"),

    _wa("wa", "わ", "ワ", SoundType.unvoiced, "wa.wav"),
    _i_w("i(w)", "い", "イ", SoundType.unvoiced, "i(w).wav"),
    _u_w("u(w)", "う", "ウ", SoundType.unvoiced, "u(w).wav"),
    _e_w("e(w)", "え", "エ", SoundType.unvoiced, "w(w).wav"),
    _o_w("o(w)", "を", "ヲ", SoundType.unvoiced, "o(w).wav"),//wo

    _n("n", "ん", "ン", SoundType.unvoiced, "n.wav"),

    _ga("ga", "が", "ガ", SoundType.voiced, "ga.wav"),
    _gi("gi", "ぎ", "ギ", SoundType.voiced, "gi.wav"),
    _gu("gu", "ぐ", "グ", SoundType.voiced, "gu.wav"),
    _ge("ge", "げ", "ゲ", SoundType.voiced, "ge.wav"),
    _go("go", "ご", "ゴ", SoundType.voiced, "go.wav"),

    _za("za", "ざ", "ザ", SoundType.voiced, "za.wav"),
    _ji("ji", "じ", "ジ", SoundType.voiced, "ji.wav"),
    _zu("zu", "ず", "ズ", SoundType.voiced, "zu.wav"),
    _ze("ze", "ぜ", "ゼ", SoundType.voiced, "ze.wav"),
    _zo("zo", "ぞ", "ゾ", SoundType.voiced, "zo.wav"),

    _da("da", "だ", "ダ", SoundType.voiced, "da.wav"),
    _ji_d("ji", "ぢ", "ヂ", SoundType.voiced, "ji(d).wav"),
    _zu_d("zu", "づ", "ヅ", SoundType.voiced, "zu(d).wav"),
    _de("de", "で", "デ", SoundType.voiced, "de.wav"),
    _do("do", "ど", "ド", SoundType.voiced, "do.wav"),

    _ba("ba", "ば", "バ", SoundType.voiced, "ba.wav"),
    _bi("bi", "び", "ビ", SoundType.voiced, "bi.wav"),
    _bu("bu", "ぶ", "ブ", SoundType.voiced, "bu.wav"),
    _be("be", "べ", "ベ", SoundType.voiced, "be.wav"),
    _bo("bo", "ぼ", "ボ", SoundType.voiced, "bo.wav"),

    _pa("pa", "ぱ", "パ", SoundType.halfVoiced, "pa.wav"),
    _pi("pi", "ぴ", "ピ", SoundType.halfVoiced, "pi.wav"),
    _pu("pu", "ぷ", "プ", SoundType.halfVoiced, "pu.wav"),
    _pe("pe", "ぺ", "ペ", SoundType.halfVoiced, "pe.wav"),
    _po("po", "ぽ", "ポ", SoundType.halfVoiced, "po.wav"),

    _kya("kya", "きゃ", "キャ", SoundType.bend, "kya.wav"),
    _kyu("kyu", "きゅ", "キュ", SoundType.bend, "kyu.wav"),
    _kyo("kyo", "きょ", "キョ", SoundType.bend, "kyo.wav"),

    _sha("sha", "しゃ", "シャ", SoundType.bend, "sha.wav"),
    _shu("shu", "しゅ", "シュ", SoundType.bend, "shu.wav"),
    _sho("sho", "しょ", "ショ", SoundType.bend, "sho.wav"),

    _cha("cha", "ちゃ", "チャ", SoundType.bend, "cha.wav"),
    _chu("chu", "ちゅ", "チュ", SoundType.bend, "chu.wav"),
    _cho("cho", "ちょ", "チョ", SoundType.bend, "cho.wav"),

    _nya("nya", "にゃ", "ニャ", SoundType.bend, "nya.wav"),
    _nyu("nyu", "にゅ", "ニュ", SoundType.bend, "nyu.wav"),
    _nyo("nyo", "にょ", "ニョ", SoundType.bend, "nyo.wav"),

    _hya("hya", "ひゃ", "ヒャ", SoundType.bend, "hya.wav"),
    _hyu("hyu", "ひゅ", "ヒュ", SoundType.bend, "hyu.wav"),
    _hyo("hyo", "ひょ", "ヒョ", SoundType.bend, "hyo.wav"),

    _mya("mya", "みゃ", "ミャ", SoundType.bend, "mya.wav"),
    _myu("myu", "みゅ", "ミュ", SoundType.bend, "myu.wav"),
    _myo("myo", "みょ", "ミョ", SoundType.bend, "myo.wav"),

    _rya("rya", "りゃ", "リャ", SoundType.bend, "rya.wav"),
    _ryu("ryu", "りゅ", "リュ", SoundType.bend, "ryu.wav"),
    _ryo("ryo", "りょ", "リョ", SoundType.bend, "ryo.wav"),

    _gya("gya", "ぎゃ", "ギャ", SoundType.bend, "gya.wav"),
    _gyu("gyu", "ぎゅ", "ギュ", SoundType.bend, "gyu.wav"),
    _gyo("gyo", "ぎょ", "ギョ", SoundType.bend, "gyo.wav"),

    _ja("ja", "じゃ", "ジャ", SoundType.bend, "ja.wav"),
    _ju("ju", "じゅ", "ジュ", SoundType.bend, "ju.wav"),
    _jo("jo", "じょ", "ジョ", SoundType.bend, "jo.wav"),

    _bya("bya", "びゃ", "ビャ", SoundType.bend, "bya.wav"),
    _byu("byu", "びゅ", "ビュ", SoundType.bend, "byu.wav"),
    _byo("byo", "びょ", "ビョ", SoundType.bend, "byo.wav"),

    _pya("pya", "ぴゃ", "ピャ", SoundType.bend, "pya.wav"),
    _pyu("pyu", "ぴゅ", "ピュ", SoundType.bend, "pyu.wav"),
    _pyo("pyo", "ぴょ", "ピョ", SoundType.bend, "pyo.wav");


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

    private static final Map<SoundType, List<JapaneseSyllabary>> japaneseSyllabaryListMap;
    private static final List<JapaneseSyllabary> allVoicedJapaneseSyllabaryList;

    static {
        japaneseSyllabaryListMap = Stream.of(JapaneseSyllabary.values()).collect(Collectors.groupingBy(JapaneseSyllabary::getSoundType));
        allVoicedJapaneseSyllabaryList = new ArrayList<>();
        allVoicedJapaneseSyllabaryList.addAll(japaneseSyllabaryListMap.get(SoundType.voiced));
        allVoicedJapaneseSyllabaryList.addAll(japaneseSyllabaryListMap.get(SoundType.halfVoiced));
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

    public static List<JapaneseSyllabary> getAllJapaneseSyllabaryList() {
        return Arrays.asList(JapaneseSyllabary.values());
    }

    public static List<JapaneseSyllabary> getUnvoicedSyllabaryList() {
        return new ArrayList<>(japaneseSyllabaryListMap.get(SoundType.unvoiced));
    }

    public static List<JapaneseSyllabary> getAllVoicedSyllabaryList() {
        return new ArrayList<>(allVoicedJapaneseSyllabaryList);
    }

    public static List<JapaneseSyllabary> getVoicedSyllabaryList() {
        return new ArrayList<>(japaneseSyllabaryListMap.get(SoundType.voiced));
    }

    public static List<JapaneseSyllabary> getHalfVoicedSyllabaryList() {
        return new ArrayList<>(japaneseSyllabaryListMap.get(SoundType.halfVoiced));
    }

    public static List<JapaneseSyllabary> getBendSyllabaryList() {
        return new ArrayList<>(japaneseSyllabaryListMap.get(SoundType.bend));
    }

    @Override
    public String toString() {
        return "[ " + this.phonetic + " , " + this.hiragana + " , " + this.katakana + " ]";
    }
}
