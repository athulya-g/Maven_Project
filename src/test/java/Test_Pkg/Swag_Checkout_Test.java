package Test_Pkg;

import org.testng.annotations.Test;

import Base_Pkg.Swag_Base_Class;

public class Swag_Checkout_Test extends Swag_Base_Class {
	
	@Test(priority = 1)
	public void chckout_page()
	{
		chk.chkout_mthd("abcd", "v", "678623");
	}

}
