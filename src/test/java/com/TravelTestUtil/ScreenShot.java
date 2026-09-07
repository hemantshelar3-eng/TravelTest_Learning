package com.TravelTestUtil;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public ScreenShot(String ScreenShotSaveName) throws Exception{
WebDriver w = new ChromeDriver();

		TakesScreenshot tss = (TakesScreenshot) w;
		File screenshot =tss.getScreenshotAs(OutputType.FILE);
		LocalDateTime dt = LocalDateTime.now();
		File path = new File("./screenshot/src"+ScreenShotSaveName+" "+dt.getDayOfMonth()+"_"+dt.getMonthValue()+"_"+dt.getYear()+"_"+dt.getHour()+"_"+dt.getMinute()+"_"+dt.getSecond()+".png");

		FileHandler.copy(screenshot, path);
		
	}

}
