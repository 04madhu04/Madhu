
 
package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage {
	//Declaration
	@FindBy(id="APjFqb")
	private WebElement googleSearchEdt;
	private WebDriver driver;
	
	//Intialization
	public LoginPage(WebDriver driver)
	{
		//PageFactory.initElements(driver,this)
		this.driver=driver;
	}
	
	//Utilization
	public WebElement getGoogleSearchEdt()
	{
		return googleSearchEdt;
	}
	//Business Logic/Library
	public void clickOnSearch(String name) {
		googleSearchEdt.sendKeys(name);
		
	}

}
