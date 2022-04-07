package calendarhandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrentYEARCurrentMONTH {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		Thread.sleep(3000);
		
		Calendar calendar = Calendar.getInstance();//it is a static class and set calendar to the instance
		
		String Date = "25-FEB-2022";
		SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		
		try {
			DateFormat.setLenient(false);
			Date FormattedDate = DateFormat.parse(Date);
			calendar.setTime(FormattedDate);//calendar is set to given date
			
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int month = calendar.get(Calendar.MONTH);
			int year = calendar.get(Calendar.YEAR);
			
			driver.findElement(By.id("second_date_picker")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()="+day+"]")).click();
			
			
		} 
		
		catch (ParseException e) {
			throw new Exception("Invalid Date, Provide valid input");
		}

	}

}
