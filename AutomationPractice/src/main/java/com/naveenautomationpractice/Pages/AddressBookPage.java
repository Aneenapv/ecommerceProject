package com.naveenautomationpractice.Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomationpractice.RandomGenerator.RandomGenerator;
import com.naveenautomationpractice.TestBase.TestBase;

public class AddressBookPage extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	   //doubt1
	//WebDriverWait wait1 = new WebDriverWait(driver,20);
	
	public AddressBookPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()='New Address']")
	WebElement clickOnNewAddressButton;
	public void clickOnNewAddressButton()
	{
		clickOnNewAddressButton.click();
	}
	
	@FindBy(id="input-firstname")
	WebElement enterFirstName;
	public void enterFirstName(String firstname)
	{
		enterFirstName.sendKeys(firstname);
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement clickOnLastName;
	
	public void clickOnLastName(String lastname)
	{
		clickOnLastName.sendKeys(lastname);
	}
	
	
	@FindBy(xpath="//input[@name='address_1']")
	WebElement clickOnAddressLine;
	
	public void clickOnAddressLine()
	{
		clickOnAddressLine.sendKeys("drury crescent");
	}
	
	
	@FindBy(xpath="//input[@name='city']")
	WebElement clickOnCity;
	
	public void clickOnCity()
	{
		clickOnCity.sendKeys("Brampton");
	}
	
	
	@FindBy(xpath="//input[@name='postcode']") 
	WebElement clickOnPostCode;
	
	public void clickOnPostCode()
	{
		clickOnPostCode.sendKeys("L6T 1L2");
	}
	
	@FindBy(id="input-country") 
	WebElement clickOnSelectDropdownCountry;
	
	
	@FindBy(id="input-zone") 
	WebElement clickOnSelectDropdownState;
	
	
	
	

	@FindBy(xpath="//input[@value='Continue']")
	WebElement clickContinue;
	
	public void clickContinue()
	{
		clickContinue.click();
	}
	

	public void FormElements()
	{
		clickOnNewAddressButton();
		enterFirstName(RandomGenerator.randomFirstname());
		clickOnLastName(RandomGenerator.randomLastname());
		clickOnAddressLine();
		clickOnCity();
		clickOnPostCode();
		
		selectDropdown(clickOnSelectDropdownCountry,"38","Canada");
		wait.until(ExpectedConditions.textToBePresentInElement(clickOnSelectDropdownCountry,"Canada"));
		selectDropdown(clickOnSelectDropdownState,"610","Ontario");
	
		clickContinue();
		
	}
	
}
