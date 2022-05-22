package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.Response_Validaton;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFIle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_RealTime_Post 
{
	//static  String respiIdValue;
	@Test
	public void testCase6() throws IOException
	{
		Properties pr = LoadFile.loadproperties("../Dummy_Api_Framework_Prac/URI.properties");
		String jsonbody = LoadJsonFIle.jsonData("../Dummy_Api_Framework_Prac/src/test/java/org/testing/resources/Dummy_Body.json");
		
		HTTPMethods ht = new HTTPMethods(pr);
		Response resp = ht.PostReq(jsonbody, "RealAPI_post");
		
		System.out.println("########  Test Case6 --RealTime Post Request ############ ");
		System.out.println("Status code :" + resp.getStatusCode());
		System.out.println("Response data is: " + resp.asString());
		
		Response_Validaton.statuscode_Validate(resp, 200);
}

}

