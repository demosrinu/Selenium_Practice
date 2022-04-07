package com.qa.testutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	//implicitwait has keyword, global wait, not recommendable for large applications
	//no keyword for explicitwait, available with WebDriverWait with some ExpectedConditions
	//specific to element and dynamic in nature, ajax/javascript elements
	//never use explicit and implicit together, total wait time increased
	//method for explicit wait
	public static void SendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		//SendKeys(driver, firstname, 10, "tom")
	}
}
