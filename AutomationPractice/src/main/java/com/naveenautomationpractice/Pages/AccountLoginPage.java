package com.naveenautomationpractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationpractice.TestBase.TestBase;

public class AccountLoginPage extends TestBase{

	public AccountLoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="input-email")
	WebElement enterEmail;
	public void enterEmail(String email)
	{
		enterEmail.sendKeys(email);
	}

	@FindBy(id="input-password")
	WebElement enterPassword;
	public void enterPassword(String pwd)
	{
		enterPassword.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement clickOnLoginButton;
	public void clickOnLoginButton()
	{
		clickOnLoginButton.submit();
	}
	
	
	public MyAccountPage login(String email, String pwd)
	{
		enterEmail(email);
		enterPassword(pwd);
		clickOnLoginButton();
		return new MyAccountPage();
	}

	
	
	

}
