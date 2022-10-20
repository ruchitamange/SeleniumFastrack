package com.fastrack22;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.fastrack22.keywords.UIkeywords;

public class URLtest {
	
	public static RemoteWebDriver driver;
	
	@Test
	
	public void toVerifyClickOnAssignment() throws InterruptedException{
		
		UIkeywords.openBrowser("Chrome");
		
		UIkeywords.launchURL("https://testingshastra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Assignments']")).click();
		
		Thread.sleep(5000);
		
		UIkeywords.tearDown();
	}

}
