package com.TravelTest.TestNG;


import java.io.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TravelTest.Repo.FlightRepo;
import com.TravelTest.Repo.HotelRepo;
import com.TravelTest.Repo.LoginRepo;
import com.TravelTest.Repo.RegisterRepo;
import com.TravelTestUtil.ScreenShot;

public class Testing extends LaunchBrowserAndQuit {

	@Test
	public void SeatValidations()  throws Exception{

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
		
	fr =new FlightRepo(w);
	Thread.sleep(2000);
	fr.flights();
	Thread.sleep(2000);
	fr.flightsSource("Bengaluru");
	Thread.sleep(2000);
	fr.flightsDestination("Ahmedabad");
	Thread.sleep(2000);
	fr.departureDate("10-10-2026");
	Thread.sleep(2000);
	//fr.passanger("All classes");
	//Thread.sleep(2000);
	//fr.FlightClass("1 passenger");
	Thread.sleep(2000);
	fr.searchFlight();
	Thread.sleep(5000);
	fr.FlightBookingBtn();
	Thread.sleep(5000);
   fr.SeatBooking();
   Thread.sleep(2000);
try {

    SoftAssert soft1 = new SoftAssert();
    soft1.assertEquals(fr.Seatvalidation(),"3B");
   
    
    soft1.assertAll();

}catch (Exception e) {
// TODO: handle exception
}

}	


	}
	