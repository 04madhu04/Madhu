
package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();	
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        java.util.List<WebElement> AllLinks=driver.findElements(By.tagName("a"));
        System.out.println(AllLinks.size());
        for(int i=1;i<AllLinks.size();i++) {
        System.out.println(AllLinks.get(i).getText());
        System.out.println(AllLinks.get(i).getSize());
		}
	}
      
	}


