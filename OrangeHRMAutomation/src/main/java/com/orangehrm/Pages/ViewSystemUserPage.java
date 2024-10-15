package com.orangehrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.TestBase.TestBase;

public class ViewSystemUserPage extends TestBase{
	
	public ViewSystemUserPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--focus']")
	WebElement username;
	public void username()
	{
		username.sendKeys("John");
	}
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement employeeName;
	public void employeeName()
	{
		employeeName.sendKeys("Aneena");
	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	public void searchButton()
	{
		searchButton.sendKeys("Aneena");
	}
	
	
	public void userEmployeeName()
	{
		//username();
		employeeName();
		searchButton();
	}

}
