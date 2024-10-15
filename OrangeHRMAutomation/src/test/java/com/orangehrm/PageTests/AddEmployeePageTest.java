package com.orangehrm.PageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.Pages.AccountLoginPage;
import com.orangehrm.Pages.AddEmployeePage;
import com.orangehrm.Pages.DashboardPage;
import com.orangehrm.Pages.EmployeeListPage;
import com.orangehrm.TestBase.TestBase;

public class AddEmployeePageTest extends TestBase {
	
	AccountLoginPage loginPage;
	DashboardPage dashboardPage;
	EmployeeListPage employeeListPage;
	AddEmployeePage  addEmployeePage;
	
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
		addEmployeePage = employeeListPage.addEmployee();
		addEmployeePage.addEmployee();
		dashboardPage.Logout();
		
	}


	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	

}


