package Page_Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Swag_Login_Page {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]")WebElement loginbtn;
	
	public Swag_Login_Page(WebDriver driver) //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public String title_mthd()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void login_mthd(String un,String pswd)
	{
		username.sendKeys(un);
		password.sendKeys(pswd);
		loginbtn.click();
	}
	
	public String url_mthd()
	{
		String actual_url=driver.getCurrentUrl();
		return actual_url;
	}
}


