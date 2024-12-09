package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.TestBase;
import pages.LandingPage;
import pages.LoginPage;
import utils.CustomListener;

@Listeners(CustomListener.class)
public class LoginPage_TestCase extends TestBase{
	
	LandingPage ldpage;
	LoginPage lgpage;
	
	public LoginPage_TestCase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		ldpage =new LandingPage();
		lgpage= new LoginPage();
		
		ldpage.getloginPage();
	}
	
	@Test
	public void verifyLoginFunctionality() {
		lgpage.getCredentails();
		String title=driver.getTitle();
		Assert.assertEquals(title,"abe");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
