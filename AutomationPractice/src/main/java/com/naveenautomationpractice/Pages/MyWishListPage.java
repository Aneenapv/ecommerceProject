package com.naveenautomationpractice.Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomationpractice.TestBase.TestBase;

public class MyWishListPage extends TestBase {
	
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		   
	public  MyWishListPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="#content div tbody tr:first-of-type  td:last-of-type a")
	WebElement samsungRemove;
	public void samsungRemove()
	{
		samsungRemove.click();
	}
	
	@FindBy(css="#content div tbody tr:last-of-type  td:last-of-type a")
	WebElement appleRemove;
	public void appleRemove()
	{
		appleRemove.click();
	}
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement clickOnContinueButton;
	public void clickOnContinueButton()
	{
		clickOnContinueButton.click();
	}
	
	public void RemoveProducts()
	{
		samsungRemove();
		wait.until(ExpectedConditions.elementToBeClickable(appleRemove));
		appleRemove();
		clickOnContinueButton();
	}
	
	

}
