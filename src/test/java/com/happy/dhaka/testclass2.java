package com.happy.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testclass2 {

	@Test
	public void tom() throws Exception {
		
		// setting up system
		System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
		ChromeOptions chromee = new ChromeOptions();
		chromee.addArguments("--remote-allow-origins=*");//security allow
					
	WebDriver driver = new ChromeDriver();   //creating object of webdriver
	//get() is launching our browser
	driver.get("https://www.dell.com/en-us");
					
		driver.manage().window().maximize();
	//2 methods for closing window
	//close(); is going to close the current window/facing window
	//quit();  is closing multiple window
	//we can give some manual wait...we order webdriver wait 10 second before close the window
					
		WebElement t = driver.findElement(By.id("mh-search-input")); //locator of the web elements			
		t.sendKeys("Monitor");	
		
		WebElement k = driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[1]/div[2]/div/button[2]"));
		k.click();
		
		Thread.sleep(10000);
		driver.close();	
						
		
		
		
		
	}
	
	
	
	
	
	
}
