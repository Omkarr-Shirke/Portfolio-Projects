package com.tka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username ;
	
	@FindBy(id="password")
	WebElement password ;
	
	@FindBy(id="login-button")
	WebElement loginBTN;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUsername(String myusername) {
		username.sendKeys(myusername);
	}

	public void setPassword(String mypassword) {
		password.sendKeys(mypassword);
	}

	public void clickLoginBTN() {
		loginBTN.click();
	}

}
