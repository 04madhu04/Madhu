

package PropertyFile;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	
	public static void main(String[] args) throws Exception {
		// Step 1: take the property file path
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		//Step 2: create object from property file
		Properties p= new Properties();
		
		//Step 3: load the file into object of properties
		p.load(fis);
		//Step 4: get the values of the property file based on key
		String BROWSER=p.getProperty("browser");
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

	}

}
