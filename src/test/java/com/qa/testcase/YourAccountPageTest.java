package com.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;

import pages.ElectricityPage;
import pages.HomePage;
import pages.LifeSupportPage;
import pages.PlanListingPage;
import pages.PopUpPage;
import pages.ResidentialPage;
import pages.SolarPage;
import pages.YourAccountPage;
import pages.YourConnectionPage;

public class YourAccountPageTest extends Testbase {
	
	HomePage homepage;
	ElectricityPage elecPage;
	ResidentialPage residentailPage;
	SolarPage solar;
	LifeSupportPage lifesupportpage;
	PopUpPage popUp;
	PlanListingPage planlisting;
	YourAccountPage  accountPage;
	YourConnectionPage connectionPage;
	
	
	public  YourAccountPageTest() {
			
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
	   elecPage=homepage.validatePostcode();
	   residentailPage=elecPage.validateElecSelect();
	   solar= residentailPage.validatePropertySelect();
	   lifesupportpage=solar.validateSolarSelect();
	   popUp=lifesupportpage.validateLifeSuport();
	   planlisting=popUp.validateCredentials();
	   accountPage=planlisting.validateSelectPlan();
   }
   
	@Test(priority=1)
	public void validateYourConnectionDetailsTest() throws Throwable 
	{
		
		connectionPage= accountPage.validateYourAccountPageDetails();	
    
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}


}
