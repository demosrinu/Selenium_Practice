package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMessage {
	
	@Test
	public void testmsg() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.facebook.com/");
		
		Thread.sleep(8000);
		
		driver.findElement(By.name("login")).click();
		String actual_error = driver.findElement(By.xpath("//div[@id='email_container']/div[@class='_9ay7']")).getAttribute("innerHTML");
		String expected_error = "The email address or mobile number you entered isn't connected to an account. <a href=\"https://facebook.com/login/identify/\">Find your account and log in.</a>";
		
		Assert.assertEquals(actual_error, expected_error);
		Assert.assertTrue(actual_error.contains(expected_error));
		System.out.println("Test Completed");
		driver.quit();
	}
	

}
