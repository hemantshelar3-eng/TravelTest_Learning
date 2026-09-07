package com.TravelTest.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTest.Repo.FlightRepo;
import com.TravelTest.Repo.LoginRepo;

public class LaunchBrowserAndQuit 
{
 BrowserOption op;
 LoginRepo r;
 FlightRepo fr;
 WebDriver w;
@BeforeMethod
public void launchBrowserAndNavigateToTravelTestSite() {
	op = new BrowserOption();
	// r =new LoginRepo(op.launchBrowser("chrome"));
	 w = op.launchBrowser("chrome");
	 op.navigateToProvideURL("https://travel-test-bug.vercel.app/");
		
}


@AfterMethod
public void closeBrower()
{
	w.quit();
}
}