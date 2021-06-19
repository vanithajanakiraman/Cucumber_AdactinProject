package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
  
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectButton;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement  clkContinue ;
	
	
	public SelectHotel(WebDriver driver2) {
     this.driver=driver2;
     PageFactory.initElements(driver2, this);
	
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getClkContinue() {
		return clkContinue;
	}

	
	
}
