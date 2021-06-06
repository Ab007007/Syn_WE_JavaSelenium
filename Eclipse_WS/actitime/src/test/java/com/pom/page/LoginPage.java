package com.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id = "username")
	WebElement usernameTxtBox;
	
	@FindBy(name = "pwd")
	WebElement passwordTxtBox;
	

	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	@FindBy(xpath = "//span[@class='errormsg']")
	WebElement errorMsg;
	
	public void enterUserName(String un)
	{
		usernameTxtBox.sendKeys(un);
	}
	
	public void enterPassword(String pass)
	{
		passwordTxtBox.sendKeys(pass);
	}
	public void clickonLoginButton()
	{
		loginButton.click();
	}
	
	
	public String getErrorMsg()
	{
		return errorMsg.getText();
	}
	
	public void login(String un, String pwd)
	{
		enterUserName(un);
		enterPassword(pwd);
		clickonLoginButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
