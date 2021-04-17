package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Testbase;

public class DoHaveConcession extends Testbase{
	
	WebDriverWait wait= new WebDriverWait(driver, 15);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@FindBy(xpath = "//select[@id='concession_type']")
	WebElement concessionType;
	
			
	@FindBy(xpath = "//option[normalize-space()='DVA Gold Card']")
	WebElement selectConcessionType;
	
	@FindBy(xpath = "//input[@id='card_number']")
	WebElement cardNumber;   
	@FindBy(xpath = "//input[@id='card_start_date']")
	WebElement cardStartDate;
	@FindBy(xpath = "//input[@id='card_expiry_date']")
	WebElement cardExpDate;  
	@FindBy(xpath = "//input[@id='card_terms']")
	WebElement cardTermCheckbox;	
	
	
	@FindBy(xpath = "//button[@id='concession-next']")
	WebElement concessiontBtn;
	
	
	
	public DoHaveConcession() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public YourIdentificationPage validateDoHaveConcession() throws Throwable
	{		
		Thread.sleep(3000);
		WebElement concessionTypeElement= wait.until(ExpectedConditions.elementToBeClickable(concessionType));
		concessionTypeElement.click();
		clickOn(driver, selectConcessionType, 5);
		Thread.sleep(3000);
		sendKeys(driver, cardNumber, 5,"4242424242");
		Thread.sleep(1000);
		sendKeys(driver, cardStartDate, 5,"02 02 1995");
		Thread.sleep(1000);
		sendKeys(driver, cardExpDate, 5,"02 02 2023");
		Thread.sleep(1000);
		clickOn(driver, cardTermCheckbox, 5);
		js.executeScript("arguments[0].scrollIntoView();", concessiontBtn);
		Thread.sleep(2000);
		clickOn(driver, concessiontBtn, 5);
		
		System.out.println("Your Concession details filled");
		return new YourIdentificationPage();
}

}
