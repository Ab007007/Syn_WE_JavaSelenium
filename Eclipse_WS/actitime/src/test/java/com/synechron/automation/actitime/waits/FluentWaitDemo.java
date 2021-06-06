package com.synechron.automation.actitime.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Synechron_WE_JavaSelenium/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();
		
		//STEP1
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
				
		//STEP2
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			public Boolean apply(WebElement input) {
				Boolean flag = false;
				if(input.getText().equals("Hello"))
				{
					System.out.println("Found!!!!");
					flag = true;
				}
				else
				{
					System.out.println("Waiting!!!!!");
					flag = false;
				}
				return flag;
			}
		};
		
		//STEP3
		wait.until(fun);
	
		
		
		String text1 = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();
		System.out.println(text1);
		System.out.println(text2);
	}

}
