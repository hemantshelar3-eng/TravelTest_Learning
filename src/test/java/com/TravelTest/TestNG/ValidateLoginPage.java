package com.TravelTest.TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TravelTest.Repo.LoginRepo;


public class ValidateLoginPage extends LaunchBrowserAndQuit{
	
	
	@Test (priority = 1)  //Validate Login Link
	public void ValidateLoginLink() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		w.getCurrentUrl();
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
		}
			finally {
				//new ScreenShot("Hotelpage");
			}
			w.quit();
			}
			

	@Test (priority = 2)  //test condition login valid Email and password
	public void loginValidCredintial() throws Exception {
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
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/");
			//System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();
		}
		
	@Test (priority = 3)  //test condition login Invalid  Email and password
	public void loginvalidCredential() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("softwaretestingai708@atomicmail");
		Thread.sleep(2000);
		r.sendPassword("ITvedant@708... 23");
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickLoginButton();
		Thread.sleep(8000);
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
			System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();
		}

	@Test  (priority = 4) //test condition login  valid Email and Invalid password
	public void loginInvalidPassword() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("softwaretestingai708@atomicmail.io");
		Thread.sleep(2000);
		r.sendPassword("ITvedant");
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickLoginButton();
		Thread.sleep(8000);
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
			//System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();
		}
	
	@Test  (priority = 5) //test condition login invalid Email and valid password
	public void loginInvalidEmail() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("softwaretestingai708@atomicmail.io");
		Thread.sleep(2000);
		r.sendPassword("ITvedant");
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickLoginButton();
		Thread.sleep(8000);
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
			System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();
		}
	
	@Test (priority = 6)  //test condition login  Email and password blank
	public void loginBlankEmailPassword() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("");
		Thread.sleep(2000);
		r.sendPassword("");
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickLoginButton();
		Thread.sleep(8000);
		
		try {

			
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
			//System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();
		}
	
	@Test (priority = 7)  //mask icon working or not
	public void MaskingLogoShow() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("softwaretestingai708@atomicmail.io");
		Thread.sleep(2000);
		r.sendPassword("ITvedant");
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickShow();
		Thread.sleep(2000);
		Assert.assertEquals(r.getPassword(), "text");
		
		
	}
	
	@Test (priority = 8)  //mask icon working or not
	public void MaskingLogoHide() throws Exception {
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("softwaretestingai708@atomicmail.io");
		Thread.sleep(2000);
		r.sendPassword("ITvedant");
		Thread.sleep(2000);
		r.clickRememberMeCheck();
		Thread.sleep(2000);
		r.clickShow();
		Thread.sleep(2000);
		r.clickHide();
		Thread.sleep(2000);
	    r.clickShow();
	    Thread.sleep(2000);
	    w.quit();
	    
		}
	
	}
	