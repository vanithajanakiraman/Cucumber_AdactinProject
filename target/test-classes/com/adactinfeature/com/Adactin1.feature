Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario Outline:Adactin

Given user Launch The Application
When user Enter The "<Username>" Username In Username Field
And user Enter The "<Password>" Password In Password Field
Then user Click On The Login Button And It Navigate To The Search Hotel Page

Examples:
|Username|Password|
|AAA|abc123|
|vanithaj|vanijn|

@SanityTest
Scenario:

When user Select The Location From The Options Of The Dropdown Box
And user Select The Hotel Name From The Options Of The Dropdown Box
And user Select The Room Type From The Options Of The Dropdown Box
And user Select The Number Of Rooms From The Options Of The Dropdown Box
And user Enter The Check In Date In The  Check In Date Field
And user Enter The Check Out Date In The  Check Out Date Field
And user Select The Adults Per Room From The Options Of The Dropdown Box
And user Select The Children Per Room From The Options Of The Dropdown Box
Then user Click On The Search Button And It Navigate To The Select Hotel Page

@SanityTest
Scenario:

When user Click The Radio Button To The Select The Hotel For Booking
Then user Click The Continue Button And It Navigate to The Book A Hotel Page

@SanityTest
Scenario:

When user Enter the First Name In The First Name Field
And user Enter The Last Name in The Last Name Field
And user Enter The Billig Address In The Billing Address Field
And user Enter The Credit Card No In The Credit Card Field
And user Select The Credit Card Type From The Options Of The Dropdown Box
And user Select The Month In The Expiry Date Field From The Options Of The Dropdown Box
And user Select The Year In The Expiry Date Field From The Options Of The Dropdown Box
And user Enter The CVV Number In The  CVV Number Field
Then user Click The Book Now Button And It Navigate To The Booking Confirmation Page

@sanityTest
Scenario:

Then user Click The My Itinerary Button And It Navigate To The Booked Itinerary Page

@SanityTest
Scenario:

Then user Click The Any Of The Options Or Logout And It Navigate To The Modification Or To The Logout Of The Page