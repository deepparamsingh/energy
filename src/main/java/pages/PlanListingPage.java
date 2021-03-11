package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class PlanListingPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "//div[@id='monthly' and @plan-type='electricity' and @elec-plan-id='642']")
	WebElement plan;
	
	
	@FindBy(xpath = "//a[@id='continue_applyNow']")
	WebElement popUp;
	
	
	public PlanListingPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public YourAccountPage validateSelectPlan() throws Throwable
	{
		js.executeScript("arguments[0].scrollIntoView();", plan);
		clickOn(driver, plan, 5);
		clickOn(driver, popUp, 5);
	return new YourAccountPage();
		
	}

	
	

}
