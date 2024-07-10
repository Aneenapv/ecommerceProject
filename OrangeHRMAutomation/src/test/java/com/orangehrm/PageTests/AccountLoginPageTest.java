package com.orangehrm.PageTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.Pages.AccountLoginPage;
import com.orangehrm.TestBase.TestBase;


public class AccountLoginPageTest extends TestBase {
	
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void setup()
	{
		initialise();
		loginPage= new AccountLoginPage();
	
	}
	
	
	
	
	@Test
	public void validateLoginFunctionality()
	{
		loginPage.Login("Admin","admin123"); 
		
	}
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	


}
