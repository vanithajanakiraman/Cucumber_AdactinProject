package com.adatincon.com;

public class File_Reader_Manager {
	
	private File_Reader_Manager()
	{
		//object restriction
	}

	
	public Configuration_Reader getInstanceCR() throws Throwable
	{
		Configuration_Reader reader=new Configuration_Reader();
		
		//reader.get_Broowser();
		//reader.get_Url();
		return reader;
	}
	
	
	public static  File_Reader_Manager getInstance()
	{
		File_Reader_Manager helper=new File_Reader_Manager();
		return helper;
		
	}
}
