package com.orangehrm.PageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.Pages.AccountLoginPage;
import com.orangehrm.Pages.AssignLeavePage;
import com.orangehrm.Pages.DashboardPage;
import com.orangehrm.TestBase.TestBase;

public class DashboardPageTest extends TestBase{
	
AccountLoginPage loginPage;
DashboardPage dashboardPage;
AssignLeavePage assignLeavePage;
	
	@BeforeMethod
	public void setup()
	{
		initialise();
		loginPage= new AccountLoginPage();
	
	}
	
	
	
	//@Test
	public void validateLoginFunctionality()
	{
		dashboardPage = loginPage.Login("Admin","admin123");
		dashboardPage.Logout();
		
	}
	
	@Test
	public void validateLoginAndAssignLeave()
	{
		 dashboardPage = loginPage.Login("Admin","admin123");
		 assignLeavePage = dashboardPage.clickOnAssignLeave();
		 
		 assignLeavePage.employeeName();
		 assignLeavePage.clickOnLeaveType();
		 assignLeavePage.dropdown();
		 
		 //assignLeavePage.selectCANPersonal();
		 assignLeavePage.clickOnFromDate();
		 //assignLeavePage.clickOnToDate();
		 assignLeavePage.typeComments();
		 assignLeavePage.clickOnAssign();
		//assignLeavePage.clickOnAssignLeaveOk();
		 
		 dashboardPage.Logout();
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		tearDown();
	}
	


}

