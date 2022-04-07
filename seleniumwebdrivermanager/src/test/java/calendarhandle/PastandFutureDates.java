package calendarhandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PastandFutureDates {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandavenisrinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		Thread.sleep(7000);
		
		driver.findElement(By.id("second_date_picker")).click();//current month and current year
		SelectDate(driver,"25/Feb/2022", "dd/MMM/yyyy");
		
		driver.findElement(By.id("second_date_picker")).click();//previous date
		SelectDate(driver,"15/Oct/2021", "dd/MMM/yyyy");
		
		driver.findElement(By.id("second_date_picker")).click();//future date
		SelectDate(driver,"05/May/2023", "dd/MMM/yyyy");
		
	}
	
	public static void SelectDate(WebDriver driver, String targetdate, String dateformat) throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat targetteddateformat = new SimpleDateFormat(dateformat);
		
		try {
			
			targetteddateformat.setLenient(false);
			Date formattedtargetdate = targetteddateformat.parse(targetdate);
			calendar.setTime(formattedtargetdate);
			
			int targetday = calendar.get(Calendar.DAY_OF_MONTH);
			int targetmonth = calendar.get(Calendar.MONTH);
			int targetyear = calendar.get(Calendar.YEAR);
			
			String actualdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualdate));
			
			int actualmonth = calendar.get(Calendar.MONTH);
			int actualyear = calendar.get(Calendar.YEAR);
			
			
			//to get past date
			while(targetmonth < actualmonth || targetyear < actualyear) {
				
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
				actualdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualdate));
				
				actualmonth = calendar.get(Calendar.MONTH);
				actualyear = calendar.get(Calendar.YEAR);
			}
			
			//to get future date
			while(targetmonth > actualmonth || targetyear > actualyear) {
				
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				actualdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualdate));
				
				actualmonth = calendar.get(Calendar.MONTH);
				actualyear = calendar.get(Calendar.YEAR);
			}
			
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()="+targetday+"]")).click();
		} 
		catch (ParseException e) {
			throw new Exception("please provide valid input");
		}

	}

}
