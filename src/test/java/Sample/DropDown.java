
package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {


	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //launch the browser
		driver.manage().window().maximize(); // maximize the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.calculator.net/interest-calculator.html") ;
		Select select = new Select(driver.findElement(By.id("ccompound")));

        
        //List<WebElement> lst = select.getOptions();

        
        //System.out.println("The dropdown options are:");
        //for(WebElement options: lst)
            //System.out.println(options.getText());

        
        System.out.println("Select the Option by Index 4");
        select.selectByIndex(4);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        
         driver.quit();


	}

}
