package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    static { //it will be executed first.
        try {
            String filePath = "configuration.properties";
            FileInputStream fileInputStream = new FileInputStream(filePath); //to read configuration file
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("File Couldn't Be Found");
        } catch (IOException e) {
            System.out.println("File Couldn't Be Load From Properties File");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    } //java oop-- encpsulation

    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }
}
