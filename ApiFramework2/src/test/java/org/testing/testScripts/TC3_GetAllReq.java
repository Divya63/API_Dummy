package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.Response_Validaton;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetAllReq 
{
	@Test
	public  void testCase3() throws IOException {
		
		Properties pr = LoadFile.loadproperties("../ApiFramework/URI.properties" );
		HTTPMethods http = new HTTPMethods(pr);
		Response res =  http.GetAllReq("QA_Java_URI");
		
		System.out.println("########  Test Case3 -- GetAll Request ########### ");
		System.out.println("Status code :" + res.getStatusCode());
		System.out.println("Response data is: " + res.asString());
		
		Response_Validaton.statuscode_Validate(res, 200);
}
}
