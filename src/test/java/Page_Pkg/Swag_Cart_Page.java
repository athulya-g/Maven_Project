package Page_Pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Swag_Cart_Page {
	
	
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement cart;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement text;
	@FindBy(xpath="//*[@id=\"checkout\"]")WebElement checkout;
	
	public Swag_Cart_Page(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void cartclick_mthd()
	{
		cart.click();
	}
	
	public String carttxt_verify()
	{
		String actual_txt=text.getText();
		return actual_txt;
	}
	
	public void checkout_mthd()
	{
		checkout.click();
	}
}
