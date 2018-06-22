package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Clipboard;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class FileUploadUsingSikuli {

	public static void main(String[] args) throws FindFailed {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/image_upload/index.php");
		driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
		String file="C:\\Users\\Mahesh Nukala\\Documents\\";
		/*Screen s = new Screen();
		Pattern filepath= new Pattern(file+"filepath.PNG");
		Pattern openBtn=new Pattern(file+"OpenBtn.PNG");
		Region r=s.find("Region.PNG");
		s.type(filepath,file +"Abstract step defination class.txt");
		s.wait(filepath, 20);
		r.find(openBtn).click();*/
		ImagePath.add("C:\\Users\\Mahesh Nukala\\SandhyaWorkspace\\DemoRepo");
		
		String[] paths = ImagePath.getImagePath();
		for (String path : paths) {
		    System.out.println(path);
		}
		String image="Mahesh is learning sikli";
		
		Clipboard.putText(image);
	Clipboard.getSystemClipboard();
		

	}

}
