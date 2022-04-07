package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wordpresssignup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://wordpress.com/start/user");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srinu.sandavena245@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srinu245");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ABC@xyz123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
