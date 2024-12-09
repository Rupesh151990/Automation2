package testcases;

import org.testng.annotations.*;

import base.TestBase;
import pages.LandingPage;

public class LandingPage_TestCase extends TestBase{
	
	
	LandingPage ldpage;
	
	public LandingPage_TestCase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		ldpage=new LandingPage();
	}
	
	@Test
	public void verifyLandingPage() {
		ldpage.getloginPage();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
