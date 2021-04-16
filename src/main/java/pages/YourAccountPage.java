package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.Testbase;

public class YourAccountPage extends Testbase{

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='updatedob']")
	WebElement updatedob;
	
	@FindBy(xpath = "//span[normalize-space()='Energy']")
	WebElement energy_link;
	
	@FindBy(xpath = "//select[@id='updatetitle']")
	WebElement title;
	@FindBy(xpath = "//option[@value='Mr']")
	WebElement mr;
	
	@FindBy(xpath = "//button[@id='acoountdetails-next']")
	WebElement accountSubmitBtn;
	
	
	
	public YourAccountPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public YourConnectionPage validateYourAccountPageDetails() throws Throwable
	{		
		js.executeScript("arguments[0].scrollIntoView();", energy_link);
		Thread.sleep(3000);
		clickOn(driver, title, 15);
		clickOn(driver, mr, 10);	
		sendKeys(driver, lastname, 15, "deep singh");		
		sendKeys(driver, updatedob, 15, "25 04 1995");	
		clickOn(driver, accountSubmitBtn, 5);
		System.out.println("Your Account details filled");
	return new YourConnectionPage();
}

} 