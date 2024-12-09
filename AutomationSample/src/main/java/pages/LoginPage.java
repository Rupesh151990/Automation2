package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbttn;
	
	public void getCredentails() {
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		loginbttn.click();
	}
	
}
