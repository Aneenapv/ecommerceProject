package com.naveenautomationpractice.PageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationpractice.Pages.AccountLoginPage;
import com.naveenautomationpractice.TestBase.TestBase;

public class MyAccountPageTest extends TestBase{
	
AccountLoginPage accountLoginPage;
	
	@BeforeMethod
	public void openBrowser()
	{
		initialise();
		accountLoginPage = new AccountLoginPage();
	}
	
	@Test
	public void validateLoginWithValidCredentials()
	{
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}
