
package Sample;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestMainClass {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		
		AccCreatePage acc = new AccCreatePage(driver);
		
		Thread.sleep(2000);
		
		acc.createAcc();
		Thread.sleep(1000);
		//driver.navigate().forward();
		driver.navigate().to("https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");
		acc.firstName("Anil kumar");
		Thread.sleep(1000);
		driver.close();
	}
}
