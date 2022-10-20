package com.fastrack22.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtol {
	
	public String getValue(String filepath, String key) {
		
		FileInputStream fis = null;
		try {
		fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.err.println("File Not Found" + filepath);
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			System.err.println("Unable to load properties file" + filepath);
		}
		
		return prop.getProperty(key);
	}
	
//	
//	This method can be use on OR.prperties files only
//	@param key for which we want the locator
//	@retuen the locator value in the form of string
//	
	public String getLocator(String key) {
		String baseDir = System.getProperty("user.dir");//this return the current user working directory i.e. path till Fastrack22
		getValue(baseDir+"\\src\\main\\resources\\OR.properties",key);//baseDir = C:\Users\mangeruc\eclipse-workspace\Fastrack22
		return key;
		
	}
	
	public String getURL(String key) {
		String baseDir = System.getProperty("user.dir");//this return the current user working directory i.e. path till Fastrack22
		getValue(baseDir+"\\src\\main\\resources\\Environment.Properties",key);//baseDir = C:\Users\mangeruc\eclipse-workspace\Fastrack22
		return key;

}
