package com.orangehrm.PageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.Pages.AccountLoginPage;
import com.orangehrm.Pages.DashboardPage;
import com.orangehrm.Pages.EmployeeListPage;
import com.orangehrm.TestBase.TestBase;

public class EmployeeListPageTest extends TestBase{
	
	AccountLoginPage loginPage;
	DashboardPage dashboardPage;
	EmployeeListPage employeeListPage;
	
	@BeforeMethod
	public void setup()
	{
		initialise();
		loginPage= new AccountLoginPage();
	
	}
	
	

	@Test
	public void validateLoginFunctionality()
	{
		dashboardPage = loginPage.Login("Admin","admin123");
		employeeListPage = dashboardPage.clickOnPIM();
		employeeListPage.employeeName();
		employeeListPage.clickOnSearch();
		dashboardPage.Logout();
		
	}


	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}
