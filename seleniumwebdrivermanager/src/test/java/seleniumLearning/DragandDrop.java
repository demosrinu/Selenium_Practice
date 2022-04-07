package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);//action class is used to handle drag and drop function using mouse
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
