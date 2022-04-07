package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignupDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();		
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(5000);
		
		//driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("srinivas");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sandaveni");
		
		Select sel1 = new Select(driver.findElement(By.name("birthday_day")));
		sel1.selectByIndex(10);
		
		Select sel2 = new Select(driver.findElement(By.name("birthday_month")));
		sel2.selectByIndex(5);
		
		Select sel3 = new Select(driver.findElement(By.id("year")));
		sel3.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
