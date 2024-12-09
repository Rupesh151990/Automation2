package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.DashBoardPage;
import com.qa.pages.LoginPage;

public class LoginPage_TestCase extends TestBase {

	DashBoardPage dbpage;
	LoginPage lgpage;

	public LoginPage_TestCase() {
		super();
	}

	@BeforeTest
	public void setup() {
		intialization();
		dbpage = new DashBoardPage();
		lgpage = new LoginPage();
		dbpage.getLoginLink();
	}

	@Test(priority = 0)
	public void verifyVaildLoginCredentails() {
		lgpage.getVaildUserCredentails();

	}

	@Test(priority = 1)
	public void verifyInvalidLoginCredentails() {
		lgpage.getInVaildUserCredentails();
		lgpage.getMsg();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
