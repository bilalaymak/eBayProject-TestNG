package util;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //    creating Properties object
    private static Properties properties;
    //    creating a static bloc to run FIRST
    static {
//        path of properties file
        String path = "testData/Config.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //creating a method that will accept a key and returns the value
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

//    @Test
//    public void testName() {
//        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));//I took from configuration,properties file
//        Driver.closeDriver();
//        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
//    }


    }
