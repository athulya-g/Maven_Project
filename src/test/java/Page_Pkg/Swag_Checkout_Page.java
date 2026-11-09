package Page_Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_Checkout_Page {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")WebElement firstname;
	@FindBy(xpath="//*[@id=\"last-name\"]")WebElement lastname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")WebElement postalcode;
	@FindBy(xpath="//*[@id=\"continue\"]")WebElement cont_btn;
	
	public Swag_Checkout_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void chkout_mthd(String fn,String ln,String p)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		postalcode.sendKeys(p);
		cont_btn.click();	
	}		
}
