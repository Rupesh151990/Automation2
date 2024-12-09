package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LandingPage extends TestBase{
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Start Here']")
	WebElement loginlink;
	
	public void getloginPage() {
		loginlink.click();
	}

}
