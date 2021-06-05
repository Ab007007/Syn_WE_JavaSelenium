package com.synechron.automation.actitime.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusToolTip {

	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver  = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		String toolTipOfRB = driver.findElement(By.id("redBus")).getAttribute("title");
		String toolTipOfCar = driver.findElement(By.id("cars")).getAttribute("title");
		String toolTipOfRBH = driver.findElement(By.id("redBus Bus Hire")).getAttribute("title");
		
		System.out.println("Tool Tip 1 : " + toolTipOfRB);
		System.out.println("Tool Tip 2 : " + toolTipOfCar);
		System.out.println("Tool Tip 3 : " + toolTipOfRBH);
		
	}
}
