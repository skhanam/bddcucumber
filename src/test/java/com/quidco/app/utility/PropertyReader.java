package com.quidco.app.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ashishmohindroo on 11/11/16.
 */
public class PropertyReader {

    public static Properties prop = new Properties();

    PropertyReader() {

    }

    public static Properties getPropertyReader() {
        if (prop.size() == 0) {
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(System.getProperty("user.dir")
                        + "/target/classes/config.properties");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                prop.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop;

    }

}
