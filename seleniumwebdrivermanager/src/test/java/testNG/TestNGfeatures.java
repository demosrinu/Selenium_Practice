package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGfeatures {
	
	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeTest
	public void Browserlaunch(String browsername) {
		switch (browsername) {
		
		case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			break;
			
		case "FF":
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
	
	@Test(priority=0)
	public void launchapp() {
		driver.get("https://www.youtube.com/");
	}
	
	@Test(priority=1)
	public void test() {
		String title = driver.getTitle();
		System.out.println(title);
		}
	
	@Test(priority=2)
	public void test1() {
		boolean b = driver.findElement(By.xpath("//div[@id='start']/descendant::a[@id='logo']")).isDisplayed();
		System.out.println(b);
		}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		}

}
