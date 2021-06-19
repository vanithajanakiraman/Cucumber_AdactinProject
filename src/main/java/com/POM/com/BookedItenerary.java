package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItenerary {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath="//input[@value='425588']")
	private WebElement clkCheckBox;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement clkCancel;

	
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement clkSearch;

	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logout;

	
	public BookedItenerary(WebDriver driver2) {
      this.driver=driver;
      PageFactory.initElements(driver2, this);
	
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getClkCheckBox() {
		return clkCheckBox;
	}


	public WebElement getClkCancel() {
		return clkCancel;
	}


	public WebElement getClkSearch() {
		return clkSearch;
	}


	public WebElement getLogout() {
		return logout;
	}


	

}
