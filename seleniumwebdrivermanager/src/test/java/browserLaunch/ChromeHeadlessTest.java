package browserLaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("naveen automation labs");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
