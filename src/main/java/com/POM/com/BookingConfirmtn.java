package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmtn {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement searchHotel;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myItinerary;
	
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logout;

	
	
	public BookingConfirmtn(WebDriver driver2) {
     this.driver=driver2;
     PageFactory.initElements(driver2, this);
	
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getSearchHotel() {
		return searchHotel;
	}


	public WebElement getMyItinerary() {
		return myItinerary;
	}


	public WebElement getLogout() {
		return logout;
	}


	
}
