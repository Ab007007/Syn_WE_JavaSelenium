package com.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.synechron.automation.actitime.util.GlobalDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AugoSuggestions {

	
	WebDriver driver = null;
	
	@BeforeTest
	public void createDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}

	@BeforeClass
	public void launchApplication()
	{
		driver.get("http://www.google.com");
		
	}

	@Test
	public void printAutoSuggestions() 
	{
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']"));
		
		System.out.println("Total suggesitons " + autoSuggestions.size());
		for (WebElement autoSuggestion : autoSuggestions) 
		{
			Reporter.log(autoSuggestion.getText() + "<br>");
		}
		

	}
	
	
}
