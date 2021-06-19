package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement locations;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noOfRooms;

		
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOut;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultsRoom;
	
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childrensRoom;
	
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement clkSubmit;
	

	
	public SearchHotel(WebDriver driver2) {
      this.driver=driver2;
      PageFactory.initElements(driver2, this);
	
	
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getLocations() {
		return locations;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomType() {
		return roomType;
	}


	public WebElement getNoOfRooms() {
		return noOfRooms;
	}


	public WebElement getCheckIn() {
		return checkIn;
	}


	public WebElement getCheckOut() {
		return checkOut;
	}


	public WebElement getAdultsRoom() {
		return adultsRoom;
	}


	public WebElement getChildrensRoom() {
		return childrensRoom;
	}


	public WebElement getSearchSubmit() {
		return clkSubmit;
	}


	}
