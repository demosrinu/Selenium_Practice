package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://scclmines.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("COMPANY")))
		.build()
		.perform();
	    
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("BOARD")).click();
	    
		Thread.sleep(3000);
		driver.quit();


	}

}
