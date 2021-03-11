package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class SolarPage extends Testbase {

	
	@FindBy(xpath = "//span[@class='rdl-label' and contains(text(),'No, I dont')]")
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
		clickOn(driver, solarno, 5);
		//solarno.click();
		return new LifeSupportPage();
	
	}
}

