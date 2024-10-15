package com.naveenautomationpractice.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomationpractice.TestBase.TestBase;

public class MonitorsPage extends TestBase {
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	
	public  MonitorsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="div.row div.product-layout:first-of-type div div div:nth-of-type(2) button:nth-of-type(2)")
	WebElement appleCinema;
	public void appleCinema()
	{
		appleCinema.click();
	}
	
	@FindBy(css="div.row div.product-layout:nth-of-type(2) div div div:nth-of-type(2) button:nth-of-type(2)")
	WebElement samsungSynchmaster;
	public void samsungSynchmaster()
	{
		samsungSynchmaster.click();
	}
	
	@FindBy(xpath="//span[@class='caret']")
	WebElement clickOnMyAccount;
	public void clickOnMyAccount()
	{
		clickOnMyAccount.click();
	}
	
	@FindBy(css="li.dropdown ul.dropdown-menu li:first-of-type a")
	WebElement clickOnMyAccountDrodown;
	public void clickOnMyAccountDrodown()
	{
		clickOnMyAccountDrodown.click();
	}
	
	public MyAccountPage addMonitors()
	{
		appleCinema();
		wait.until(ExpectedConditions.visibilityOf(samsungSynchmaster));
		samsungSynchmaster();
		clickOnMyAccount();
		clickOnMyAccountDrodown();
		return new MyAccountPage();
	}
	
	
	
	

}
