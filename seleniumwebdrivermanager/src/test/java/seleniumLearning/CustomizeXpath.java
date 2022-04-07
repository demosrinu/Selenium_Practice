package seleniumLearning;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//syntax for xpath is //tagname[@attribute='value'] or //tagname[contains(@attribute,'value')]
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("kurtis");
		
		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconSearch sprites-search')]")).click();
		
		
		//to get the total count of links on the page
		
		List <WebElement> linklist = driver.findElements(By.tagName("input"));
		System.out.println(linklist.size());
		
		//to get the text each link on the page
		
		for(int i=0; i<linklist.size();i++)
		{
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
		}
		
		driver.quit();
	}

}
