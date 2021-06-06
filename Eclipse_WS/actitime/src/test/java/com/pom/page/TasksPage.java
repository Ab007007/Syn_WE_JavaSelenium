package com.pom.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.synechron.automation.actitime.util.GlobalDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TasksPage
{
	
	WebDriver driver;
	LoginPage lp ;
	DashboardPage dp ;
	
	
	@BeforeTest
	public void createdriver()	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(GlobalDataReader.getGlobalData("timeout")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void getPageObjects()
	{
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
		
	}
	
	@BeforeMethod
	public void launch()
	{
		driver.get(GlobalDataReader.getGlobalData("url"));
	}
	@Test(priority = 1)
	public void validLoginTest()
	{
		lp.login("admin", "manager");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		dp.logout();
	}
	
	@Test(priority = 2)
	public void invalidLoginTest()
	{
		lp.login("admin1", "manager1");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		Assert.assertEquals("Username or Password is invalid. Please try again.",lp.getErrorMsg());
	}
	
	
	@AfterClass
	public void clearPageObjectes()
	{
		lp = null;
		dp = null;
				
	}
	
	
	
	
	
	
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}

}
