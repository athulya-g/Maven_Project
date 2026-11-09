package Test_Pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Pkg.Swag_Base_Class;

public class Swag_Home_Test extends Swag_Base_Class {

	@Test(priority=1)
	public void text_verify()
	{
		//obj.login_mthd("standard_user", "secret_sauce");//calls the login page method before executing Home_Test mthd
		String product_txt=hp.text_mthd();
		Assert.assertEquals(product_txt, "Products");
	}
	
	@Test(priority =2)
	public void link_verify()
	{
		int linkcount=hp.linkcount_mthd();
		System.out.println("Number of links---"+linkcount);
	}
	
	@Test(priority = 3)
	public void cartbtn_mthd()
	{
		hp.cart_mthd();
	}
}
