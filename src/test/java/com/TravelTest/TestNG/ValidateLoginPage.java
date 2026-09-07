package com.TravelTest.TestNG;

import org.testng.annotations.Test;

import com.TravelTest.Repo.LoginRepo;

public class ValidateLoginPage extends LaunchBrowserAndQuit{

	@Test   //test condition login
	public void login() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("softwaretestingai708@atomicmail.io");
		Thread.sleep(2000);
		r.sendPassword("ITvedant@708");
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickLoginButton();
		Thread.sleep(8000);
	}
	
}
