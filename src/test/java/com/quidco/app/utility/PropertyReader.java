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

    public static final Properties prop = new Properties();
    public static InputStream inputStream = null;

    PropertyReader() {

    }

    public static Properties getPropertyReader() {
        if (prop.size() == 0) {
            try {
                inputStream = new FileInputStream(System.getProperty("user.dir")
                        + "/target/classes/config.properties");
                prop.load(inputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop;

    }

}
