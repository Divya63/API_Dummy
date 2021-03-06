package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.Response_Validaton;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFIle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_RealTime_Put 
{
	@Test
	public void testCase9() throws IOException
	{
		Properties pr = LoadFile.loadproperties("../Dummy_Api_Framework_Prac/URI.properties");
		String jsonbody = LoadJsonFIle.jsonData("../Dummy_Api_Framework_Prac/src/test/java/org/testing/resources/Update_Dummy.json");
		
		HTTPMethods ht = new HTTPMethods(pr);
		//Response resp = ht.PutReq(jsonbody, "",TC1_PostReq.respiIdValue);
		Response resp = ht.PutReq(jsonbody, "RealAPI_put");
		
		System.out.println("########  Test Case9 --RealTime Put Request ############ ");
		System.out.println("Status code :" + resp.getStatusCode());
		System.out.println("Response data is: " + resp.asString());
		Response_Validaton.statuscode_Validate(resp, 200);
	}
}
