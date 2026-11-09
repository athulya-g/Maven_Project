package Page_Pkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_Home_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement products;
	@FindBy(tagName="a")List<WebElement>links;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")WebElement addcart;
	
 public Swag_Home_Page(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 public String text_mthd()
 {
	 String actual_txt=products.getText();//retrieve text 
	 return actual_txt;
 }
 
 public int linkcount_mthd()
 {
	 int count=links.size();//link size
	 return count;
 }
 
 public void cart_mthd()
 {
	 addcart.click();
 }
}
