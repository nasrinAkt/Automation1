package com.happy.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testclass {

	@Test
	public void happy() throws Exception {
		
		// setting up system
		System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
			ChromeOptions chromee = new ChromeOptions();
			chromee.addArguments("--remote-allow-origins=*");//security allow
			
			WebDriver driver = new ChromeDriver();   //creating object of webdriver
			//get() is launching our browser
			driver.get("https://www.amazon.com/");
			
			driver.manage().window().maximize();
			//2 methods for closing window
			//close(); is going to close the current window/facing window
			//quit();  is closing multiple window
			//we can give some manual wait...we order webdriver wait 10 second before close the window
			
			WebElement h = driver.findElement(By.id("twotabsearchtextbox"));
			h.sendKeys("iphone 14 pro max");
			
		   WebElement t = driver.findElement(By.id("nav-search-submit-button"));
		   t.click();
		   
		  
		   
			Thread.sleep(10000);
			driver.close();	
			
		
	}
	
	
	
	
}
