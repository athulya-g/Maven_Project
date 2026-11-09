package Test_Pkg;

import java.io.IOException;

import org.testng.annotations.Test;

import Base_Pkg.Swag_Base_Class;

public class Swag_Payment_Test extends Swag_Base_Class {
	
	@Test(priority = 1)
	public void scrnshottaken() throws Exception
	{
		pay.screenshot_mthd();
	}
	
	@Test(priority =2)
	public void end_btn()
	{
		pay.finish_btn();
	}

}
