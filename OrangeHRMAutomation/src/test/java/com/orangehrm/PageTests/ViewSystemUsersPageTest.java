package com.orangehrm.PageTests;

import com.orangehrm.TestBase.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.Pages.AccountLoginPage;
import com.orangehrm.Pages.AddEmployeePage;
import com.orangehrm.Pages.DashboardPage;
import com.orangehrm.Pages.EmployeeListPage;
import com.orangehrm.Pages.ViewSystemUserPage;


public class ViewSystemUsersPageTest extends TestBase{
	
	AccountLoginPage loginPage;
	DashboardPage dashboardPage;
	EmployeeListPage employeeListPage;
	AddEmployeePage  addEmployeePage;
	ViewSystemUserPage viewSystemUserPage;
	
	@BeforeMethod
	public void setup()
	{
		initialise();
		loginPage= new AccountLoginPage();
	
	}
	

	@Test
	public void validateLoginAndAdmin()
	{
		dashboardPage = loginPage.Login("Admin","admin123");
		viewSystemUserPage = dashboardPage.clickOnAdmin();
		viewSystemUserPage.userEmployeeName();
		dashboardPage.Logout();
		
	}


	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}


	

