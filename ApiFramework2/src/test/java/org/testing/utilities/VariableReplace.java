package org.testing.utilities;

import java.util.regex.Pattern;

public class VariableReplace {

		public static String replaceValue(String body, String varname, String varvalue) {
			
		body = body.replaceAll(Pattern.quote("{{"+varname+"}}"), varvalue);
			return body;
		}
}
