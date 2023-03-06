package com.halcom.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.UUID;

public class Properties {
    public static String mPayClientPropertyFile = System.getProperty("user.dir") + "/src/main/resources/MPayClient.properties";
    public static long TIMEOUT_FOR_ELEMENT_TO_APPEAR = Long.parseLong(getPropertyValue("TIMEOUT_FOR_ELEMENT_TO_APPEAR", mPayClientPropertyFile));
    public static boolean robotThreadStarted = false;
    public static String getPropertyValue(String property, String propertyFile) {
        String value = null;

        try {
            java.util.Properties properties = new java.util.Properties();
            FileInputStream file = new FileInputStream(propertyFile);
            properties.load(file);
            value = properties.getProperty(property).trim();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
}
