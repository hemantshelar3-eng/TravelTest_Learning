// write code a code for automation testing where there is 3 webelement is present first email, password and click on login button "" on testNG with selenium on java


package com.TestTest.AI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScriptGenerationUsingAI {


public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Open application
        driver.get("https://travel-test-bug.vercel.app/login");
        // Maximize browser
        driver.manage().window().maximize();
       
    }

    @Test
    public void loginTest() throws Exception {

        // Enter Email
        driver.findElement(By.id("login-email-input")).sendKeys("test@gmail.com");
Thread.sleep(2000);
        // Enter Password
        driver.findElement(By.id("login-password-input")).sendKeys("Test@123");
Thread.sleep(2000);

driver.findElement(By.id("login-remember-checkbox")).click();
Thread.sleep(2000);
        // Click Login button
        driver.findElement(By.cssSelector("button[data-testid=\"login-submit-button\"]")).click();
        Thread.sleep(8000);
        
    }

    @AfterMethod
    public void tearDown() {

        // Close browser
        driver.quit();
    
    }
}
}