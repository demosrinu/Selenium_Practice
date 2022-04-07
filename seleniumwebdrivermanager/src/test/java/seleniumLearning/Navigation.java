package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();

	}

}
