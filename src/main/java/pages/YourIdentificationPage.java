package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Testbase;

public class YourIdentificationPage extends Testbase {
	
	WebDriverWait wait= new WebDriverWait(driver, 15);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@FindBy(xpath = "//select[@id='identity_type']")
	WebElement selectIdentityType;
	
			
	@FindBy(xpath = "//select[@id='identity_type']//option[@value='Passport'][normalize-space()='Australian Passport']")
	WebElement australianPassport;
	
	@FindBy(xpath = "//input[@id='passport_number']")
	WebElement passportNumber;   
	@FindBy(xpath = "//input[@id='m_card_expiry_date']")
	WebElement cardExpDate;
		
	@FindBy(xpath = "//button[@id='identification-next']")
	WebElement identificationBtn;
	
	
	
	public YourIdentificationPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public DebitCardDetailsPage validateYourIdentificationPage() throws Throwable
	{		
		Thread.sleep(3000);
		WebElement selectIdentityTypeElement= wait.until(ExpectedConditions.elementToBeClickable(selectIdentityType));
		selectIdentityTypeElement.click();
		clickOn(driver, australianPassport, 5);
		Thread.sleep(2000);
		sendKeys(driver, passportNumber, 5,"123456789");
		Thread.sleep(1000);
		sendKeys(driver, cardExpDate, 5,"02 02 2023");
		Thread.sleep(1000);
		clickOn(driver, identificationBtn, 5);
		
		System.out.println("Your dentification details filled");
		return new DebitCardDetailsPage();
}

}
