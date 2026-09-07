package com.TestTest.AI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginRepo {

    WebDriver driver;

    // Locators
    By emailInput = By.id("login-email-input");
    By passwordInput = By.id("login-password-input");
    By rememberMeCheckbox = By.id("login-remember-checkbox");
    By loginButton = By.xpath("//button[contains(text(), 'Login')]");

    public LoginRepo(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password, boolean rememberMe) throws Exception {
        driver.findElement(emailInput).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(passwordInput).sendKeys(password);
        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(rememberMeCheckbox);
        if (rememberMe && !checkbox.isSelected()) {
            checkbox.click();
            Thread.sleep(2000);
        }
        
        driver.findElement(loginButton).click();
        Thread.sleep(8000);
    }
}