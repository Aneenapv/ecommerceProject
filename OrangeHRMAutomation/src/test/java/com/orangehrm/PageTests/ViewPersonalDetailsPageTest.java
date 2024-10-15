package com.orangehrm.PageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.Pages.AccountLoginPage;
import com.orangehrm.Pages.AddEmployeePage;
import com.orangehrm.Pages.DashboardPage;
import com.orangehrm.Pages.EmployeeListPage;
import com.orangehrm.Pages.ViewPersonalDetailsPage;
import com.orangehrm.Pages.ViewSystemUserPage;
import com.orangehrm.TestBase.TestBase;

public class ViewPersonalDetailsPageTest extends TestBase {
	
	AccountLoginPage loginPage;
	DashboardPage dashboardPage;
	EmployeeListPage employeeListPage;
	AddEmployeePage  addEmployeePage;
	ViewPersonalDetailsPage viewPersonalDetailsPage;
	
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
		viewPersonalDetailsPage = dashboardPage.clickOnMyInfo();
		viewPersonalDetailsPage.personalDetails();
		dashboardPage.Logout();
		
	}


	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}


