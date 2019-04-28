package com.verizon.api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MobileGetApiTest {

	@Test
	public void GetWeatherDetails() {

	//	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

	//	RequestSpecification httpRequest = RestAssured.given();

		Response response = RestAssured.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");

		System.out.println("Response Body is =>  " + response.asString());
		
		// verify post response status
		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
