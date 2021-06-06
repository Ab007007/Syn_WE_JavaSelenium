package com.synechron.automation.actitime.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserHandling 
{
	
	public static void main(String[] args) throws InterruptedException {
		//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/errors.html#");
		driver.findElement(By.linkText("Contact Us")).click();
	
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String>  it =  windowIds.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent Window id " + parentWindowID);
		System.out.println("Child Window id " + childWindowID);
		driver.switchTo().window(childWindowID);
		Thread.sleep(3000);
		List<WebElement> emailIDs = driver.findElements(By.tagName("a"));
		for (WebElement emailID : emailIDs) {
			System.out.println(emailID.getText());
		}
		//driver.close();
		Thread.sleep(3000);
			
		System.out.println("--switching back to parent---");
		driver.switchTo().window(parentWindowID);
		Thread.sleep(3000);
				
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		for (WebElement hyperlink : hyperlinks) {
			System.out.println(hyperlink.getText());
		}
		
		//driver.close();
		driver.quit();
	}

}
