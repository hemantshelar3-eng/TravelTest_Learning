package com.TravelTest.TestNG;
import java.io.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TravelTest.Repo.HotelRepo;
import com.TravelTest.Repo.LoginRepo;
import com.TravelTestUtil.ScreenShot;

public class HotelSearchPage extends LaunchBrowserAndQuit {

	@Test(priority = 1)
	public void searchHotelValidData() throws Exception
	{
	hr = new HotelRepo(w);
	Thread.sleep(2000);
	hr.Hotels();
	Thread.sleep(2000);
	hr.City();
	Thread.sleep(2000);
	hr.SuggestCity("Bengaluru");
	Thread.sleep(2000);
	hr.CheckIn("10-10-2026");
	Thread.sleep(2000);
	hr.CheckOut("11-10-2026");
	Thread.sleep(2000);
	hr.Guest("2 guests");
	Thread.sleep(2000);
	hr.Room("1 room");
	Thread.sleep(2000);
	hr.searchHotelBtn();
	Thread.sleep(2000);
	
	try {
		Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/hotels/results");
		System.out.println("Test Pass");
		
	} 
	finally {
		//new ScreenShot("Hotelpage");
	}
	w.quit();	
	}
	

	@Test(priority = 2)
	public void searchHotelInValidData() throws Exception
	{
		hr = new HotelRepo(w);
		Thread.sleep(2000);
		hr.Hotels();
		Thread.sleep(2000);
		hr.City();
		Thread.sleep(2000);
		hr.SuggestCity("Bengaluru");
		Thread.sleep(2000);
		hr.CheckIn("29-09-2025");
		Thread.sleep(2000);
		hr.CheckOut("30-09-2024");
		Thread.sleep(2000);
		hr.Guest("2 guests");
		Thread.sleep(2000);
		hr.Room("1 room");
		Thread.sleep(2000);
		hr.searchHotelBtn();
		Thread.sleep(2000);
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/hotels/search");
			System.out.println("Test Pass");
			
		} 
		finally {
			new ScreenShot("Hotelpage");
		}
		w.quit();	
		}
		
	@Test(priority = 3)
	public void HotelBookin() throws Exception{
	
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
		hr = new HotelRepo(w);
		Thread.sleep(2000);
		hr.Hotels();
		Thread.sleep(2000);
		hr.City();
		Thread.sleep(2000);
		hr.SuggestCity("Bengaluru");
		Thread.sleep(2000);
		hr.CheckIn("10-10-2026");
		Thread.sleep(2000);
		hr.CheckOut("11-10-2026");
		Thread.sleep(2000);
		hr.Guest("2 guests");
		Thread.sleep(2000);
		hr.Room("1 room");
		Thread.sleep(2000);
		hr.searchHotelBtn();
		Thread.sleep(8000);
		hr.SelectHotel();
		Thread.sleep(3000);
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/payment");
			System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();	
		}
	
	
    @Test(priority = 4)
	public void HotelPayment() throws Exception {
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
		hr = new HotelRepo(w);
		Thread.sleep(2000);
		hr.Hotels();
		Thread.sleep(2000);
		hr.City();
		Thread.sleep(2000);
		hr.SuggestCity("Bengaluru");
		Thread.sleep(2000);
		hr.CheckIn("10-10-2026");
		Thread.sleep(2000);
		hr.CheckOut("11-10-2026");
		Thread.sleep(2000);
		hr.Guest("1 guest");
		Thread.sleep(2000);
		hr.Room("1 room");
		Thread.sleep(2000);
		hr.searchHotelBtn();
		Thread.sleep(8000);
		hr.SelectHotel();
		Thread.sleep(3000);
		hr.HotelPaymentOptionUPI();
		Thread.sleep(3000);
		hr.UpiPaymentID("traveller@upi");
		Thread.sleep(3000);
		hr.TouristName("Hemant");
		Thread.sleep(3000);
		hr.TouristPhone("9876543210");
		Thread.sleep(3000);
		hr.TouristAge("34");
		Thread.sleep(3000);
		hr.TouristGender("Male");
		Thread.sleep(3000);
		hr.UPIPay();
		Thread.sleep(3000);
		hr.UPIPayConfirmed();
		Thread.sleep(3000);
		
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/booking/confirmation");
			System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();	
		}
    
    @Test(priority = 6)
	public void ValidateHotelSeachButtonBlankData() throws Exception
	{
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
		hr = new HotelRepo(w);
		Thread.sleep(2000);
		hr.Hotels();
		Thread.sleep(2000);
		hr.searchHotelBtn();
		Thread.sleep(8000);
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/hotels/search");
			System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();	
		}
    
    @Test(priority = 7)
	public void hotelSuggestValidationInvalidData() throws Exception {
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
		hr = new HotelRepo(w);
		Thread.sleep(2000);
		hr.Hotels();
		Thread.sleep(2000);
		hr.City();
		Thread.sleep(2000);
		hr.SuggestCity("Pune");
		Thread.sleep(2000);
		hr.CheckIn("10-10-2026");
		Thread.sleep(2000);
		hr.CheckOut("11-10-2026");
		Thread.sleep(2000);
		hr.Guest("1 guest");
		Thread.sleep(2000);
		hr.Room("1 room");
		Thread.sleep(2000);
		hr.searchHotelBtn();
		Thread.sleep(8000);
		
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/hotels/search");
			System.out.println("Test Pass");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();	
		}
    
    @Test(priority = 8)
    public void CoupanValidation() throws Exception {
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
		hr = new HotelRepo(w);
		Thread.sleep(2000);
		hr.Hotels();
		Thread.sleep(2000);
		hr.City();
		Thread.sleep(2000);
		hr.SuggestCity("Bengaluru");
		Thread.sleep(2000);
		hr.CheckIn("10-10-2026");
		Thread.sleep(2000);
		hr.CheckOut("11-10-2026");
		Thread.sleep(2000);
		hr.Guest("1 guest");
		Thread.sleep(2000);
		hr.Room("1 room");
		Thread.sleep(2000);
		hr.searchHotelBtn();
		Thread.sleep(8000);
		hr.SelectHotel();
		Thread.sleep(3000);
		hr.HotelPaymentOptionUPI();
		Thread.sleep(3000);
		hr.UpiPaymentID("traveller@upi");
		Thread.sleep(3000);
		hr.TouristName("Hemant");
		Thread.sleep(3000);
		hr.TouristPhone("9876543210");
		Thread.sleep(3000);
		hr.TouristAge("34");
		Thread.sleep(3000);
		hr.TouristGender("Male");
		Thread.sleep(3000);
		hr.applyCoupan();
		Thread.sleep(3000);
		hr.applyCoupan();
		Thread.sleep(3000);
		
		
		try {
			String actualCoupon = w.findElement(By.cssSelector("p[data-testid=\"promo-success-message\"]")).getText();

			Assert.assertEquals(actualCoupon, "HOTEL750 applied. You saved Rs. 750.");
			
		} 
		finally {
			//new ScreenShot("Hotelpage");
		}
		w.quit();	
		}
    
