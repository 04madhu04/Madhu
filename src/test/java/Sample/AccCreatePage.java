
package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccCreatePage {
	@FindBy(xpath="//*[contains(text(),'Create an account ')]")
	private WebElement createanAccbtn;
	
	@FindBy(id="firstName")
	private WebElement firstNametxt;
	
	@FindBy(id="lastName")
	private WebElement lastNametxt;
	
	public AccCreatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getCreateanAccbtn() {
		return createanAccbtn;
	}

	public void setCreateanAccbtn(WebElement createanAccbtn) {
		this.createanAccbtn = createanAccbtn;
	}

	public WebElement getFirstNametxt() {
		return firstNametxt;
	}

	public void setFirstNametxt(WebElement firstNametxt) {
		this.firstNametxt = firstNametxt;
	}

	public WebElement getLastNametxt() {
		return lastNametxt;
	}

	public void setLastNametxt(WebElement lastNametxt) {
		this.lastNametxt = lastNametxt;
	}
	
	
	public void createAcc() {
		
		createanAccbtn.click();
	}
public void firstName(String fname) {
		
	firstNametxt.sendKeys(fname);
}
}
