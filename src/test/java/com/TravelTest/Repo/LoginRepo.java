package com.TravelTest.Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRepo {
	
	private WebDriver w;
	public LoginRepo(WebDriver wd) {
		w = wd;
	}
	
	private By LoginLink = By.linkText("Login");
	private By Email = By.cssSelector("input[id=\"login-email-input\"]");
	private By Password = By.cssSelector("input[id=\"login-password-input\"]");
	private By showOrHidePassword = By.cssSelector("button[data-testid=\"login-password-toggle-button\"]");
	private By rememberMe = By.cssSelector("input[data-testid=\"login-remember-checkbox\"]");
    private By forgotPassword = By.cssSelector("a[data-testid=\"login-forgot-password-link\"]");
	private By loginButton = By.cssSelector("button[data-testid=\"login-submit-button\"]");

	public void loginLink() {
		w.findElement(LoginLink).click();
	}
	public void sendEmail(String userEmail) {
		w.findElement(Email).sendKeys(userEmail);
	}
	public void clearEmail() {
		w.findElement(Email).clear();
	}
	public void sendPassword(String userPassword) {
		w.findElement(Password).sendKeys(userPassword);
	}
		public void clearPassword() {
		w.findElement(Password).clear();
	}
		public void clickShow() {
			w.findElement(showOrHidePassword).click();
			
		}
		public void clickHide() {
			w.findElement(showOrHidePassword).click();
		}
		public void clickRememberMeCheck() {
			w.findElement(rememberMe).click();
		}
		public void clickRememberMeUncheck() {
			w.findElement(rememberMe).click();
		}
		public void clickForgotPassword() {
			w.findElement(forgotPassword).click();
		}
		public void clickLoginButton() {
			w.findElement(loginButton).click();
		}
		public String getPassword() {
			return w.findElement(Password).getDomAttribute("type");
		}

}
