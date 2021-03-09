package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import pages.HomePage;

public class HomePageTest extends Testbase {

	HomePage homepage;
	public  HomePageTest() {
			
		super();
		
	}
	
	@BeforeMethod
   public void setup()
   {
	   initialization();
	   homepage= new HomePage();
   }
   
	@Test(priority=1)
	public void homePageTitleTest() throws Throwable
	{
     homepage.validatePostcode();
     
    
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	
	
}
