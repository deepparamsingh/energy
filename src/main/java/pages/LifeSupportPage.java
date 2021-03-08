package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class LifeSupportPage extends Testbase {

	@FindBy(xpath = "//div[contains(@class,'close-it boxit no-box')]//span[@class='rdl-label'][contains(text(),'No')]")
	WebElement lifeSupportNo;
	
	
	@FindBy(xpath = "//div[contains(@class,'mb-view no-box')]//span[contains(@class,'rdl-label')][contains(text(),'No')]")
	WebElement movinNo;
	
	
//	@FindBy(xpath = "")
//	WebElement concessionNo;
	
	
	@FindBy(xpath = "//button[@class='single-form-next movingpropertynext']")
	WebElement buttonMovinPropertyPage;
	
	
	public LifeSupportPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public PopUpPage validateLifeSuport() throws Throwable
	{
		
		lifeSupportNo.click();
		movinNo.click();
		//concessionNo.click();
	
		buttonMovinPropertyPage.click();
//		Thread.sleep(5000);
		return new PopUpPage();
	
	}
	
	
	
	
	
	
}

