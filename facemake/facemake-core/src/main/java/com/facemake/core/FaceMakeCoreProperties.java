package com.facemake.core;

import java.io.IOException;
import java.util.Properties;

public class FaceMakeCoreProperties {
	
	private static final Properties properties  = new Properties() ;;
	
	static{
		try {
			properties.
			load(FaceMakeCoreProperties.class.getResourceAsStream("/core.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public static String getProperties(String key){
		return properties.getProperty(key) ;
	}
	
}
