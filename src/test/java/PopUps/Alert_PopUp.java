package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_PopUp {

	public static void main(String[] args) {
		WebDriver driver =WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//Get text from Confirmation PopUp
		Alert alert=driver.switchTo().alert();
		
		String a1=alert.getText();
		System.out.println(a1);
		
		// Click on OK Confirmation PopUp
		alert.accept();
		System.out.println("Clicked on Ok button on Confirmation PopUp");
		
		// Click on Cancel on Confirmation PopUp
		alert.dismiss();
		System.out.println("Clicked on Cancel button on Confirmation PopUp");
		
		

	}

}
