package org.testing.utilities;

import org.json.JSONObject;

public class ParsingJson_OrgJson 
{
	public static String parsejson(String responseData, String keyname) {
		
		JSONObject jo = new JSONObject(responseData);
		return  jo.getString(keyname);
		
	}
	

}
