package com.banking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
		
	WebDriver driver;
	
	Loginpage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="emailid")
	WebElement Email;
	
	@FindBy(name="btnLogin")
	WebElement submitbtn;
	
	public void setEmail(String email) {
		Email.sendKeys(email);
	}
		
	public void submit() {
		submitbtn.click();
	}
}
