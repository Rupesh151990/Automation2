package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashBoardPage;

public class DashBoard_TestCase extends TestBase{

	DashBoardPage dbPage;
	
	public DashBoard_TestCase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		dbPage = new DashBoardPage();
	}
	
	@Test
	public void verifyDashBoardLoginLink() {
		dbPage.getLoginLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
