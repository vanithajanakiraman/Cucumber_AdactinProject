package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='hotel_name_dis']")
	private WebElement hotelName;
	
	@FindBy(xpath="//input[@id='location_dis']")
	private WebElement location;
	
	@FindBy(xpath="//input[@id='room_type_dis']")
	private WebElement room_Type;
	 
	@FindBy(xpath="//input[@id='room_num_dis']")
	private WebElement room_No;
	
	@FindBy(xpath="//input[@id='room_num_dis']")
	private WebElement noOfRooms;
	
	@FindBy(xpath="//input[@id='total_days_dis']")
	private WebElement totalDays;

	@FindBy(xpath="//input[@id='price_night_dis']")
	private WebElement chargePerNight;

	@FindBy(xpath="//input[@id='total_price_dis']")
	private WebElement totalCost;

	@FindBy(xpath="//input[@id='gst_dis']")
	private WebElement  gstCost; 

	@FindBy(xpath="//input[@id='final_price_dis']")
	private WebElement finalBill;

	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditCard;

	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement cardType;

	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement cardExpiry;

	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement cardExpiryYear;

	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvNo;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement clkBook;



	public Book_Hotel(WebDriver driver2) {
     this.driver=driver2;
     PageFactory.initElements(driver2, this);
     
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getRoom_No() {
		return room_No;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getTotalDays() {
		return totalDays;
	}

	public WebElement getChargePerNight() {
		return chargePerNight;
	}

	public WebElement getTotalCost() {
		return totalCost;
	}

	public WebElement getGstCost() {
		return gstCost;
	}

	public WebElement getFinalBill() {
		return finalBill;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpiry() {
		return cardExpiry;
	}

	public WebElement getCardExpiryYear() {
		return cardExpiryYear;
	}

	public WebElement getCvNo() {
		return cvNo;
	}

	public WebElement getClkBook() {
		return clkBook;
	}

	}
