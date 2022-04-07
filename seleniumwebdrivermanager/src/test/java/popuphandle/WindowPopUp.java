package popuphandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		Set<String> handler = driver.getWindowHandles();
		
		 Iterator<String> it = handler.iterator();
		
		 String ParentWindowId = it.next();
		 
		 System.out.println(ParentWindowId);
		 
		 String ChildWindowId = it.next();
		 
		 System.out.println(ChildWindowId);
		 
		 driver.switchTo().window(ChildWindowId);
		 
		 driver.close();
		 
		 driver.switchTo().window(ParentWindowId);
		 
	}

}
