package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class PlanListingPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
//	@FindBy(xpath = "//div[@id='monthly' and @plan-type='electricity' and @elec-plan-id='642']")
//	WebElement plan;
//	
	@FindBy(xpath = "//div[@class='power-price detailpage item plan-list-elec gas-and-electri plan-list-combo']//div[@id='monthly']")
	WebElement plan;
	
		
	@FindBy(xpath = "//a[@id='continue_applyNow']")
	WebElement popUp;
	
	//continue_applyNow
	
	
	public PlanListingPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public YourAccountPage validateSelectPlan() throws Throwable
	{
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", plan);
		clickOn(driver, plan, 5);
		System.out.println("plan selected");
		Thread.sleep(3000);
		//clickOn(driver, popUp, 5);
		popUp.click();
		System.out.println("Plan popup clicked");
	return new YourAccountPage();
		
	}

	
	

}
