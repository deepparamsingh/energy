package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import pages.ElectricityPage;
import pages.HomePage;
import pages.ResidentialPage;

public class ElectricityPageTest extends Testbase{

	HomePage homepage;
	ElectricityPage elecPage;
	ResidentialPage residentailPage;
	
	public  ElectricityPageTest() {
			
		super();
		
	}
	
	@BeforeMethod
   public void setup() throws Throwable
   {
	   initialization();
	   homepage= new HomePage();
	   elecPage= new ElectricityPage();
	   residentailPage = new ResidentialPage();
	   elecPage=homepage.validatePostcode();
	  
   }
   
	@Test(priority=1)
	public void TaskTest() throws Throwable
	{
		residentailPage=elecPage.validateElecSelect();
    
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
