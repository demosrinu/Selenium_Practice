package popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("proceed")).click();	
		
		Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		
		String text = alert.getText();
		System.out.println(text);
		
		driver.quit();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct message");
		}else {
			System.out.println("incorrect message");
		}
		

	}

}
