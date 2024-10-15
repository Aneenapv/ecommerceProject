package com.naveenautomationpractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationpractice.TestBase.TestBase;

public class MyAccountPage extends TestBase{
	
	public  MyAccountPage ()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="#content h2:first-of-type")
	WebElement myAccountHeading;
	public String myAccountHeading()
	{
		return myAccountHeading.getText().trim();
	}

	
	@FindBy(xpath="//a[text()='Components']")
	WebElement clickOnComponents;
	public void clickOnComponents()
	{
		clickOnComponents.click();
	}
	
	@FindBy(xpath="//a[text()='Monitors (2)']")
	WebElement clickOnMonitor;
	public void clickOnMonitor()
	{
		clickOnMonitor.click();
	}
	
	public MonitorsPage componentsMonitor()
	{
		clickOnComponents();
		clickOnMonitor();
		return new MonitorsPage();
	}
	
	@FindBy(css="#column-right div a:nth-of-type(5)")
	WebElement clickOnWishList;
	public MyWishListPage clickOnWishList()
	{
		 clickOnWishList.click();
		 return new MyWishListPage();
	}
	
	@FindBy(css="#column-right div a:nth-of-type(4)")
	WebElement clickOnAddressBook;
	public AddressBookPage clickOnAddressBook()
	{
		clickOnAddressBook.click();
		 return new AddressBookPage();
		 
	}
	
	
	
}
