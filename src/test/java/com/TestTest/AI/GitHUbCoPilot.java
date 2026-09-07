package com.TestTest.AI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHUbCoPilot {

WebDriver w;

@BeforeMethod
public void LaunchAnCromeBrowser() {
	w = new ChromeDriver();
	w.manage().window().maximize();
	w.get("https://travel-test-bug.vercel.app/login");
	
}

@Test
public void LoginTest() throws Exception {
	w.findElement(By.id("login-email-input")).sendKeys("hemant12@gmail.com");
	Thread.sleep(2000);
	w.findElement(By.id("login-password-input")).sendKeys("Hemant@123");
	Thread.sleep(2000);
	w.findElement(By.id("login-remember-checkbox")).click();
	Thread.sleep(2000);
	w.findElement(By.cssSelector("button[data-testid=\"login-submit-button\"]")).click();
	Thread.sleep(2000);
	Assert.assertEquals(w.getCurrentUrl(),"https://travel-test-bug.vercel.app/");

}
@AfterMethod
public void closeBrowser() {
	w.quit();

}
}