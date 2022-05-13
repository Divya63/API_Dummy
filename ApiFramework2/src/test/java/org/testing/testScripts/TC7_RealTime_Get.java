package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_RealTime_Get 
{
	@Test
	public void testCase7() throws IOException
	{

		 Properties pr = LoadFile.loadproperties("../ApiFramework/URI.properties" );
		 HTTPMethods http = new HTTPMethods(pr);
		//Response res =  http.GetReq("RealAPI_get", TC6_RealTime_Post.respiIdValue);
		 
		 Response res =  http.GetReq("RealAPI_get");
		 
		System.out.println("###########  Test Case7 --Real_Time Get Request ################");
		System.out.println("Status code :" + res.getStatusCode());
		System.out.println("Response data is: " + res.asString());

		
	}

}
