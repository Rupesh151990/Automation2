package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	WebElement useremail;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement signInbutton;

	@FindBy(xpath = "//p[text()='Invalid login']")
	WebElement loginErrorMessage;

	public void getVaildUserCredentails() {

		useremail.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signInbutton.click();
	}

	public void getInVaildUserCredentails() {

		useremail.sendKeys(prop.getProperty("username1"));
		password.sendKeys(prop.getProperty("password2"));
		signInbutton.click();
	}

	public void getMsg() {
		String test = loginErrorMessage.getText();
		System.out.println(test);
		Assert.assertEquals(test, "testasd");

	}

}
