package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Testbase;

public class SaleCreatedPage extends Testbase {

	
	
	WebDriverWait wait= new WebDriverWait(driver, 15);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@FindBy(xpath = "//div[@class='plan-confrim-tab2 plan-confrim-tab2_1']")
	WebElement confirmationElec;	
			
	@FindBy(xpath = "//div[@class='plan-confrim-tab2 plan-confrim-tab2_2']")
	WebElement confirmationGas;
	
	
		
	
	
	
	
	public SaleCreatedPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public SaleCreatedPage validateSaleCreatedPage() throws Throwable
	{		
		Thread.sleep(10000);
		//js.executeScript("arguments[0].scrollIntoView();", otpcheckBox1);
		String confirmationElecText=confirmationElec.getText();
		String confirmationGasText= confirmationGas.getText();
		System.out.println("Your Electricity Confirmation is :"+ confirmationElecText);
		System.out.println("Your Gas Confirmation is :"+ confirmationGasText);		
		System.out.println("Thank you!!! for using our services.");
		return new SaleCreatedPage();
		
}

}
