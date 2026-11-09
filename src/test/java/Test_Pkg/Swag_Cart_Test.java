package Test_Pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Pkg.Swag_Base_Class;

public class Swag_Cart_Test extends Swag_Base_Class {
	
	@Test(priority = 1)
	public void cart_icon()
	{
		cp.cartclick_mthd();
	}

	@Test(priority = 2)
	public void carttext_verification()
	{
		String cart_txt=cp.carttxt_verify();
		Assert.assertEquals(cart_txt, "Your Cart");
	}
	
	@Test(priority = 3)
	public void checkout_bth()
	{
		cp.checkout_mthd();
	}
}
