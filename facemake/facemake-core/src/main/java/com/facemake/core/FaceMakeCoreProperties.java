package com.facemake.core;

import java.io.IOException;
import java.util.Properties;

/**
 * 类FaceMakeCoreProperties.java的实现描述
 * 
 * @author Administrator 2014年7月26日 下午3:39:33
 */
public class FaceMakeCoreProperties {

    private static final Properties properties = new Properties(); ;

    static {
        try {
            properties.load(FaceMakeCoreProperties.class.getResourceAsStream("/core.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String key) {
        return properties.getProperty(key);
    }

}
