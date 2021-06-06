package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synechron.automation.actitime.util.GlobalDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateMultipleCustomerTest
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

	@Parameters({"url", "username", "password"})
	@BeforeClass
	public void launchApplication(String url, String un, String pwd)
	{
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
		Assert.assertEquals(driver.getTitle(), "actiTIME - Task List");
	}
	
	
	@Test(dataProvider = "createcustomerdata", dataProviderClass = TestData.class)
	public void createCustomer(String cn, String cd)
	{

		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Success Message : " + ele.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(ele));
		

	}
	@AfterClass
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
}
