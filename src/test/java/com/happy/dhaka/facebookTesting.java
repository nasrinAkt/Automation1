package com.happy.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class facebookTesting {

@Test	
	
	public void testingSoftware() throws Exception {
	
	System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
	
	ChromeOptions lucky = new ChromeOptions();
	lucky.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("abcde123");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("123456");
	
	WebElement login  = driver.findElement(By.name("login"));
	login.click();
	
	Thread.sleep(20000);
	driver.close();
}
	
	
	
}
