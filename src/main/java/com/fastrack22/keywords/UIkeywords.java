package com.fastrack22.keywords;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * These 
 * @author mangeruc
 *
 */

public class UIkeywords {
	
	public static RemoteWebDriver driver;
	public static void openBrowser (String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Enter valid browser name");
		}
		
		System.out.println(browserName + "browser launched successfully");
	}
	
	public static void launchURL(String url) {
		System.out.println(url + "url is launched successfully");
		
	}
	public static void tearDown() {
		driver.close();
		System.out.println("Browser closed successfully");
	}
	
	public static void getTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	
}
