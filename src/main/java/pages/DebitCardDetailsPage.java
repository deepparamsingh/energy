package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Testbase;

public class DebitCardDetailsPage extends Testbase {
	
	WebDriverWait wait= new WebDriverWait(driver, 15);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@FindBy(xpath = "//input[@id='elec_bank_name']")
	WebElement bankName;	
			
	@FindBy(xpath = "//input[@id='elec_branch_name']")
	WebElement branchName;
	
	@FindBy(xpath = "//input[@id='elec_account_name']")
	WebElement accountName; 
	
	@FindBy(xpath = "//input[@id='elec_account_no']")
	WebElement accountNumber;
	
	@FindBy(xpath = "//input[@id='elec_bsb']")
	WebElement bsbNumber;
		
	@FindBy(xpath = "//label[@for='elec_debitcheckbox_117']")
	WebElement checkBoxOne;
	
	@FindBy(xpath = "//label[@for='elec_debitcheckbox_118']")
	WebElement checkBoxTwo;
	
	@FindBy(xpath = "//a[@id='next_direct_debit']")
	WebElement debtCardBtn;
	
	
	
	
	
	
	
	public DebitCardDetailsPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public OtpPage validateDebitCardDetailsPage() throws Throwable
	{		
		Thread.sleep(3000);
		sendKeys(driver, bankName, 5, "Qwerty");
		sendKeys(driver, branchName, 5, "xyz");
		sendKeys(driver, accountName, 5, "Param");
		sendKeys(driver, accountNumber, 5, "123123123");
		sendKeys(driver, bsbNumber, 5, "000000");
		clickOn(driver, checkBoxOne, 5);
		clickOn(driver, checkBoxTwo, 5);
		clickOn(driver, debtCardBtn, 5);
		
		
		System.out.println("Your debit card details filled");
		return new OtpPage();
}

}
