package com.qa.tests;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class YoutubeVideoTest {
	
	@Test
	public void testYoutubeWithSikuli() throws FindFailed{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Sikuli functions
		
		Screen s= new Screen();
		
		Pattern pauseImg= new Pattern("PauseImage.PNG");
		s.wait(pauseImg,4000);
		s.click();
		s.click();
		
	}

}
