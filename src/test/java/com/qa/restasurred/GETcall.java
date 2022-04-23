package com.qa.restasurred;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GETcall {
	
	@Test
	public void TestResponseCode() {
		
		int code = get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=6bee2c146a83b62ade718dbd74436e87")
					.getStatusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(200, code);
	}
		
	@Test
	public void TestBody() {
		
		String resp = get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=6bee2c146a83b62ade718dbd74436e87")
					.asString();
		System.out.println(resp);
		
	}
		
	}