$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin1.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cUsername\u003e\" Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cPassword\u003e\" Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;adactin;;1"
    },
    {
      "cells": [
        "AAA",
        "abc123"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;adactin;;2"
    },
    {
      "cells": [
        "vanithaj",
        "vanijn"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;adactin;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"AAA\" Username In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"abc123\" Password In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4440608100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 204254500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 114836000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 675458700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"vanithaj\" Username In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"vanijn\" Password In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 369334500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vanithaj",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 97246200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vanijn",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 86255000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1060372500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Select The Location From The Options Of The Dropdown Box",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Select The Hotel Name From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Room Type From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Number Of Rooms From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Check In Date In The  Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Enter The Check Out Date In The  Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Adults Per Room From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select The Children Per Room From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Click On The Search Button And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 152215800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_Name_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 125313400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 102577100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 105353500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field()"
});
formatter.result({
  "duration": 74430100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 74151100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adults_Per_Room_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 101971000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 105959600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 733011300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Click The Radio Button To The Select The Hotel For Booking",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Click The Continue Button And It Navigate to The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Radio_Button_To_The_Select_The_Hotel_For_Booking()"
});
formatter.result({
  "duration": 67810600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_And_It_Navigate_to_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 854548500,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user Enter the First Name In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Last Name in The Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Billig Address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter The Credit Card No In The Credit Card Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select The Credit Card Type From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Select The Month In The Expiry Date Field From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Select The Year In The Expiry Date Field From The Options Of The Dropdown Box",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enter The CVV Number In The  CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Click The Book Now Button And It Navigate To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_First_Name_In_The_First_Name_Field()"
});
formatter.result({
  "duration": 98082500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_in_The_Last_Name_Field()"
});
formatter.result({
  "duration": 83265900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billig_Address_In_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 84738600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_No_In_The_Credit_Card_Field()"
});
formatter.result({
  "duration": 88620000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 130367500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month_In_The_Expiry_Date_Field_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 127609200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Year_In_The_Expiry_Date_Field_From_The_Options_Of_The_Dropdown_Box()"
});
formatter.result({
  "duration": 98728000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CVV_Number_In_The_CVV_Number_Field()"
});
formatter.result({
  "duration": 76214500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 66166300,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 53,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 56,
  "name": "user Click The Any Of The Options Or Logout And It Navigate To The Modification Or To The Logout Of The Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Any_Of_The_Options_Or_Logout_And_It_Navigate_To_The_Modification_Or_To_The_Logout_Of_The_Page()"
});
formatter.result({
  "duration": 6289308100,
  "status": "passed"
});
});