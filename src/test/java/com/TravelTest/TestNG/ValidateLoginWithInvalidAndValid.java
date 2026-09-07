package com.TravelTest.TestNG;

import org.testng.annotations.Test;

import com.TravelTest.Repo.LoginRepo;

public class ValidateLoginWithInvalidAndValid extends LaunchBrowserAndQuit {
	
	@Test(dataProviderClass = com.TravelTestDataProvider.login.class , dataProvider = "LoginTestData")
	
	public void login(String email , String password) throws Exception{
		
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail(email);
		Thread.sleep(2000);
		r.sendPassword(password);
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickLoginButton();
		Thread.sleep(8000);
		
	}

}
