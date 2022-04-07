package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sandavenisrinivas\\Downloads\\iedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://learn-automation.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	

	}

}
