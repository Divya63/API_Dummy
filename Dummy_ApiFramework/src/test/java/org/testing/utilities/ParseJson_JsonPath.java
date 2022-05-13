package org.testing.utilities;

import io.restassured.response.Response;

public class ParseJson_JsonPath 
{
	public static String parse_JsonPath(Response res, String jsonpath) 
	{
		return res.jsonPath().get(jsonpath);
		
	}

}
