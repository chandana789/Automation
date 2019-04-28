package com.aa.rest.assured;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.aa.pojos.Todos;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeesAPIsTest {
	
	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void employeesJavaToJsonConversion1() throws JsonProcessingException{

	  
		Todos e = new Todos(1,3,"title", false);
		
		String jsonInString = mapper.writeValueAsString(e);
		
			// add the assertions to validate response
		System.out.println(jsonInString);
	}
	
	
	@Test
	public void employeesJavaToJsonConversion() throws JsonProcessingException{

	  
		Map<String, Object> todoObject = new HashMap<String, Object>();
		todoObject.put("id", 3);
		
		String jsonInString = mapper.writeValueAsString(todoObject);
		
			// add the assertions to validate response
		System.out.println(jsonInString);
	}

	

}
