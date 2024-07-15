package com.afw.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
	
    public static Properties loadProperties(String filePath) {
    	
        Properties properties = new Properties();
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}