package com.TravelTest.TestNG;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TravelTest.Repo.FlightRepo;
import com.TravelTestUtil.ScreenShot;

public class FlightSearchPage extends LaunchBrowserAndQuit{ 
	
	@Test
	public void searchFlight()  throws Exception{
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
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
	
} finally {
	new ScreenShot("filghtpage");
}
		
}

}
