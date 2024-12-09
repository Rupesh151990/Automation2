package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashBoardPageObject;

public class DashBoardPage_TestCase extends TestBase {
	
	DashBoardPageObject dbpage;

	public DashBoardPage_TestCase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();	
	}
	
	@Test
	public void verifyLoginNavigation() {
		dbpage=new DashBoardPageObject();
		dbpage.getLoginNavigation();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
