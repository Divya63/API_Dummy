package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.responsevalidation.Response_Validaton;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFIle;
import org.testing.utilities.ParsingJson_OrgJson;
import org.testing.utilities.VariableReplace;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostReq {
	
	static  String respiIdValue;

	@Test
	public  void testCase1() throws IOException {
		
		
		/*
		 Properties pr = LoadFile.loadproperties("../ApiFramework/URI.properties" );
		 HTTPMethods h = new HTTPMethods(pr);
		 String str = LoadJsonFIle.jsonData("../ApiFramework/src/test/java/org/testing/resources/requestpayload.json");
		 h.PostReq(str, "QA_Selenium_URI");
		*/
		
		
		// 17th April
		Properties pr = LoadFile.loadproperties("../ApiFramework/URI.properties" );
		String jsonbody = LoadJsonFIle.jsonData("../ApiFramework/src/test/java/org/testing/resources/requestpayload.json");
		
		//random class will generate random value for string
		Random rn = new Random();
		Integer idval = rn.nextInt();		
		jsonbody = VariableReplace.replaceValue(jsonbody, "id", idval.toString());
		
		System.out.println("Please enter first name");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String fname = sc.next();
		jsonbody = VariableReplace.replaceValue(jsonbody, "firstname", fname);
		
		System.out.println("Please enter Last name");
		String lname = sc.next();
		jsonbody = VariableReplace.replaceValue(jsonbody, "lastname", lname);
		
		System.out.println("Please enter Company name");
		String comp = sc.next();
		jsonbody = VariableReplace.replaceValue(jsonbody, "company_name", comp);
		
		System.out.println("Please enter Designation");
		String desig = sc.next();
		jsonbody = VariableReplace.replaceValue(jsonbody, "designation", desig);
		
		HTTPMethods http = new HTTPMethods(pr);
		//h.PostReq(jsonbody, "QA_Selenium_URI");
		
		//23rd April
		Response resp = http.PostReq(jsonbody, "QA_Java_URI");
		
		System.out.println("########  Test Case1 -- Post Request############ ");
		System.out.println("Status code :" + resp.getStatusCode());
		System.out.println("Response data is: " + resp.asString());
		
		
		respiIdValue = ParsingJson_OrgJson.parsejson(resp.asString(), "id");
		
		Response_Validaton.statuscode_Validate(resp, 200);
		
			}
}
