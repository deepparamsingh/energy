package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import pages.ElectricityPage;
import pages.HomePage;
import pages.ResidentialPage;
import pages.SolarPage;

public class ResidentialPageTest extends Testbase {
	
	HomePage homepage;
	ElectricityPage elecPage;
	ResidentialPage residentailPage;
	SolarPage solar;
	
	
	public  ResidentialPageTest() {
			
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
	   elecPage=homepage.validatePostcode();
	   residentailPage=elecPage.validateElecSelect();
	  
   }
   
	@Test(priority=1)
	public void validatePropertyTest() throws Throwable 
	{
		
     solar= residentailPage.validatePropertySelect();
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}

}

