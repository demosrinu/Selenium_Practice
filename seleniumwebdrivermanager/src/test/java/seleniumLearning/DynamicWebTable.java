package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://scclmines.com/scclnew/careers_Results.asp");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//customized xpath: //tagname[contains(key,'value')]/parent::td//preceding-sibling::td//tagname[@key='value'
		//we use customized xpath to perform the needed action on targeted webelement
		driver.findElement(By.xpath("//*[@id=\"main_wrapper\"]/div[6]/table/tbody/tr/td[2]/div/table/tbody/tr[8]/td[4]/a")).click();

	}

}
