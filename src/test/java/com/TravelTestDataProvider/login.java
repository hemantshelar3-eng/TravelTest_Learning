package com.TravelTestDataProvider;

import org.testng.annotations.DataProvider;

import com.TravelTestUtil.Excel;

public class login {

	
	@DataProvider(name = "LoginTestData")
	public String [][] login() throws Exception{
		return new Excel().excel("./src/test/resources/Login.xlsx","Sheet1");
				
	}
	
}
