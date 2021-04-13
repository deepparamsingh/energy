package com.qa.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import pages.ElectricityPage;
import pages.HomePage;
import pages.LifeSupportPage;
import pages.ResidentialPage;
import pages.SolarPage;

public class SolarTest extends Testbase {

	HomePage homepage;
	ElectricityPage elecPage;
	ResidentialPage residentailPage;
	SolarPage solar;
	LifeSupportPage lifesupportpage;
	
	
	public  SolarTest() {
			
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
	   elecPage=homepage.validatePostcode();
	   residentailPage=elecPage.validateElecSelect();
	   solar= residentailPage.validatePropertySelect();
	  
   }
   
	@Test(priority=1)
	public void validatePropertyTest() throws Throwable 
	{
		lifesupportpage=solar.validateSolarSelect();
    
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

