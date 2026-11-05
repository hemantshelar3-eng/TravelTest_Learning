package com.Testing.Practical;

import java.io.File;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.collections4.Get;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTestDataProvider.login;

public class TravelTest {

	public static void main(String[] args) throws Exception{
		
		BrowserOption op = new BrowserOption();
		WebDriver w;
		
		//ChromeDriver d;
	w = op.launchBrowser("chrome"); 
	op.navigateToProvideURL("https://cart-sure.vercel.app/");
	w.manage().window().maximize();
	String title = w.getTitle();
	System.out.println(title);
	
	
	TakesScreenshot ts =(TakesScreenshot) w;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./screenshot/travelTest.png");
	FileHandler.copy(source, destination);

    System.out.println("Screenshot saved successfully.");
	
	}
}
