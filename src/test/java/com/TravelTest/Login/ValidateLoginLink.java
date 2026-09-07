package com.TravelTest.Login;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTest.Repo.LoginRepo;

public class ValidateLoginLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SoftAssert soft =new SoftAssert();
		String arr[] = {"chrome","edge"};
		for (String browserName:arr) {
			BrowserOption b = new BrowserOption();
			LoginRepo r = new LoginRepo(b.launchBrowser(browserName));
			b.navigateToProvideURL("https://travel-test-bug.vercel.app/");
			Thread.sleep(2000);
			r.loginLink();
			Thread.sleep(2000);
//			Assert.assertEquals(b.currentURL(), "https://travel-test-bug.vercel.app");
            soft.assertEquals(b.currentURL(), "https://travel-test-bug.vercel.app/login");	
		}
		soft.assertAll();

	}

}
