package seleniumLearning;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ObjectRepository {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\sandavenisrinivas\\eclipse-workspace\\Selenium4.1.2\\src\\seleniumlearning\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("DOB"));
		
		String url = prop.getProperty("URL");
		String Browsername = prop.getProperty("Browsername");
		
		if(Browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			
		}else if(Browsername.equals("FF")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sandavenisrinivas\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}
		
		driver.findElement(By.xpath(prop.getProperty("search_xpath"))).sendKeys(prop.getProperty("search"));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(prop.getProperty("search_xpath"))).click();
		
		/*Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText(prop.getProperty("linkText"))))
		.build()
		.perform();*/

	}

}
