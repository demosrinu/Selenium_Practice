package com.qa.restasurred;

import com.qa.util.Jsonpayload;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(Jsonpayload.CoursePrice());
		//print no.of courses returned by api
		js.getInt("couses.size()");

	}

}
