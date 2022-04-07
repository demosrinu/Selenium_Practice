package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbloginparameters {
	
	WebDriver driver;
	
	
	@Parameters("browsername")
	@BeforeTest
	public void Browserlaunch(String browsername) {
		switch (browsername.toLowerCase()) {
		
		case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			break;
			
		case "ff":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
			break;	
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
				break;	

		default:
			System.err.println("browsername is invalid");
			break;
		}
	}
	@Parameters("url")
	@Test
	public void launchapp(String url) {
		driver.get(url);
	}
	
	@Parameters({"username","password"})
	@Test(priority=1)
	public void login(String username, String password) throws InterruptedException {
		
		WebElement enter_email = driver.findElement(By.xpath("//input[@id='email']"));
		enter_email.sendKeys(username);
		
		WebElement enter_password = driver.findElement(By.xpath("//input[@id='pass']"));
		enter_password.sendKeys(password);
	
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginbtn.click();
		
		Thread.sleep(3000);
		
		WebElement notnowbtn = driver.findElement(By.xpath("//div[@aria-label='Not Now' and @tabindex='0']"));
		notnowbtn.click();

	
		WebElement Account = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		Account.click();
		
		Thread.sleep(3000);
		WebElement logoutbtn = driver.findElement(By.cssSelector("div[data-visualcompletion='ignore-dynamic'][data-nocookies='true']"));
		logoutbtn.click();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
}
	
