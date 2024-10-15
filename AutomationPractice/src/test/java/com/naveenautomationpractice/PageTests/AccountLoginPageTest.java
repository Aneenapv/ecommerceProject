package com.naveenautomationpractice.PageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationpractice.Pages.AccountLoginPage;
import com.naveenautomationpractice.Pages.MyAccountPage;
import com.naveenautomationpractice.TestBase.TestBase;

public class AccountLoginPageTest extends TestBase {
	
	AccountLoginPage accountLoginPage;
	MyAccountPage myAccountPage;
	
	@BeforeMethod
	public void openBrowser()
	{
		initialise();
		accountLoginPage = new AccountLoginPage();
	}
	
	@Test
	public void validateLoginWithValidCredentials()
	{
		myAccountPage = accountLoginPage.login("centanvin68@gmail.com","Password@1234");
		String myaccountHeadingText = myAccountPage.myAccountHeading();
		Assert.assertEquals("My Account",myaccountHeadingText,"Text not matching");
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}
