package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8_RealTime_GetAll 
{
	@Test
	public void testCase8() throws IOException
	{
		 Properties pr = LoadFile.loadproperties("../ApiFramework/URI.properties" );
		 HTTPMethods http = new HTTPMethods(pr);
		 
		Response res =  http.GetAllReq("RealAPI_getall");
		
		System.out.println("########  Test Case8 -- Real_Time_GetAll Request ########### ");
		System.out.println("Status code :" + res.getStatusCode());
		System.out.println("Response data is: " + res.asString());

	}
}
