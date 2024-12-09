package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DashBoardPageObject extends TestBase{

	public DashBoardPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Start Here']")
	WebElement loginNavigation;
	
	public LoginPageObject getLoginNavigation() {
		loginNavigation.click();
		return new LoginPageObject();
		
	}
}
