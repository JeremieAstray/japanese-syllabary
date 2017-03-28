package com.jeremie.springfx.loader;

import javafx.fxml.FXMLLoader;
import javafx.util.BuilderFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ResourceBundle;

/**
 * Created by jeremie on 15/5/8.
 */
public class SpringFxmlLoader extends FXMLLoader {

    public static final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static <T> T load(URL location) throws IOException {
        return load(location, null);
    }

    public static <T> T load(URL location, ResourceBundle resources)
            throws IOException {
        return load(location, resources, null);
    }

    public static <T> T load(URL location, ResourceBundle resources,
                             BuilderFactory builderFactory)
            throws IOException {
        return load(location, resources, builderFactory, Charset.forName(DEFAULT_CHARSET_NAME));
    }

    public static <T> T load(URL location, ResourceBundle resources,
                             BuilderFactory builderFactory,
                             Charset charset) throws IOException {
        return FXMLLoader.load(location, resources, builderFactory, applicationContext::getBean, charset);
    }

}