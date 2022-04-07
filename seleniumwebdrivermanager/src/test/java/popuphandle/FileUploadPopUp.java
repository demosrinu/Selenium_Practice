package popuphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("srinu.sandavena245");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']/parent::button[@type='button']")).click();
		
		//unfinished code

	}


}
