
package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectDrop {

	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();

		 WebDriver driver = new EdgeDriver(); //launch the browser

        driver.manage().window().maximize(); // maximize the browser

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.calculator.net/interest-calculator.html");

        driver.findElement(By.xpath("//select")).sendKeys("monthly");

	}

}
