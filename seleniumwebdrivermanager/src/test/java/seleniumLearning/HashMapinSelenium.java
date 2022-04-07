package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapinSelenium {

	public static void main(String[] args) {
//users types -- category manager user, customer user, admin user, seller user, distributor user, delivery user, customercare user
//Role based -- permission based use case
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("");
	}

}
