
package PropertyFile;

import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataIntoPropertyFile {

	public static void main(String[] args) throws Exception {
		//step1 create object of property file
				Properties p= new Properties();

				//step2 provide keys and values details
				p.setProperty("browser", "Edge");
				p.setProperty("username","admin");
				p.setProperty("password","manager");

				//step3 path for property file
				FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\WriteData.properties ");

				//step4 load the property file
				p.store(fos, "This is my common data file");

	}

}
