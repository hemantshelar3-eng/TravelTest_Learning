package com.TravelTest.BrowserOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOption {
	
	private WebDriver w;
	public WebDriver launchBrowser(String browserName)  // Return Type Method
	{
		if(browserName.equalsIgnoreCase("chrome")) {
			w = new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			w = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			w = new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser name" +browserName);
		}
		return w;
	}
	
	public void navigateToProvideURL(String URL) {
		w.get(URL);
	}

	public String currentURL()
	{
		return w.getCurrentUrl();
	}
	public void quit() {
		w.quit();
	}
}
