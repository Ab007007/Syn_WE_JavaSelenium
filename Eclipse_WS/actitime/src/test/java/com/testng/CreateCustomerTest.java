package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.synechron.automation.actitime.util.GlobalDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerTest
{
	WebDriver driver = null;
	
	@BeforeTest
	public void createDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(GlobalDataReader.getGlobalData("timeout")), TimeUnit.SECONDS);
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
		driver.get(GlobalDataReader.getGlobalData("url"));
		
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys(GlobalDataReader.getGlobalData("username"));
		driver.findElement(By.name("pwd")).sendKeys(GlobalDataReader.getGlobalData("password"));
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void createCustomer()
	{

		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("My Customer-5");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("My Customer-Desc-5");
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Success Message : " + ele.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(ele));
		

	}
	
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
}
