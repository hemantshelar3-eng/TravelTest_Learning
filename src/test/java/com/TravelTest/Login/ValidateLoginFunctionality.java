package com.TravelTest.Login;

import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTest.Repo.LoginRepo;

public class ValidateLoginFunctionality {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BrowserOption b = new BrowserOption();
		LoginRepo r = new LoginRepo(b.launchBrowser("chrome"));
		b.navigateToProvideURL("https://travel-test-khaki.vercel.app/login");
		Thread.sleep(2000);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("softwaretestingai708@atomicmail.io");
		Thread.sleep(2000);
		r.sendPassword("ITvedant@708");
	    Thread.sleep(2000);
	    r.clickShow();
	    Thread.sleep(2000);
	    r.clickRememberMeCheck();
	    Thread.sleep(2000);
	    r.clickLoginButton();
	
	}

}
