	package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader1 {
    private Properties properties;
    
    public ConfigReader1(String configFilePath) {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(configFilePath);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String getProperty(String url) {
        return properties.getProperty(url);
    }
}



