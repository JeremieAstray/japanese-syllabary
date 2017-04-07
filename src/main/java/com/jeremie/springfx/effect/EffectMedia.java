package com.jeremie.springfx.effect;

import javafx.scene.media.AudioClip;
import org.apache.commons.lang3.StringUtils;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class EffectMedia {

    private static volatile AudioClip effect;
    private static Map<String, AudioClip> effects = new HashMap<>();

    public static void stop() {
        if (effect != null) {
            effect.stop();
        }
    }

    public static synchronized boolean play(URL url) {
        if (url == null || StringUtils.isBlank(url.toString())) {
            return false;
        }
        String path = url.toString();
        if (!effects.containsKey(path)) {
            effects.put(path, new AudioClip(path));
        }
        effect = effects.get(path);
        effect.play();
        return true;
    }

    public static boolean isPlaying() {
        return effect != null && effect.isPlaying();
    }

    public static void setVolume(int value) {
        for (AudioClip effect1 : effects.values()) {
            effect1.setVolume(value * 1.0 / 5);
        }
    }
}