@Test (priority = 9)
    public void HotelAmountCalculationAfterCoupanAppy() throws Exception {
	    	
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
			hr = new HotelRepo(w);
			Thread.sleep(2000);
			hr.Hotels();
			Thread.sleep(2000);
			hr.City();
			Thread.sleep(2000);
			hr.SuggestCity("Bengaluru");
			Thread.sleep(2000);
			hr.CheckIn("10-10-2026");
			Thread.sleep(2000);
			hr.CheckOut("11-10-2026");
			Thread.sleep(2000);
			hr.Guest("1 guest");
			Thread.sleep(2000);
			hr.Room("1 room");
			Thread.sleep(2000);
			hr.searchHotelBtn();
			Thread.sleep(8000);
			hr.SelectHotel();
			Thread.sleep(3000);
			hr.HotelPaymentOptionUPI();
			Thread.sleep(3000);
			hr.UpiPaymentID("traveller@upi");
			Thread.sleep(3000);
			hr.TouristName("Hemant");
			Thread.sleep(3000);
			hr.TouristPhone("9876543210");
			Thread.sleep(3000);
			hr.TouristAge("34");
			Thread.sleep(3000);
			hr.TouristGender("Male");
			Thread.sleep(3000);
			hr.applyCoupan();
			Thread.sleep(3000);
			hr.applyCoupan();
			Thread.sleep(3000);
			
	    	
	    	try {
	    		
	        SoftAssert soft = new SoftAssert();
	        soft.assertEquals(hr.base(), "Rs. 3,900");
	        soft.assertEquals(hr.taxesAndFees(), "Rs. 767");
	        soft.assertEquals(hr.discount(), "Rs. 750");
	        soft.assertEquals(hr.payable(), "Rs. 3917");
	        
	        
	        soft.assertAll();
	    
	}catch (Exception e) {
		// TODO: handle exception
	}
		
	    }	
		
    }	
	

