package org.testing.utilities;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonFIle {
	
	public static String jsonData(String jsonfilepath) throws IOException {
		File f = new File(jsonfilepath);
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new  JSONObject(jt);
		return jo.toString();
	}

}
