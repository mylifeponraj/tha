package org.or5e.tha.core;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    private static Properties _props;
    static {
        _props = new Properties();
        try {
            _props.load(new FileReader("C:\\Users\\suthap\\2021-Project\\Application\\conf\\application.conf"));
            System.out.println("Properties Loaded...");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Applicaiton Starting..."+_props.getProperty("email"));
    }

    @Override
    public String toString() {
        return "AppConfig []";
    }
}

