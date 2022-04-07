package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParabankRegistration {
	
	WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	public void Browserlaunch(String browsername) {
		switch (browsername.toLowerCase()) {
		
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			break;
			
		case "ff":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
			break;	
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
				break;	

		default:
			System.err.println("browsername is invalid");
			break;
		}driver.manage().window().maximize();
	}
	
	@Parameters("url")
	@Test(groups="functional")
	public void launchapp(String url) {
	driver.get(url);
	}
	
	@Test(dependsOnMethods="launchapp", groups="functional")
	public void registrationpage() {
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	}
	
	@Parameters({"firstname","fname","lastname","lname"})
	@Test(dependsOnMethods = "registrationpage", groups="regression")
	public void Name(String firstname,String fname,String lastname,String lname ) {
		driver.findElement(By.id(firstname)).sendKeys(fname);
		driver.findElement(By.name(lastname)).sendKeys(lname);
	}
	@Parameters({"street","streetname","city","cityname"})
	@Test(dependsOnMethods = "Name",groups="sanity")
	public void Address1(String street, String streetname, String city, String cityname) {
		driver.findElement(By.id(street)).sendKeys(streetname);
		driver.findElement(By.id(city)).sendKeys(cityname);
	}
	@Parameters({"state","statename","zipcode","zipcodenumber"})
	@Test(dependsOnMethods = "Address1",groups="smoke")
	public void Address2(String state, String statename, String zipcode, String zipcodenumber) {
		driver.findElement(By.id(state)).sendKeys(statename);
		driver.findElement(By.id(zipcode)).sendKeys(zipcodenumber);
		
	}
	@Parameters({"phonenumber","number","ssn","ssnnumber"})
	@Test(dependsOnMethods = "Address2",groups= {"smoke","sanity"})
	public void contact(String phonenumber, String number, String ssn, String ssnnumber) {
		driver.findElement(By.id(phonenumber)).sendKeys(number);
		driver.findElement(By.id(ssn)).sendKeys(ssnnumber);
	}
	@Parameters({"username","un","password","pwd","repassword","rpwd"})
	@Test(dependsOnMethods = "contact",groups= {"smoke","regression"})
	public void login(String username, String un, String password, String pwd, String repassword, String rpwd) {
		driver.findElement(By.id(username)).sendKeys(un);
		driver.findElement(By.id(password)).sendKeys(pwd);
		driver.findElement(By.id(repassword)).sendKeys(rpwd);
		
	}
	
	@Test(dependsOnMethods = "login",groups="sanity")
	public void submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
