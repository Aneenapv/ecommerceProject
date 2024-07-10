package com.orangehrm.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.TestBase.TestBase;

public class AssignLeavePage extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
	
	public AssignLeavePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement employeeName;
	public void employeeName()
	{
		employeeName.sendKeys("Timothy Lewis Amiano");
	}

	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	WebElement clickOnLeaveType;
	public void clickOnLeaveType()
	{
		clickOnLeaveType.click();
	}
	
	
	List <WebElement> dropdownList = driver.findElements(By.cssSelector("div.oxd-select-wrapper div.oxd-select-dropdown"));
	public void dropdown()
	{
	System.out.println("aneena list size" +dropdownList.size());
	}
	
	
	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[1]")
	WebElement clickOnFromDate;

	public void clickOnFromDate() {
		//wait.until(ExpectedConditions.visibilityOf(clickOnFromDate));
		clickOnFromDate.sendKeys("2024-08-07");
	}
	
	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[2]")
	WebElement clickOnToDate;
	public void clickOnToDate()
	{
		clickOnToDate.sendKeys("2024-09-07");
	}
	

	@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement typeComments;
	public void typeComments()
	{
		typeComments.sendKeys("family emergency leave");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnAssign;
	public void clickOnAssign()
	{
		clickOnAssign.click();
	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin']")
	WebElement clickOnAssignLeaveOk;
	public void clickOnAssignLeaveOk()
	{
		clickOnAssignLeaveOk.click();
	}
	
	
	
	
	
}
