package org.testing.responsevalidation;

import org.testing.utilities.ParseJson_JsonPath;
import io.restassured.response.Response;

public class Response_Validaton 
{
	public static void data_Validate(Response res,  String expected_Data, String jsonPath) {
		String actualData = ParseJson_JsonPath.parse_JsonPath(res, jsonPath);
		System.out.println(actualData);
		if(expected_Data.equals(actualData)) {
			System.out.println("Data is matching");
		}
		else
		{
			System.out.println("Data is not matching");
			}
		
	}
	
	public static void statuscode_Validate(Response res,  int expected_StatusCode) {
		int actual_StatusCode = res.statusCode();
		
		if(actual_StatusCode == expected_StatusCode ) {
			System.out.println("Status code matching");
		}
		else
		{
			System.out.println("Status code matching");
			
		}
		
	}
	
	
	
	
	

}
