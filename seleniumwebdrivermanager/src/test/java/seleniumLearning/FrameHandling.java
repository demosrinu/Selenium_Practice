package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("srinu.sandavena245");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.quit();
		//driver.switchTo().frame("");
		
		//unfinished code

	}

}
