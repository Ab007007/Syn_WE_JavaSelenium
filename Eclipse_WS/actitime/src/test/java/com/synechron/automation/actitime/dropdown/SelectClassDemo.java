package com.synechron.automation.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		driver.findElement(By.id("last-name")).sendKeys("H");
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		Select yearOfExp = new Select(driver.findElement(By.id("select-menu")));
		
		yearOfExp.selectByIndex(3);   //5-9
		Thread.sleep(2000);
		
		yearOfExp.selectByValue("4");   //10+
		Thread.sleep(2000);
		
		yearOfExp.selectByVisibleText("0-1");  //10+
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Submit")).click();
		
		Thread.sleep(2000);
		
		String successMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		
		System.out.println("Sussess message " + successMessage);
		
		
	}
}
