package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadFile {
	
	//write logic for load property file and return obj of property class
	
	public static Properties loadproperties(String filepath) throws IOException {
	File f = new File(filepath);
	FileReader fr  =  new FileReader(f);
	Properties prop = new Properties();
	prop.load(fr);
	return prop;

	}

}
