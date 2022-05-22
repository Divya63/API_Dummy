package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.Response_Validaton;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetRequest {
	
	@Test
	public  void testCase2() throws IOException {		
		 Properties pr = LoadFile.loadproperties("../ApiFramework2/URI.properties" );
		 HTTPMethods http = new HTTPMethods(pr);
		Response res =  http.GetReq("QA_Java_URI", TC1_PostReq.respiIdValue);
		
		System.out.println("###########  Test Case2 -- Get Request ################");
		System.out.println("Status code :" + res.getStatusCode());
		System.out.println("Response data is: " + res.asString());
		
		Response_Validaton.statuscode_Validate(res, 200);
		Response_Validaton.data_Validate(res, "Kiran", "firstname");
}
}
