package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logout;

	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}

	
}
