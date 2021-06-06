package com.synechron.automation.actitime.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovementDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		ele.click();		
		
		
		WebElement electronicsModule = driver.findElement(By.xpath("//div[text()='Electronics']"));
		WebElement fashionModule = driver.findElement(By.xpath("//div[text()='Fashion']"));
		WebElement homeModule = driver.findElement(By.xpath("//div[text()='Home']"));
		WebElement appliancesModule = driver.findElement(By.xpath("//div[text()='Appliances']"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(electronicsModule).perform();
		Thread.sleep(3000);
		act.moveToElement(fashionModule).perform();
		Thread.sleep(3000);
		act.moveToElement(appliancesModule).perform();
		Thread.sleep(3000);
		act.moveToElement(homeModule).perform();
		Thread.sleep(3000);
		
		
		driver.close();
		
	}
}
