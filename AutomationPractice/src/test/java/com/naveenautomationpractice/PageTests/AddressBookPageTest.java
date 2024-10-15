package com.naveenautomationpractice.PageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationpractice.Pages.AccountLoginPage;
import com.naveenautomationpractice.Pages.AddressBookPage;
import com.naveenautomationpractice.Pages.MonitorsPage;
import com.naveenautomationpractice.Pages.MyAccountPage;
import com.naveenautomationpractice.Pages.MyWishListPage;
import com.naveenautomationpractice.TestBase.TestBase;

public class AddressBookPageTest extends TestBase {

	

	AccountLoginPage accountLoginPage;
	MyAccountPage myAccountPage;
	AddressBookPage addressBookPage;
	
	@BeforeMethod
	public void openBrowser()
	{
		initialise();
		accountLoginPage = new AccountLoginPage();
	}
	
	@Test
	public void LoginWithValidCredentialsAndAddAddress()
	{
		myAccountPage = accountLoginPage.login("centanvin68@gmail.com","Password@1234");
		String myaccountHeadingText = myAccountPage.myAccountHeading();
		Assert.assertEquals("My Account",myaccountHeadingText,"Text not matching");
		
		addressBookPage = myAccountPage.clickOnAddressBook();
		addressBookPage.FormElements();
		
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}




