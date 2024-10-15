package com.naveenautomationpractice.TestBase;

import java.time.Duration;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
		
		public static WebDriver driver;
		
		private final String browser = "chrome";
		private final String URL="https://naveenautomationlabs.com/opencart/index.php?route=account/login";
		
		
		public void initialise()
		  {
			initialiseWebdriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(URL);
		  }

		
		
		
		private void initialiseWebdriver() {
			
			switch(browser)
			{
			case "chrome" : 
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox" : 
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge" : 
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
				
				default: 
					throw new InvalidArgumentException("enter correct browser name");
			}
			
		   }
		
		
		
		public void selectDropdown(WebElement element,String value,String text)
		{
		Select select = new Select(element);
		try
		{
			select.selectByValue(value);
		}
		catch(Exception e)
		{
			select.selectByVisibleText(text);
		}
		
		}
		
		public void fillTransferForm(WebElement element,String text)
		{
			element.clear();
			element.sendKeys(text);
		}


	public void tearDown()
	{
		driver.quit();
	}
		
}	




