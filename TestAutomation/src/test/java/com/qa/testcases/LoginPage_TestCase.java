package com.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.DashBoardPageObject;
import com.qa.pages.LoginPageObject;
import com.qa.utils.ScreenShotListener;
import com.qa.utils.TestUtil;

@Listeners(ScreenShotListener.class)
public class LoginPage_TestCase extends TestBase {

	DashBoardPageObject dbpage;
	LoginPageObject loginpage;
	public static String sheetName = "loginCredentails";

	public LoginPage_TestCase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		dbpage = new DashBoardPageObject();
		loginpage = new LoginPageObject();

		dbpage.getLoginNavigation();
	}

	@DataProvider
	public Object[][] getLoginTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;

	}

	@Test(priority = 0, dataProvider = "getLoginTestData")
	public void verifyLoginFunctionality(String username, String pwd) {
		loginpage.getEnterUserCredenatails(username, pwd);
	}

	@Test(priority = 1, dataProvider = "getLoginTestData")
	public void verifypagetitle(String un, String pd) {
		verifyLoginFunctionality(un, pd);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
