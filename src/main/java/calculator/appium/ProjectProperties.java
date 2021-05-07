package calculator.appium;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectProperties {
	
	public String readProperty(String key, String source) {
		
		Properties prop = new Properties();
		InputStream input = null;
		String propValue="";
		try {

			input = getClass().getClassLoader().getResourceAsStream(source + ".properties");

			// load a properties file
			prop.load(input);

			// get the property value
			propValue=prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return propValue;
	}
}
