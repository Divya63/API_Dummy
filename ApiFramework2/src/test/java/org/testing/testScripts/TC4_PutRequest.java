package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.responsevalidation.Response_Validaton;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFIle;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest 
{

	@Test
	public static void testCase4() throws IOException {
	
		Properties pr = LoadFile.loadproperties("../ApiFramework/URI.properties" );
		String jsonbody = LoadJsonFIle.jsonData("../ApiFramework/src/test/java/org/testing/resources/update_payload.json");
				
		HTTPMethods http = new HTTPMethods(pr);
		Response resp = http.PutReq(jsonbody, "QA_Java_URI", TC1_PostReq.respiIdValue);
		
		System.out.println("######## Test Case4--Put Request ############ ");
		System.out.println("Status code :" + resp.getStatusCode());
		System.out.println("Response data is: " + resp.asString());
		
		//respiIdValue = ParsingJson_OrgJson.parsejson(resp.asString(), "id");
		Response_Validaton.statuscode_Validate(resp, 200);

}
}
