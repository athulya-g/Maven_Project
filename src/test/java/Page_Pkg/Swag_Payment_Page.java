package Page_Pkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Swag_Payment_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"finish\"]")WebElement finish;
	
	public Swag_Payment_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void screenshot_mthd() throws IOException
	{
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Selenium Works\\Screenshot\\swagpayment.png"));
	}
	
	public void finish_btn()
	{
		finish.click();
	}
}
