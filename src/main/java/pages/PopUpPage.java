package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class PopUpPage extends Testbase {


	@FindBy(xpath = "//input[@id='firstname']")
	WebElement lifeSupportNo;
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement movinNo;
	
	
	@FindBy(xpath = "")
	WebElement concessionNo;
	
	
	@FindBy(xpath = "//button[@class='single-form-next movingpropertynext']")
	WebElement buttonMovinPropertyPage;
	
	
	public PopUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public PlanListingPage validatePopUp() throws Throwable
	{
		return null;
		
		
	
	}
	
	
}
