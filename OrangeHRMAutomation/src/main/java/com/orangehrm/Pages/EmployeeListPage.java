package com.orangehrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.TestBase.TestBase;

public class EmployeeListPage extends TestBase {
	
	public EmployeeListPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement employeeName;
    public void employeeName()
    {
    	employeeName.sendKeys("joy smith");
    }
    
    @FindBy(xpath="//button[@type='submit']")
	WebElement clickOnSearch;
    public void clickOnSearch()
    {
    	clickOnSearch.click();
    }
    
	@FindBy(css="ul li:nth-of-type(3) a.oxd-topbar-body-nav-tab-item")
	WebElement addEmployee;
	public AddEmployeePage addEmployee()
	{
		addEmployee.click();
		return new AddEmployeePage();
	}
	

	
  
}
