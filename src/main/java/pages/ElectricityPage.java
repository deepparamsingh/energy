package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class ElectricityPage extends Testbase{
	
		
		//PageFactory
		@FindBy(xpath = "//span[@class='rdl-label electriciy-gas' and contains(text(),'Electricity')]")
		WebElement elec;

			
		
		//Intilizing The Page Objects
		public ElectricityPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions
		
		public ResidentialPage validateElecSelect() throws Throwable
		{
			Thread.sleep(1000);
			elec.click();
			return new ResidentialPage();
		
		}
		
		
		
		
		



}

