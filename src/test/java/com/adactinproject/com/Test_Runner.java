package com.adactinproject.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adatincon.com.File_Reader_Manager;
import com.automationpratice.Base_Class2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactinfeature//com",
glue="com.adactin.com",
monochrome=true,dryRun=false,
strict=true,
tags = ("@SmokeTest,@SanityTest"),
plugin = {"html:Report/HTML_Report",
"pretty",
"json:Report/CucumberJSON_Report.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport"})
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static  void set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		
		driver=Base_Class2.browserLaunch(browser);

	}

	@AfterClass
	public static void tear_Down() {
		
	//driver.close();

	
	}
}
