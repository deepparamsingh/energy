package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class ResidentialPage extends Testbase {
	

	@FindBy(xpath = "//span[@class='rdl-label' and contains(text(),'Residential')]")
	WebElement propertyType;

		
	
	//Intilizing The Page Objects
	public ResidentialPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public SolarPage validatePropertySelect() throws Throwable
	{
		Thread.sleep(3000);
		clickOn(driver, propertyType, 5);
		//propertyType.click();
		return new SolarPage();
	
	}

}

