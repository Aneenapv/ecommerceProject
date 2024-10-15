package com.orangehrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.TestBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(css="span i")
	WebElement clickOnSaraUser;
	public void clickOnSaraUser()
	{
		clickOnSaraUser.click();
	}

	@FindBy(css="ul.oxd-dropdown-menu li:last-of-type a")
	WebElement clickOnLogout;
	public void clickOnLogout()
	{
		clickOnLogout.click();
	}
	
	public void Logout()
	{
		 clickOnSaraUser();
		 clickOnLogout();
	}
	
	//assign leave
	@FindBy(xpath="//button[@title='Assign Leave']")
	WebElement clickOnAssignLeave;
	public AssignLeavePage clickOnAssignLeave()
	{
		clickOnAssignLeave.click();
		return new AssignLeavePage();
	}
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	WebElement clickOnPIM;
	public EmployeeListPage clickOnPIM()
	{
		clickOnPIM.click();
		return new EmployeeListPage();
	}
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement clickOnAdmin;
	public ViewSystemUserPage clickOnAdmin()
	{
		clickOnAdmin.click();
		return new ViewSystemUserPage();
		
	}
	
	@FindBy(xpath="//span[text()='My Info']")
	WebElement clickOnMyInfo;
	public ViewPersonalDetailsPage clickOnMyInfo()
	{
		clickOnMyInfo.click();
		return new ViewPersonalDetailsPage();
		
	}
	

	
	
	
	


}
