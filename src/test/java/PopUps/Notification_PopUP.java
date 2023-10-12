package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_PopUP {

	public static void main(String[] args) throws Exception {
		/*
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		*/
		//EdgeOptions options=new EdgeOptions();
		//options.addArguments("--disable-notification");
		
		EdgeOptions options=new EdgeOptions();
		//options.setCapability("--disable-infobars",true);
		options.setCapability("--disable-infobars",true);
		options.setCapability("--disable-notification",false);	
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.quikr.com/");
		Thread.sleep(3000);
	     //driver.close();
				

	}

}
