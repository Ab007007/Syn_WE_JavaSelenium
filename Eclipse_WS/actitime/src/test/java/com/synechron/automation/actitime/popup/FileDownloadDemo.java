package com.synechron.automation.actitime.popup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadDemo {

	
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("D:\\Synechron_WE_JavaSelenium\\Eclipse_WS\\actitime\\autoit\\fileupload.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://formy-project.herokuapp.com/fileupload");
		driver.findElement(By.id("file-upload-field")).click();
		
		
	
	}
}
