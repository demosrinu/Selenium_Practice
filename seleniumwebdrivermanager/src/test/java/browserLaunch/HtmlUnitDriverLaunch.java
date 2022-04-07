package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverLaunch {

	public static void main(String[] args) {
		
		//HtmlUnitDriver-- headless browser, ghost browser, invisible
		//fast execution of test cases
		//not suitable for action class--mouse movement,double click
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.gsmarena.com/");
		System.out.println(driver.getTitle());

	}

}
