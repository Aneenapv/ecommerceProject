package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	
	//constructor
	public LoginPageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(id="input-email")
	WebElement txt_username;
	
	private @FindBy(id="input-password")
	WebElement txt_password;
	
	private @FindBy(xpath="//input[@type='submit']")
	WebElement btn_Login;
	
	private @FindBy(css="div.list-group a:nth-of-type(5)")
	WebElement btn_wishListDisplayed;
	
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_Login.click();
	}
	
	public void wishListDisplayed()
	{
		btn_wishListDisplayed.isDisplayed();
	}
	
	
//	public List<WebElement> getMyLinks()
//	{
//		List<WebElement> linkslist = driver.findElements(By.className("list-group"));
//		return linkslist;
//	}
	
	
	@FindBy(className="list-group")
	List<WebElement> linkslist;
	
	public List<WebElement> getMyLinks()
	{
		return linkslist;
	}
}
