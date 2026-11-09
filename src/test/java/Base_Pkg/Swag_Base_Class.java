package Base_Pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Page_Pkg.Swag_Cart_Page;
import Page_Pkg.Swag_Checkout_Page;
import Page_Pkg.Swag_Home_Page;
import Page_Pkg.Swag_Login_Page;
import Page_Pkg.Swag_Payment_Page;
import Test_Pkg.Swag_Payment_Test;

public class Swag_Base_Class {

	public static WebDriver driver;
	
	public Swag_Login_Page obj;
	public Swag_Home_Page hp;
	public Swag_Cart_Page cp;
	public Swag_Checkout_Page chk;
	public Swag_Payment_Page pay;
		
	@BeforeTest
	public void setup()
	{
		//used to handle change password popup in browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void object_mthd()
	{
		obj=new Swag_Login_Page(driver);
		hp=new Swag_Home_Page(driver);
		cp=new Swag_Cart_Page(driver);
		chk=new Swag_Checkout_Page(driver);
		pay=new Swag_Payment_Page(driver);
	}
}
