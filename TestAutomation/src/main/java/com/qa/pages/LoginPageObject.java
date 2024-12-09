package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPageObject extends TestBase{
	
	public LoginPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	public HomePageObject getEnterUserCredenatails(String username, String pwd) {
		email.sendKeys(username);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePageObject();
	}
}
