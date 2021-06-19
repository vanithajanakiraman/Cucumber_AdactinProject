package com.adatincon.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
	
	public Configuration_Reader() throws Throwable {
    
File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\newproject\\src\\test\\java\\com\\adactin\\helper\\Configuration.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
	    p=new Properties();
	    
	    p.load(fis);
	
	}
	
	public String get_Browser()
	{
		String browser = p.getProperty("browser");
		return browser;
	}

	
	public String get_Url()
	{
		String url = p.getProperty("url");
		return url;
	}
	
	
	public String credit_CardNo()
	{
		String crcdno = p.getProperty("creditcardno");
		
		return crcdno;
	}
	
	public String expiry_Month() {
		
		String exmonth = p.getProperty("expirymonth");
		return exmonth;
	}
	
	public String expiry_Year()
	{
		String exyear = p.getProperty("expiryyear");
		return exyear;
	}
	
	public String cvv_No()
	{
		String cvvno = p.getProperty("cvvno");
		return cvvno;
		
	}
	
}
