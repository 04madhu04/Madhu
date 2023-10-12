
package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver =WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   System.out.println("Logged out Sucessfully");
	   driver.quit();

	}

	public void loginToApp(String USERNAME, String PASSWORD) {
		// TODO Auto-generated method stub
		
	}

}
