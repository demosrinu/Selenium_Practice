package com.qa.restasurred;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import com.qa.util.Jsonpayload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class FirstRestAssured {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
			String response = given().log()
									.all()
									.queryParam("key", "qaclick123")
									.header("Content-Type", "application/json")
									.body(Jsonpayload.ADDplace())
				
							.when().post("/maps/api/place/add/json")
		
							.then().assertThat()
									.statusCode(200)
									.body("scope", equalTo("APP"))
									.header("Server", "Apache/2.4.18 (Ubuntu)")
									.extract()
									.response()
									.asString();
		
		System.out.println(response);
		JsonPath js =new JsonPath(response);
		String placeID = js.get("place_id");
		System.out.println(placeID);
		
		
		//update place
		String newaddress = "unitedkingdom, london";
							given().log()
									.all()
									.queryParam("key", "qaclick123")
									.header("Content-Type","application/json")
									.body("{\r\n"
											+ "\"place_id\":\""+placeID+"\",\r\n"
											+ "\"address\":\""+newaddress+"\",\r\n"
											+ "\"key\":\"qaclick123\"\r\n"
											+ "}")
									
							.when().put("/maps/api/place/update/json")
							
							.then().assertThat()
									.log()
									.all()
									.statusCode(200)
									.body("msg", equalTo("Address successfully updated"));
									
						//GET Place
							
			String newplaceresponse = given().log()
									.all()
									.queryParam("key", "qaclick123")
									.queryParam("place_id", placeID)
							
							.when().get("/maps/api/place/get/json")
							
							.then().assertThat()
									.log()
									.all()
									.statusCode(200)
									.extract()
									.response()
									.asString();
									
		JsonPath js1 = Jsonpayload.RawToJson(newplaceresponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newaddress);
	}

}
