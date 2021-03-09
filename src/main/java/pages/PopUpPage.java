package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;


public class PopUpPage extends Testbase {


	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstname;
	

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath = "//button[@id='submitcustomer_detail']")
	WebElement popUpSubmit;
	
	
	public PopUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public PlanListingPage validateCredentials() throws Throwable
	{
		firstname.sendKeys(prop.getProperty("username"));
		email.sendKeys(prop.getProperty("email"));
		phone.sendKeys(prop.getProperty("phone"));
		popUpSubmit.click();
	    return new PlanListingPage();
		
	}
	
//	public AddOnsPage validateApplyButton() throws Throwable
//	{
//		Thread.sleep(1000);
//		applyButton.isDisplayed();
//		applyButton.click();
//		return new AddOnsPage();
//		
//	}
	
	
}
