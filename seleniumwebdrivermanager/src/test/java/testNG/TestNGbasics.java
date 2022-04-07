package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
	
	//execution order is same as here
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}

}
