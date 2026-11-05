package com.TravelTest.Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterRepo {

	
	private WebDriver w;
	public RegisterRepo(WebDriver wd) {
		w = wd;
	}
	
	private By RegisterLink = By.linkText("Register");
	private By FullName = By.id("register-full-name-input");
	private By Email = By.id("register-email-input");
	private By Phone = By.id("register-phone-input");
	private By Gender = By.cssSelector("fieldset[data-testid=\"register-gender-fieldset\"]");
	private By Male = By.cssSelector("input[data-testid=\"register-gender-male-radio\"]");
	private By Female = By.cssSelector("input[data-testid=\"register-gender-female-radio\"]");
	private By Other = By.cssSelector("input[data-testid=\"register-gender-other-radio\"]");
	
	private By Password = By.cssSelector("input[data-testid=\"register-password-input\"]");
	private By ConfPassword = By.id("register-confirm-password-input");
	private By Iagree = By.id("register-terms-checkbox");
	private By regButton = By.cssSelector("button[data-testid=\"register-submit-button\"]");
	
	
	public void registerLink() {
		w.findElement(RegisterLink).click();
	}
	public void fullname(String username) {
		w.findElement(FullName).sendKeys(username);
	}
	public void email(String useremail) {
		w.findElement(Email).sendKeys(useremail);
	}
	public void phone(String userPhone) {
		w.findElement(Phone).sendKeys(userPhone);
	}
//		public void Gender(String UserGender) {
//			List<WebElement> sc = w.findElements(Gender);
//			for (WebElement s : sc) {
//				if (s.getText().contains(UserGender)) {
//					s.click();
//					break;
//				}
//			}
//	}
	
	public void GenderMale() {
	w.findElement(Male).click();
	
	}
	
	public void GenderFemale() {
		w.findElement(Female).click();
		
		}
		
	public void GenderOther() {
		w.findElement(Other).click();
		
		}
		
		public void passwrod(String userPasswod) {
			w.findElement(Password).sendKeys(userPasswod);
			
		}
		public void confPassword(String userPassword) {
			w.findElement(ConfPassword).sendKeys(userPassword);
		}
		public void iagree() {
			w.findElement(Iagree).click();
		}
		public void RegisterButton() {
			w.findElement(regButton).click();
		}
	
	
}
