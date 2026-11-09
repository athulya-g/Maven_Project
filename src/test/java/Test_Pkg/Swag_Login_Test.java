package Test_Pkg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Pkg.Swag_Base_Class;

public class Swag_Login_Test extends Swag_Base_Class {
	
	@Test(priority = 1)
	public void title_verification()
	{
		String actual_title=obj.title_mthd();
		Assert.assertEquals(actual_title, "Swaglabs");
	}
	
	@Test(priority = 2)
	public void logintest_mthd()
	{
		obj.login_mthd("standard_user", "secret_sauce");
	}	
	
	@Test(priority = 3)
	public void url_validation()
	{
		String home_url=obj.url_mthd();
		System.out.println("Home Url: "+home_url);
		//Assert.assertEquals(home_url,"https://www.saucedemo.com/inventory.html");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}
}
