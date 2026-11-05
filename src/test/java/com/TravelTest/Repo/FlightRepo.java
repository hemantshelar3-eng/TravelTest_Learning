package com.TravelTest.Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightRepo {
	
	WebDriver w;
	
	public FlightRepo(WebDriver wd) {
		w = wd;
	}
	By flights = By.linkText("Flights");
	By Source = By.id("flight-source-dropdown");
	By destination = By.name("destination");
	By Passanger =By.name("passengers");
	By classes = By.name("travelClass");
	
	By departureDate = By.cssSelector("input[data-testid=\"flight-departure-date-input\"]");
	By searchFlightBtn = By.cssSelector("Button[data-testid=\"flight-search-button\"]");
	By FlightBookbtn = By.cssSelector("button[data-testid=\"select-flight-button-23\"]");
	By SeatB = By.cssSelector("button[data-testid=\"selected-seat\"]");
	By SeatBvalidation = By.xpath("//*[@id=\"root\"]/div/main/section/div/div[2]/aside/div[3]/div/button");
	public void flights()
	   {	
		w.findElement(flights).click();
}
   public void flightsSource(String visibleText)
   {
	   Select s =new Select(w.findElement(Source));
	   s.selectByVisibleText(visibleText);
	  
   }
   
   public void flightsDestination(String visibleText)
   {
	Select s =new Select(w.findElement(destination));
	   s.selectByVisibleText(visibleText);
	   
   }
   public void departureDate(String ddmmyyyy)
   {
	
	   w.findElement(departureDate).sendKeys(ddmmyyyy);
	   
   }
   
   public void passanger(String pass)
   {
	   Select s =new Select(w.findElement(Passanger));
	   s.selectByVisibleText(pass);
	  
   }
   
   public void FlightClass(String clas)
   {
	   Select s =new Select(w.findElement(classes));
	   s.selectByVisibleText(clas);
	  
   }
   public void searchFlight() {
	   w.findElement(searchFlightBtn).click();
	   
   }

   public void FlightBookingBtn() {
	   w.findElement(FlightBookbtn).click();
	   
   }
   public void SeatBooking() {
	   w.findElement(SeatB).click();
	   
   }
   
   public String Seatvalidation() {
	   return w.findElement(SeatBvalidation).getText();
   }
	
   
}
