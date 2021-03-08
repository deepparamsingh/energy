package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import pages.ElectricityPage;
import pages.HomePage;
import pages.LifeSupportPage;
import pages.PopUpPage;
import pages.ResidentialPage;
import pages.SolarPage;

public class LifeSupportTest extends Testbase {
	
	HomePage homepage;
	ElectricityPage elecPage;
	ResidentialPage residentailPage;
	SolarPage solar;
	LifeSupportPage lifesupportpage;
	PopUpPage popUp;
	
	
	public  LifeSupportTest() {
			
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
	   elecPage=homepage.validatePostcode();
	   residentailPage=elecPage.validateElecSelect();
	   solar= residentailPage.validatePropertySelect();
	   lifesupportpage=solar.validateSolarSelect();
	  
   }
   
	@Test(priority=1)
	public void validatelifesupportTest() throws Throwable 
	{
		popUp=lifesupportpage.validateLifeSuport();
    
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

