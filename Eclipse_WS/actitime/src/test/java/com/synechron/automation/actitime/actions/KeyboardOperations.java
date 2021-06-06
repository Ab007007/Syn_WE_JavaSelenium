package com.synechron.automation.actitime.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();

		
		WebDriverManager.chromedriver().setup(); //browserVersion("90.0.4430.24").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		Actions act =  new Actions(driver);
		act.sendKeys("Synechron").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
	
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
	
		driver.close();
	}
}
