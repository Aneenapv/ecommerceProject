package com.orangehrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.TestBase.TestBase;

public class AccountLoginPage extends TestBase{
	
	public AccountLoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameLogin;
	public void usernameLogin(String username)
	{
		usernameLogin.sendKeys(username);
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordLogin;
	public void passwordLogin(String password)
	{
		passwordLogin.sendKeys(password);
	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnLogin;
	public void clickOnLogin()
	{
		clickOnLogin.submit();
	}
	
	public DashboardPage Login(String username,String password)
	{
		 usernameLogin(username);
		 passwordLogin(password);
		 clickOnLogin();
		 return new DashboardPage();
	}
	
	

}
