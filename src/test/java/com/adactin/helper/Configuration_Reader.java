package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\adacin\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		p.load(fis);
			}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}
	
	public String getUrl() {
		String url = p.getProperty("Url");
		return url;
	}

}
