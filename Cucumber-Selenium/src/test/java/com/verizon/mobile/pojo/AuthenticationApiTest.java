package com.verizon.mobile.pojo;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthenticationApiTest {

	
	@Test
	public void AuthenticationBasics()
	{
		//	RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
		//	RequestSpecification request = RestAssured.given();
		//	Response response = request.get();
		
		Response response = RestAssured.get("http://restapi.demoqa.com/authentication/CheckForAuthentication");
		
		System.out.println("Status code: " + response.getStatusCode());
		System.out.println("Status message " + response.body().asString());
		
		
		// verify post response status
		Assert.assertEquals(response.getStatusCode(), 201);
	}
}
