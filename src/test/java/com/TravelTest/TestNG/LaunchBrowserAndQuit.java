package com.TravelTest.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTest.Repo.FlightRepo;
import com.TravelTest.Repo.HotelRepo;
import com.TravelTest.Repo.LoginRepo;
import com.TravelTest.Repo.RegRepo;
import com.TravelTest.Repo.RegisterRepo;

public class LaunchBrowserAndQuit 
{
 BrowserOption op;
 LoginRepo r;
 FlightRepo fr;
 HotelRepo hr;
 WebDriver w;
 RegisterRepo rg;
@BeforeMethod
public void launchBrowserAndNavigateToTravelTestSite() {
	op = new BrowserOption();
	// r =new LoginRepo(op.launchBrowser("chrome"));
	 w = op.launchBrowser("chrome");
	 op.navigateToProvideURL("https://travel-test-bug.vercel.app/");
	w.manage().window().maximize();
}


@AfterMethod
public void closeBrower()
{
	w.quit();
}
}