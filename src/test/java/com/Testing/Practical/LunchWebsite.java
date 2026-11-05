package com.Testing.Practical;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.TravelTest.BrowserOption.BrowserOption;

public class LunchWebsite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BrowserOption op;
		WebDriver w;
		op = new BrowserOption();
		 w = op.launchBrowser("chrome");
		 	
		 op.navigateToProvideURL("https://travel-test-bug.vercel.app/");
		w.manage().window().maximize();
		String title = w.getTitle();
		System.out.println("Page Title: " + title);
		
		TakesScreenshot ts = (TakesScreenshot) w;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/login.png");
		FileHandler.copy(source, destination);
		
		w.close();
	}

}
