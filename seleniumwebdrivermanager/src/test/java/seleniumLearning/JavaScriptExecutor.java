package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		WebElement signinbtn = driver.findElement(By.xpath("//a[@id='nav-orders']"));
		//signinbtn.click();
		
		flash(signinbtn, driver);

	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String color = element.getCssValue("backgroundcolor");
		for (int i=0; i<2000; i++) {
			changecolor("rgb(0,0,200)", element, driver);
			changecolor(color, element, driver);
		}
		
	}

	private static void changecolor(String colour, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor= '"+colour+"'", element);
		
	}

}
