package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sandavenisrinivas\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://learn-automation.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(9000);
		driver.quit();
	}

}
