package com.verizon.api;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.verizon.mobile.pojo.Todos;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MobilePostApiTest {
	
	@Test
	public void RegistrationSuccessful()
	{		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
		requestParams.put("Password", "password1");

		requestParams.put("Email",  "sample2ee26d9@gmail.com");
		request.body(requestParams.toJSONString());
		Response response = request.post("/register");

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}
	
	
	@Test
	public void postTodoListAPITest() throws JsonProcessingException {

		Todos todos = new Todos(1000, 1000, "dummy title", false);

		// one way to convert java object to json string
		ObjectMapper mapper = new ObjectMapper();
		String todosJsonString = mapper.writeValueAsString(todos);

		// get api response

		Response response = RestAssured.given().body(todosJsonString)
				.post("https://jsonplaceholder.typicode.com/todos");

		// verify post response status
		Assert.assertEquals(response.getStatusCode(), 201);

	}
	
	

}
