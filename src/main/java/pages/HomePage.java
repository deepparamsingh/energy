package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class HomePage extends Testbase {

	//PageFactory
	@FindBy(xpath = "//input[@class='postcode ui-autocomplete-input']")
	WebElement postCodeinput;
	
	

	@FindBy(xpath = "//span[normalize-space()='Compare Now']")
	
	WebElement compare;
	
	
	
	
	
	
	//Intilizing The Page Objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public ElectricityPage validatePostcode() throws Throwable
	{
		Thread.sleep(3000);
		sendKeys(driver, postCodeinput, 2, "2000, BARANGAROO, NSW");
		System.out.println("post code entered");
		Thread.sleep(2000);
		clickOn(driver, compare, 2);
		System.out.println("compare button clicked");

		//sendKeys(Keys.ENTER);
		return new  ElectricityPage();
	}


	
	

	
	
	



}
