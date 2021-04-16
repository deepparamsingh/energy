package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class YourConnectionPage extends Testbase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "//input[@id='searchaddress']")
	WebElement searchAdddress;
	
	@FindBy(xpath = "//li[contains(text(),'Barangaroo Alexander, 27 Barangaroo Ave, BARANGARO')]")
	WebElement getAddress;
		
	@FindBy(xpath = "//button[@id='connection-next']")
	WebElement connectionPageSubmitBtn;
	
	
	
	public YourConnectionPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public DoHaveConcession validateYourConnectionPage() throws Throwable
	{		
		Thread.sleep(3000);
		clickOn(driver, searchAdddress, 5);
		sendKeys(driver, searchAdddress, 5,"Barangaroo");
		Thread.sleep(3000);
		clickOn(driver, getAddress, 10);
		js.executeScript("arguments[0].scrollIntoView();", connectionPageSubmitBtn);
		clickOn(driver, connectionPageSubmitBtn, 5);
		System.out.println("Your Connection details filled");
		return new DoHaveConcession();
}
}
