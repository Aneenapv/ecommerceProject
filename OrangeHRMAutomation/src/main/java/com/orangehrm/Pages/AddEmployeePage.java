package com.orangehrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.TestBase.TestBase;

public class AddEmployeePage extends TestBase {
	
	public  AddEmployeePage()
	{
		PageFactory.initElements(driver,this);
	}


	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement addEmployeeFirstname;
	public void addEmployeeFirstname()
	{
		addEmployeeFirstname.sendKeys("Aneena");
	}
	

	@FindBy(xpath="//input[@name='lastName']")
	WebElement addEmployeeLastname;
	public void addEmployeeLastname()
	{
		addEmployeeLastname.sendKeys("Vincent");
	}
	

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnSave;
	public void clickOnSave()
	{
		clickOnSave.click();
	}
	
	public void addEmployee()
	{
		addEmployeeFirstname();
		addEmployeeLastname();
		clickOnSave();
	}
	
}
