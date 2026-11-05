package com.TravelTest.Repo;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HotelRepo {

	private WebDriver w;
	
	public HotelRepo(WebDriver wd)
	{ 
		w=wd;
		
	}
	private By hotels = By.linkText("Hotels");
	private By city = By.cssSelector("input[data-testid=\"hotel-city-input\"]");
	private By Chennai1 = By.xpath("//*[@id=\"root\"]/div/main/section/div[2]/div/form/div[1]/div/button[2]");
	private By CheckIn = By.id("hotel-checkin-input");
	private By CheckOut = By.id("hotel-checkout-input");
	private By Guest = By.id("hotel-guests-selector");
	private By Room = By.id("hotel-rooms-selector");
	private By SearchHotel = By.cssSelector("button[data-testid=\"hotel-search-button\"]");
	private By suggestCity = By.xpath("//*[@data-testid=\"hotel-city-suggestions-list\"]/button");	
	private By HotelUrban = By.cssSelector("button[data-testid=\"select-hotel-button-HT-2028\"]");
	private By HotelTechPark = By.cssSelector("button[data-testid=\"select-hotel-button-6\"]");
	private By HotelEmarland = By.cssSelector("button[data-testid=\"select-hotel-button-HT-2015\"]");
	private By HotelPaymentUPI = By.cssSelector("button[data-testid=\"upi-tab\"]");
	private By UpiId = By.id("payment-upi-input");
	private By TouristName = By.cssSelector("input[data-testid=\"traveler-1-name-input\"]");
	private By TouristNumber = By.cssSelector("input[data-testid=\"traveler-1-phone-input\"]");
	private By touristAge = By.cssSelector("input[data-testid=\"traveler-1-age-input\"]");
	private By touristGender = By.id("traveler-1-gender-select");
	private By UPIPay = By.cssSelector("button[data-testid=\"payment-pay-button\"]");
	private By UPIPayConfim = By.cssSelector("button[data-testid=\"payment-pay-button\"]");
	private By CoupanApply = By.cssSelector("button[data-testid=\"apply-coupon-hotel750\"]");
	private By BaseAmount = By.cssSelector("span[data-testid=\"payment-base-amount\"]");
	private By TaxesAndFees = By.cssSelector("span[data-testid=\"payment-taxes-fees\"]");
	private By Discount = By.cssSelector("span[data-testid=\"payment-discount-amount\"]");
	private By payable = By.cssSelector("span[data-testid=\"payment-final-amount\"]");
	public void Hotels()
	   {	
		w.findElement(hotels).click();
		w.manage().window().maximize();
}
	
	 public void City()
	   {
		 w.findElement(city).click();
	  
	   }
	 public void SuggestCity(String CityName) {
		List<WebElement> sc = w.findElements(suggestCity);
		for (WebElement s : sc) {
			if (s.getText().contains(CityName)) {
				s.click();
				break;
			} 
		}
	 }

	
	 
	 public void CheckIn(String ddmmyyyy)
	   {
		
		   w.findElement(CheckIn).sendKeys(ddmmyyyy);
		   
	   }
	 public void CheckOut(String ddmmyyyy)
	   {
		   w.findElement(CheckOut).sendKeys(ddmmyyyy);
		   
	   }

	 public void Guest(String visibleText)
	   {
		   Select s =new Select(w.findElement(Guest));
		   s.selectByVisibleText(visibleText);
		  
	   }
	 
	 public void Room(String visibleText)
	   {
		   Select s =new Select(w.findElement(Room));
		   s.selectByVisibleText(visibleText);
	  
	   }
	
	 public void searchHotelBtn() {
		   w.findElement(SearchHotel).click();
		   
	   }
	 
	 public void Clear() {
		 w.findElements(suggestCity);
	 }
	 
	 public void SelectHotel() {
		
		 w.findElement(HotelTechPark).click();
		 
			} 
		
	 public void HotelPaymentOptionUPI() {
		 w.findElement(HotelPaymentUPI).click();
	 }
	 
	 public void UpiPaymentID(String UPI) {
		 w.findElement(UpiId).sendKeys(UPI);
	 }
	 
	 public void TouristName(String T_Name)
	 {
		 w.findElement(TouristName).sendKeys(T_Name);
	 }
	 
	 public void TouristPhone(String T_Number) {
		 w.findElement(TouristNumber).sendKeys(T_Number);
	 }
	 public void TouristAge(String age) {
		 w.findElement(touristAge).sendKeys(age);
	 }
	 
	 public void TouristGender(String Gender) {
		 
		 Select s = new Select(w.findElement(touristGender));
         s.selectByVisibleText(Gender);		 
	 }
	 
	 public void UPIPay() {
		 
		 w.findElement(UPIPay).click();
	 }
	 public void UPIPayConfirmed() {
		 w.findElement(UPIPayConfim).click();
	 }
	 
	 public void applyCoupan() {
		 w.findElement(CoupanApply).click();
	 }
	 
	 public String base() {
		 return w.findElement(BaseAmount).getText();
	 }
	 public String taxesAndFees() {
		 return w.findElement(TaxesAndFees).getText();
	 }
	 public String discount() {
		 return w.findElement(Discount).getText();
	 }
	 public String payable() {
		 return w.findElement(payable).getText();
	 }
}
