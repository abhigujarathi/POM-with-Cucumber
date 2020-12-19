package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//By locators
	private By emailID= By.id("email");
	private By password= By.id("passwd");
	private By signInButton= By.id("SubmitLogin");
	private By forgorPwdLink=By.linkText("Forgot your password?");
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// page actions
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkExists() {
		return driver.findElement(forgorPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailID).sendKeys(username);
		
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void Login() {
		driver.findElement(signInButton).click();
	}


 
}
