package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumCommands {
	
	public WebDriver driver;
	
	@Test
	public void testSeleniumCommands(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		
			
			 
			driver.get("https://www.facebook.com");
			WebElement txtUserName = driver.findElement(By.id("email"));
			 
			Actions builder = new Actions(driver);
			Action seriesOfActions = builder.moveToElement(txtUserName)
			 .click()
			 .keyDown(txtUserName, Keys.SHIFT)
			 .sendKeys(txtUserName,"fnjdfjd")
			 .keyUp(txtUserName, Keys.SHIFT)
			 .doubleClick(txtUserName)
			 .doubleClick()
			 .build();
			
			 seriesOfActions.perform();
			 driver.findElement(By.id("pass")).sendKeys("absdedfr");
			 System.out.println("logged in success");
			}
		
		}


