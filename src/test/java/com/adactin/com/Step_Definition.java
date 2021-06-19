  package com.adactin.com;

import org.openqa.selenium.WebDriver;

import com.POM.com.Book_Hotel;
import com.POM.com.BookedItenerary;
import com.POM.com.BookingConfirmtn;
import com.POM.com.Login_P1;
import com.POM.com.SearchHotel;
import com.POM.com.SelectHotel;
import com.adactinproject.com.Test_Runner;
import com.adatincon.com.File_Reader_Manager;
import com.adatincon.com.Page_Object_Manager;
import com.automationpratice.Base_Class2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class2 {

	public static WebDriver driver=Test_Runner.driver;
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	/*public static Login_P1 login=new Login_P1(driver);
	public static SearchHotel search=new SearchHotel(driver);
	public static SelectHotel selct=new SelectHotel(driver);
	public static Book_Hotel bookhtl=new Book_Hotel(driver);
	public static BookingConfirmtn bookcnfrm=new BookingConfirmtn(driver);
	public static BookedItenerary logout=new BookedItenerary(driver);*/	
	//Launch Appln
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		getUrl(url);
		
	}

	//Login
/*	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
		enterValues(pom.getInstance_Login_P1().getUserName(), "vanithaj");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		enterValues(pom.getInstance_Login_P1().getPasswd(), "vanijn");
	}*/
	
	@When("^user Enter The \"([^\"]*)\" Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field(String username) throws Throwable {
		enterValues(pom.getInstance_Login_P1().getUserName(), username);
		
	}

	@When("^user Enter The \"([^\"]*)\" Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field(String password) throws Throwable {
		enterValues(pom.getInstance_Login_P1().getPasswd(), password);
	}


	@Then("^user Click On The Login Button And It Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstance_Login_P1().getLogin());
	}

	//Search Hotel
	@When("^user Select The Location From The Options Of The Dropdown Box$")
	public void user_Select_The_Location_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
		implicitWait(20);
	selectValue(pom.getInstance_SearchHotel().getLocations(), "Sydney");
	implicitWait(10);
	}

	@When("^user Select The Hotel Name From The Options Of The Dropdown Box$")
	public void user_Select_The_Hotel_Name_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
         implicitWait(10);
		selectValue(pom.getInstance_SearchHotel().getHotels(), "Hotel Creek");
	
	}

	@When("^user Select The Room Type From The Options Of The Dropdown Box$")
	public void user_Select_The_Room_Type_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
	      implicitWait(20);
		selectValue(pom.getInstance_SearchHotel().getRoomType(), "Double");
	}

	@When("^user Select The Number Of Rooms From The Options Of The Dropdown Box$")
	public void user_Select_The_Number_Of_Rooms_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
	      implicitWait(10);

	  selectValue(pom.getInstance_SearchHotel().getNoOfRooms(), "2");
	}

	@When("^user Enter The Check In Date In The  Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
	      implicitWait(10);

	  enterValues(pom.getInstance_SearchHotel().getCheckIn(), "15/06/2021");
	}

	@When("^user Enter The Check Out Date In The  Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
	      implicitWait(10);

	  enterValues(pom.getInstance_SearchHotel().getCheckOut(), "16/06/2021");
	}

	@When("^user Select The Adults Per Room From The Options Of The Dropdown Box$")
	public void user_Select_The_Adults_Per_Room_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
	      implicitWait(10);

	   selectValue(pom.getInstance_SearchHotel().getAdultsRoom(), "2");
	
	}

	@When("^user Select The Children Per Room From The Options Of The Dropdown Box$")
	public void user_Select_The_Children_Per_Room_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
	      implicitWait(20);

	  selectValue(pom.getInstance_SearchHotel().getChildrensRoom(), "2");
	}

	@Then("^user Click On The Search Button And It Navigate To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
	      implicitWait(10);

	  clickOnElement(pom.getInstance_SearchHotel().getSearchSubmit());
	
	}

	//Select Hotel
	@When("^user Click The Radio Button To The Select The Hotel For Booking$")
	public void user_Click_The_Radio_Button_To_The_Select_The_Hotel_For_Booking() throws Throwable {
	
		implicitWait(5);
	  clickOnElement(pom.getInstance_SelectHotel().getSelectButton());
		implicitWait(5);

	}

	@Then("^user Click The Continue Button And It Navigate to The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigate_to_The_Book_A_Hotel_Page() throws Throwable {
		implicitWait(10);

	clickOnElement(pom.getInstance_SelectHotel().getClkContinue());
	implicitWait(10);

	}
	//Book A Hotel

	@When("^user Enter the First Name In The First Name Field$")
	public void user_Enter_the_First_Name_In_The_First_Name_Field() throws Throwable {
		implicitWait(10);

		enterValues(pom.getInstance_Book_Hotel().getFirstName(), "Vanitha");
	
	}

	@When("^user Enter The Last Name in The Last Name Field$")
	public void user_Enter_The_Last_Name_in_The_Last_Name_Field() throws Throwable {
	
		implicitWait(10);

		enterValues(pom.getInstance_Book_Hotel().getLastName(), "Raman");
	
	}

	@When("^user Enter The Billig Address In The Billing Address Field$")
	public void user_Enter_The_Billig_Address_In_The_Billing_Address_Field() throws Throwable {
	
		implicitWait(10);

	 enterValues(pom.getInstance_Book_Hotel().getAddress(), "chennai");
	}

	@When("^user Enter The Credit Card No In The Credit Card Field$")
	public void user_Enter_The_Credit_Card_No_In_The_Credit_Card_Field() throws Throwable {
		
		String creditcardno = File_Reader_Manager.getInstance().getInstanceCR().credit_CardNo();
    
		implicitWait(20);

		enterValues(pom.getInstance_Book_Hotel().getCreditCard(), creditcardno);
	
		}

	@When("^user Select The Credit Card Type From The Options Of The Dropdown Box$")
	public void user_Select_The_Credit_Card_Type_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
	
	
		implicitWait(20);

		selectValue(pom.getInstance_Book_Hotel().getCardType(),"VISA");
		implicitWait(10);
	
	//  selectDrop(bookhtl.getCardType(), "American Express");
	}

	@When("^user Select The Month In The Expiry Date Field From The Options Of The Dropdown Box$")
	public void user_Select_The_Month_In_The_Expiry_Date_Field_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
	
		String expirymonth = File_Reader_Manager.getInstance().getInstanceCR().expiry_Month();
		implicitWait(10);

	   selectValue(pom.getInstance_Book_Hotel().getCardExpiry(), expirymonth);
	
	}

	@When("^user Select The Year In The Expiry Date Field From The Options Of The Dropdown Box$")
	public void user_Select_The_Year_In_The_Expiry_Date_Field_From_The_Options_Of_The_Dropdown_Box() throws Throwable {
	
	  	String expiryyear = File_Reader_Manager.getInstance().getInstanceCR().expiry_Year();
		implicitWait(10);

	selectValue(pom.getInstance_Book_Hotel().getCardExpiryYear(), expiryyear);
	
	}

	@When("^user Enter The CVV Number In The  CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
	
		String cvvno = File_Reader_Manager.getInstance().getInstanceCR().cvv_No();
		implicitWait(10);

	enterValues(pom.getInstance_Book_Hotel().getCvNo(), cvvno);
	
	}

	@Then("^user Click The Book Now Button And It Navigate To The Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
	
		implicitWait(10);

	clickOnElement(pom.getInstance_Book_Hotel().getClkBook());
		
	}

	//Booking Confirmation
	@Then("^user Click The My Itinerary Button And It Navigate To The Booked Itinerary Page$")
	public void user_Click_The_My_Itinerary_Button_And_It_Navigate_To_The_Booked_Itinerary_Page() throws Throwable {
	
	
		implicitWait(10);

	  clickOnElement(pom.getInstance_BookingConfirmtn().getMyItinerary());
	
	}

	//Logout
	@Then("^user Click The Any Of The Options Or Logout And It Navigate To The Modification Or To The Logout Of The Page$")
	public void user_Click_The_Any_Of_The_Options_Or_Logout_And_It_Navigate_To_The_Modification_Or_To_The_Logout_Of_The_Page() throws Throwable {
	
		implicitWait(10);

	clickOnElement(pom.getInstance_BookedItenerary().getLogout());
	
	
	}


	
}
