package dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDbySelect {
		
	@Test
	public void DDselection() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.91mobiles.com/");
	
		Select category = new Select(driver.findElement(By.xpath("//select[@id='auto_suggest_category']")));
		
		//category.selectByVisibleText("Mobiles");
		
		//category.selectByValue("l");
		
		category.selectByIndex(3);
		
		Thread.sleep(3000);
		driver.quit();
	}
	

		
	}
