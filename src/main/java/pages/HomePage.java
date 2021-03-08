package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class HomePage extends Testbase {

	//PageFactory
	@FindBy(xpath = "//input[@class='postcode ui-autocomplete-input']")
	WebElement postCodeinput;
	
	

	@FindBy(xpath = "//div[@class='field-wrap']//div[@class='main-input']//a[@id='submit_postalcode']")
	
	WebElement compare;
	
	
	
	
	
	//Intilizing The Page Objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public ElectricityPage validatePostcode() throws Throwable
	{
		sendKeys(driver, postCodeinput, 5, "2000, BARANGAROO, NSW");
		//clickOn(driver, compare, 5);
		sendKeys(Keys.ENTER);
		return new  ElectricityPage();
	}


	
	

	
	
	



}
