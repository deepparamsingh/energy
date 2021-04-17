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
		Thread.sleep(2000);
		sendKeys(driver, firstname, 5, prop.getProperty("username"));
		//firstname.sendKeys(prop.getProperty("username"));
		sendKeys(driver, email, 5, prop.getProperty("email"));
		//email.sendKeys(prop.getProperty("email"));
		sendKeys(driver, phone, 5, prop.getProperty("phone"));
		//phone.sendKeys(prop.getProperty("phone"));
		//popUpSubmit.click();
		clickOn(driver, popUpSubmit, 5);
		
		 System.out.println("Pop value entered");
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
