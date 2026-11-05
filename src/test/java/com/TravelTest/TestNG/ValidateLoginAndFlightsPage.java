package com.TravelTest.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTest.Repo.FlightRepo;
import com.TravelTest.Repo.LoginRepo;

public class ValidateLoginAndFlightsPage {

private BrowserOption op;
private LoginRepo r;
private FlightRepo fr;
private WebDriver w;
@BeforeMethod
public void launchBrowserAndNavigateToTravelTestSite() {
	op = new BrowserOption();
	// r =new LoginRepo(op.launchBrowser("chrome"));
	 w = op.launchBrowser("chrome");
	 op.navigateToProvideURL("https://travel-test-bug.vercel.app/");
		
}
@Test (priority = 1)  //test condition login
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
@Test (priority = 2) 
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

}

@AfterMethod
public void closeBrower()
{
	w.quit();
}

}
