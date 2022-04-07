package seleniumLearning;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicRadioButtonandCheckBox {

	private static final WebElement WebElement = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://seleniumpractise.blogspot.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Sample Registration Form")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anthony");
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys("1234-5678");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		select.selectByVisibleText("Pune");
		
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		select1.selectByIndex(0);
		
		Select select2 = new Select(driver.findElement(By.xpath("//option[@value='DN']")));
		select2.selectByVisibleText("Dance");

	}
}
