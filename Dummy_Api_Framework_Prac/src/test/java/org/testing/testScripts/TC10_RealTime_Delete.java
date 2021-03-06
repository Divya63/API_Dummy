package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.Response_Validaton;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC10_RealTime_Delete
{
	@Test
	public void testCase10() throws IOException
	{
		Properties pr = LoadFile.loadproperties("../Dummy_Api_Framework_Prac/URI.properties");
		 HTTPMethods http = new HTTPMethods(pr);
		Response res =  http.DeleteReq("RealAPI_delete");
		
		System.out.println("########  Test Case10--RealTime Delete Request######### ");
		System.out.println("Status code :" + res.getStatusCode());
		System.out.println("Response data is: " + res.asString());
		Response_Validaton.statuscode_Validate(res, 200);
		
	}
}
