package com.synechron.automation.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.automation.actitime.util.GlobalDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerUsingxternalData {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(GlobalDataReader.getGlobalData("timeout")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(GlobalDataReader.getGlobalData("url"));
		driver.findElement(By.id("username")).sendKeys(GlobalDataReader.getGlobalData("username"));
		driver.findElement(By.name("pwd")).sendKeys(GlobalDataReader.getGlobalData("password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("My Customer-2");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("My Customer-Desc-2");
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Success Message : " + ele.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(ele));
		
		driver.findElement(By.id("logoutLink")).click();
		System.out.println();
		
		
	}
}
