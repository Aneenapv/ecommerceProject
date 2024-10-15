package com.naveenautomationpractice.PageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationpractice.Pages.AccountLoginPage;
import com.naveenautomationpractice.Pages.MonitorsPage;
import com.naveenautomationpractice.Pages.MyAccountPage;
import com.naveenautomationpractice.Pages.MyWishListPage;
import com.naveenautomationpractice.TestBase.TestBase;

public class MyWishListPageTest extends TestBase{
	
	AccountLoginPage accountLoginPage;
	MyAccountPage myAccountPage;
	MonitorsPage monitorsPage;
	MyWishListPage  myWishListPage;
	
	@BeforeMethod
	public void openBrowser()
	{
		initialise();
		accountLoginPage = new AccountLoginPage();
	}
	
	@Test
	public void LoginWithValidCredentialsAndWishListRemove()
	{
		myAccountPage = accountLoginPage.login("centanvin68@gmail.com","Password@1234");
		String myaccountHeadingText = myAccountPage.myAccountHeading();
		Assert.assertEquals("My Account",myaccountHeadingText,"Text not matching");
	
		monitorsPage = myAccountPage.componentsMonitor();
		myAccountPage = monitorsPage.addMonitors();
		myWishListPage = myAccountPage.clickOnWishList();
		myWishListPage.RemoveProducts();
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}


