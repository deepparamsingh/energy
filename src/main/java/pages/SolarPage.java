package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class SolarPage extends Testbase {

	
	@FindBy(xpath = "//span[normalize-space()='No, I dont']")
	WebElement solarno;

		
	
	//Intilizing The Page Objects
	public SolarPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public LifeSupportPage validateSolarSelect() throws Throwable
	{
		Thread.sleep(2000);
		clickOn(driver, solarno, 2);
		System.out.println("Solar option "+"no"+" clicked");
		//solarno.click();
		return new LifeSupportPage();
	
	}
}

