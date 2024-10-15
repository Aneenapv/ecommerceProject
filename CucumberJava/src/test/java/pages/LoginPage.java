package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//public class LoginPage {
//	
//	WebDriver driver;
//	
//	//constructor
//	public LoginPage(WebDriver driver)
//	{
//		this.driver = driver;
//		
//		if(!driver.getTitle().equals("Account Login"))
//		{
//			throw new IllegalStateException("This is not Account login page: The current page url is= "+driver.getCurrentUrl());
//		}
//	}
//	
//	
//	private By txt_username = By.id("input-email");
//	private By txt_password = By.id("input-password");
//	private By btn_Login = By.xpath("//input[@value='Login']");
//	private By btn_Logout = By.cssSelector("div.list-group a:last-of-type");
//	
//	
//	public void enterUsername(String username)
//	{
//		driver.findElement(txt_username).sendKeys(username);
//	}
//	
//	public void enterPassword(String password)
//	{
//		driver.findElement(txt_password ).sendKeys(password);
//	}
//
//	public void clickLogin()
//	{
//		driver.findElement(btn_Login).click();
//	}
//	
//	public void verifyLogoutButton()
//	{
//		driver.findElement(btn_Logout).isDisplayed();
//	}
//	
//}
