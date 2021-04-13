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
	
//	@FindBy(xpath = "//select[@id='updatetitle']")
//	WebElement selectTitle;
	
//	@FindBy(id = "updatetitle")
//	WebElement selectTitle;
	
//	WebElement selectText=driver.findElement(By.xpath("//select[@id='updatetitle']"));
	
	WebElement selectText=driver.findElement(By.cssSelector("#updatetitle"));
	
	
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='updatedob']")
	WebElement updatedob;
	
	@FindBy(xpath = "//span[normalize-space()='Energy']")
	WebElement energy_link;
	
	
	
	
	
	
	
	public YourAccountPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public YourConnectionPage validateYourAccountPageDetails() throws Throwable
	{		
		js.executeScript("arguments[0].scrollIntoView();", energy_link);
		Thread.sleep(3000);
		selectText.click();
//		Select selectNameTitle = new Select(selectText);
		//Thread.sleep(3000);
		//selectNameTitle.selectByVisibleText("Mr");	
		sendKeys(driver, lastname, 15, "deep singh");
		sendKeys(driver, updatedob, 15, "25041995");	
//		lastname.sendKeys("deep singh");
//		updatedob.sendKeys("25041995");
		System.out.println("Title selected");
	return new YourConnectionPage();
}

} 