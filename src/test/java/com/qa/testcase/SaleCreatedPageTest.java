package com.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;

import pages.DebitCardDetailsPage;
import pages.DoHaveConcession;
import pages.ElectricityPage;
import pages.HomePage;
import pages.LifeSupportPage;
import pages.OtpPage;
import pages.PlanListingPage;
import pages.PopUpPage;
import pages.ResidentialPage;
import pages.SaleCreatedPage;
import pages.SolarPage;
import pages.YourAccountPage;
import pages.YourConnectionPage;
import pages.YourIdentificationPage;

public class SaleCreatedPageTest extends Testbase{
	
	HomePage homepage;
	ElectricityPage elecPage;
	ResidentialPage residentailPage;
	SolarPage solar;
	LifeSupportPage lifesupportpage;
	PopUpPage popUp;
	PlanListingPage planlisting;
	YourAccountPage  accountPage;
	YourConnectionPage connectionPage;
	DoHaveConcession doYouhaveConcession;
	YourIdentificationPage yourIdentificationPage;
	DebitCardDetailsPage debitCardPage;
	OtpPage otpPage;
	SaleCreatedPage saleCreatedPage;
	
	
	public  SaleCreatedPageTest() {
			
		super();
		
	}
	
	@BeforeMethod
   public void setup() throws Throwable
   {
	   initialization();
	   homepage= new HomePage();
	   elecPage= new ElectricityPage();
	   residentailPage= new ResidentialPage();
	   solar = new SolarPage();
	   lifesupportpage= new LifeSupportPage();
	   popUp= new PopUpPage();
	   planlisting= new PlanListingPage();
	   accountPage= new YourAccountPage();
	   connectionPage = new YourConnectionPage();
	   doYouhaveConcession = new DoHaveConcession();
	   yourIdentificationPage = new YourIdentificationPage();
	   debitCardPage= new DebitCardDetailsPage();
	   otpPage= new OtpPage();
	   saleCreatedPage=new SaleCreatedPage();
	   elecPage=homepage.validatePostcode();
	   residentailPage=elecPage.validateElecSelect();
	   solar= residentailPage.validatePropertySelect();
	   lifesupportpage=solar.validateSolarSelect();
	   popUp=lifesupportpage.validateLifeSuport();
	   planlisting=popUp.validateCredentials();
	   accountPage=planlisting.validateSelectPlan();
	   connectionPage= accountPage.validateYourAccountPageDetails();
	   doYouhaveConcession=connectionPage.validateYourConnectionPage();
	   yourIdentificationPage=doYouhaveConcession.validateDoHaveConcession();
	   debitCardPage=yourIdentificationPage.validateYourIdentificationPage();
	   otpPage=debitCardPage.validateDebitCardDetailsPage();
   }
   
	@Test(priority=1)
	public void validateSaleCreatedPageTest() throws Throwable 
	{
		
		saleCreatedPage=saleCreatedPage.validateSaleCreatedPage();
	}
	
//	@AfterMethod
//	public void tearDown()
//	{//		driver.quit();
//	}



}
