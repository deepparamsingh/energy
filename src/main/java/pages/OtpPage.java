package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Testbase;

public class OtpPage extends Testbase {

	WebDriverWait wait= new WebDriverWait(driver, 15);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@FindBy(xpath = "//input[@name='checkbox_104']")
	WebElement otpcheckBox1;	
			
	@FindBy(xpath = "//input[@name='checkbox_86']")
	WebElement otpcheckBox2;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter the 4-digit code')]")
	WebElement otpCode; 
	
	@FindBy(xpath = "//button[@class='single-form-next confirmotp']")
	WebElement otpSubmit;
		
	
	
	
	
	public OtpPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public SaleCreatedPage validateOtpPage() throws Throwable
	{		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", otpcheckBox1);
		clickOn(driver, otpcheckBox1, 5);
		clickOn(driver, otpcheckBox2, 5);
		sendKeys(driver, otpCode, 5, "2608");
		clickOn(driver, otpSubmit, 5);
		
		
		System.out.println("Your debit card details filled");
		return new SaleCreatedPage();
}

}
