package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_P1 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwd;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
		


	public Login_P1(WebDriver driver2) {
     this.driver=driver2;
     //pageFactory
     PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLogin() {
		return login;
	}

	}
