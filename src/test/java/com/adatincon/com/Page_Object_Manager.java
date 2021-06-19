package com.adatincon.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.POM.com.Book_Hotel;
import com.POM.com.BookedItenerary;
import com.POM.com.BookingConfirmtn;
import com.POM.com.Login_P1;
import com.POM.com.SearchHotel;
import com.POM.com.SelectHotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login_P1 login;
	private SearchHotel search;
	private SelectHotel selct;
	private Book_Hotel bookhtl;
	private  BookingConfirmtn bookcnfrm;
	private BookedItenerary logout;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
         PageFactory.initElements(driver2, this);		
	}
	
	public Login_P1 getInstance_Login_P1()
	{
		login=new Login_P1(driver);
		return login;
	}
	
	public SearchHotel getInstance_SearchHotel()
	{
		search=new SearchHotel(driver);
		return search;
	}
	
	
	public SelectHotel getInstance_SelectHotel() {
	
		selct=new SelectHotel(driver);
		return selct;

}
	
	public Book_Hotel getInstance_Book_Hotel() {
		
		bookhtl=new Book_Hotel(driver);
		return bookhtl;

	}

	public BookingConfirmtn getInstance_BookingConfirmtn() {
		
		bookcnfrm=new BookingConfirmtn(driver);
		return bookcnfrm;

	}

	public BookedItenerary getInstance_BookedItenerary() {
		
		logout=new BookedItenerary(driver);
		
		return logout;

	}

	
}
