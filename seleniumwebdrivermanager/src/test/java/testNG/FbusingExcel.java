package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbusingExcel {
	
	@Test(dataProvider="loginfb", dataProviderClass = ExcelDataSupplier.class)
	public void logintest(String username, String password) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		WebElement enter_email = driver.findElement(By.xpath("//input[@id='email']"));
		enter_email.sendKeys(username);
		
		WebElement enter_password = driver.findElement(By.xpath("//input[@id='pass']"));
		enter_password.sendKeys(password);
	
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginbtn.click();
	}

}
