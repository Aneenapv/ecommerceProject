package com.parabankautomation.TestBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.parabankautomation.Browsers.Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriverListener driver;
	private Browsers BROWSER;
	private final String URL ="https://parabank.parasoft.com/parabank/index.htm;jsessionid=63526A5998D9FF93424BCD4926B3386A"; 
	
	public static Logger logger;
	public WebDriverListener events;
	public EventFiringDecorator eDriver;
	
	public void initialise()
	{
		setBrowser();
		initialiseWebdriver();
		
	}

	  private void setBrowser()
	    {
		String browser = System.getProperty("browser","CHROME").toUpperCase();
		try
		{
			BROWSER = Browsers.valueOf(browser);
		}
		catch(IllegalArgumentException e)
		{
			throw new InvalidArgumentException("Enter correct browser name");
		}
	    }
	  
	  private void initialiseWebdriver()
	  {
		  switch(BROWSER)
		  {
		  case CHROME:
			          WebDriverManager.chromedriver().setup();
			          ChromeOptions ChromeOptions = new ChromeOptions();
			          setBrowserOptions(ChromeOptions);
			          driver = (WebDriverListener) new ChromeDriver(ChromeOptions);
			          break;
			          
		  case FIREFOX:
			           WebDriverManager.firefoxdriver().setup();
			           FirefoxOptions FirefoxOptions = new FirefoxOptions();
			           setBrowserOptions(FirefoxOptions);
			           driver = (WebDriverListener) new FirefoxDriver(FirefoxOptions);
			           break;
			           
		  case EDGE:
			          WebDriverManager.edgedriver().setup();
			          EdgeOptions EdgeOptions = new EdgeOptions();
			          setBrowserOptions(EdgeOptions);
			          driver = (WebDriverListener) new EdgeDriver(EdgeOptions);
			          break;
			          
			 default:
				     throw new InvalidArgumentException("Enter correct browser name");
		  }
		  
		  
		  eDriver = new EventFiringDecorator(driver);
		  events = new WebdriverEvents();
		  
		  
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
