
 
package Sample;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.get("https://www.google.com");
		
		LoginPage lp= new LoginPage(driver);
		Thread.sleep(2000);		
        lp.clickOnSearch("facebook");
        Thread.sleep(2000);
        driver.close();
	}

	
}
