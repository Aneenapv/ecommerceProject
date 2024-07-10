package com.orangehrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.TestBase.TestBase;

public class ViewPersonalDetailsPage extends TestBase{
	
	public ViewPersonalDetailsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	public void firstname()
	{
		//firstname.sendKeys("Captain");
		fillTransferForm(firstname,"Captain");
	}
	
	@FindBy(xpath="//input[@name='middleName']")
	WebElement middlename;
	public void middlename()
	{
		//middlename.sendKeys("Marvel");
		fillTransferForm(middlename,"Marvel");
	}
	
	@FindBy(css="div.--gender-grouped-field div:first-of-type div:nth-of-type(2) div label span")
	WebElement radioButtonMale;
	public void radioButtonMale()
	{
		radioButtonMale.click();
	}
	
//	@FindBy(xpath="div.oxd-form-actions button")
//	WebElement clickOnSave;
//	public void clickOnSave()
//	{
//		clickOnSave.click();
//	}
	
	public void personalDetails()
	{
		firstname();
		middlename();
		radioButtonMale();
	}
	
	
	

}
