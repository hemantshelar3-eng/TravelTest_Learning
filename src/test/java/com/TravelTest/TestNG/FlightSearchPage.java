package com.TravelTest.TestNG;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TravelTest.Repo.FlightRepo;
import com.TravelTest.Repo.HotelRepo;
import com.TravelTest.Repo.LoginRepo;
import com.TravelTestUtil.ScreenShot;

public class FlightSearchPage extends LaunchBrowserAndQuit{ 
	
	@Test
	public void searchFlight()  throws Exception{
		r = new LoginRepo(w);
		r.loginLink();
		Thread.sleep(3000);
		r.sendEmail("softwaretestingai708@atomicmail.io");
		Thread.sleep(3000);
		r.sendPassword("ITvedant@708");
		Thread.sleep(3000);
		r.clickRememberMeCheck();
		Thread.sleep(3000);
		r.clickLoginButton();
		Thread.sleep(8000);
		
	
	fr =new FlightRepo(w);
	Thread.sleep(2000);
	fr.flights();
	Thread.sleep(2000);
	fr.flightsSource("New Delhi");
	Thread.sleep(2000);
	fr.flightsDestination("Jaipur");
	Thread.sleep(2000);
	fr.departureDate("22-08-2026");
	Thread.sleep(2000);
	fr.searchFlight();
	Thread.sleep(2000);
try {
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/flights/results");
	
} finally {
	
}		
}
	
	@Test
	public void searchFlightPastDate()  throws Exception{
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
		
	fr =new FlightRepo(w);
	Thread.sleep(2000);
	fr.flights();
	Thread.sleep(2000);
	fr.flightsSource("New Delhi");
	Thread.sleep(2000);
	fr.flightsDestination("Jaipur");
	Thread.sleep(2000);
	fr.departureDate("22-08-2021");
	Thread.sleep(2000);
	fr.searchFlight();
	Thread.sleep(2000);
try {
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/flights/search");
	
} finally {
	
}		
}
	
	@Test
	public void searchFlightBlankDate()  throws Exception{
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
		
	fr =new FlightRepo(w);
	Thread.sleep(2000);
	fr.flights();
	Thread.sleep(2000);
	fr.flightsSource("New Delhi");
	Thread.sleep(2000);
	fr.flightsDestination("Jaipur");
	Thread.sleep(2000);
	fr.departureDate("");
	Thread.sleep(2000);
	fr.searchFlight();
	Thread.sleep(2000);
try {
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/flights/search");
	
} finally {
	
}		
}
	@Test
	public void searchFlightBlackData()  throws Exception{
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
		
	fr =new FlightRepo(w);
	Thread.sleep(2000);
	fr.flights();
	Thread.sleep(2000);
	fr.flightsSource("");
	Thread.sleep(2000);
	fr.flightsDestination("");
	Thread.sleep(2000);
	fr.departureDate("");
	Thread.sleep(2000);
	fr.searchFlight();
	Thread.sleep(2000);
try {
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/flights/search");
	
} finally {
	
}		
}
	@Test
	public void searchFlightBlankDestination()  throws Exception{
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
		
	fr =new FlightRepo(w);
	Thread.sleep(2000);
	fr.flights();
	Thread.sleep(2000);
	fr.flightsSource("New Delhi");
	Thread.sleep(2000);
	fr.flightsDestination("");
	Thread.sleep(2000);
	fr.departureDate("10-10-2026");
	
	Thread.sleep(2000);
	fr.passanger("All classes");
	Thread.sleep(2000);
	fr.FlightClass("1 passenger");
	Thread.sleep(2000);
	fr.searchFlight();
try {
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/flights/search");
	
} finally {
	
}		
}
	
	@Test
	public void FlightBookingButton()  throws Exception{
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
//	fr.passanger("All classes");
//	Thread.sleep(2000);
//	fr.FlightClass("1 passenger");
//	Thread.sleep(2000);
	fr.searchFlight();
	Thread.sleep(2000);
	fr.FlightBookingBtn();
	
try {
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/flights/seats?mode=book");
	
} finally {
	
}		
}	
	
}
