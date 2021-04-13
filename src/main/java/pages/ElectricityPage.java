package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class ElectricityPage extends Testbase{
	
		
		//PageFactory
		@FindBy(xpath = "//span[contains(text(),'Electricity & Gas')]")
		WebElement elec;

			
		
		//Intilizing The Page Objects
		public ElectricityPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions
		
		public ResidentialPage validateElecSelect() throws Throwable
		{
			Thread.sleep(3000);
			clickOn(driver, elec, 2);
			System.out.println("electricity type clicked");

			return new ResidentialPage();
		
		}
		
		
		
		
		



}

