package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr) {
		this.pr = pr;
	}

	public Response PostReq(String jsonreqbody, String urikey) {
		 
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(jsonreqbody)
				.when()
				.post(pr.getProperty(urikey));
		return res;
	}
	
	//23rd April
	
	public Response GetReq(String urikey, String idval) {
		
		 //uriKey -- Base
		// endpoint -- idvalue
		String base = pr.getProperty(urikey);
		String uri = base+"/"+idval;
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		
		return res;
	}
	
	public Response GetReq(String urikey) {
		
		 //uriKey -- Base
		// endpoint -- idvalue
		//String base = pr.getProperty(urikey);
		//String uri = base+"/"+idval;
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(urikey));
		
		return res;
	}
	
	//30 April
	
	public Response GetAllReq(String urikey) {
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(urikey));
		
		return res;
	}
	
	public Response PutReq(String jsonreqbody, String urikey, String pathParameter) {
		 
		String uri = pr.getProperty(urikey)+"/"+pathParameter;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(jsonreqbody)
				.when()
				.put(uri);
		
		return res;
	}
	
	public Response DeleteReq(String urikey, String idval) {
		
		 //uriKey -- Base
		// endpoint -- idvalue
		String base = pr.getProperty(urikey);
		String uri = base+"/"+idval;
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		
		return res;
	}
	
	public Response PutReq(String jsonreqbody, String urikey) {
		 
		//String uri = pr.getProperty(urikey)+"/"+pathParameter;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(jsonreqbody)
				.when()
				.put(pr.getProperty(urikey));
		
		return res;
	}
	
	public Response DeleteReq(String urikey) {
		
		 //uriKey -- Base
		// endpoint -- idvalue
		//String base = pr.getProperty(urikey);
		//String uri = base+"/"+idval;
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(pr.getProperty(urikey));
		
		return res;
	}
}
