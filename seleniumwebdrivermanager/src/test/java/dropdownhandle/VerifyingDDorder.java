package dropdownhandle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import graphql.Assert;

public class VerifyingDDorder {
	
	@Test
	public void DropDownOrder() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		Select coursename = new Select(driver.findElement(By.id("course")));
		
		List<String> actuallist = new ArrayList<String>();
		
		List<WebElement> courseslist  = coursename.getOptions();
		
		for(WebElement ele:courseslist) {
			String data = ele.getText();
			actuallist.add(data);
		}
		List<String> temp = new ArrayList<String>();
		temp.addAll(actuallist);
		Collections.sort(temp);
		Assert.assertTrue(actuallist.equals(temp));

	}

}
