package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DashBoardPage extends TestBase{
	
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Start Here']")
	WebElement loginlink;
	
	
	public LoginPage getLoginLink() {
		
		loginlink.click();
		return new LoginPage();
	}

}
