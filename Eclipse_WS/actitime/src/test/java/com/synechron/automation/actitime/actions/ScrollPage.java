package com.synechron.automation.actitime.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage {
	
//	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://makemytrip.com/");
		driver.findElement(By.xpath("//li[@data-cy='menu_Holidays']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search_button")).click();
		Actions act  =  new Actions(driver);
		
		for (int i = 0; i <10; i++) {
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(5000);
			System.out.println("Count : " + i);
		}
	}
	

}
