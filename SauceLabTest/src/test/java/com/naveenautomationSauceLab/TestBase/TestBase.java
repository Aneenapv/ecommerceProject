package com.naveenautomationSauceLab.TestBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {
	
    public static WebDriver driver = null;

    public static final String USERNAME = "oauth-pvaneena-5ab7f";
    public static final String ACCESS_KEY = "de9c361a-9338-4724-80d0-4670af538f21";
    public static final String SAUCE_URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";

    @Parameters({"browser", "platform", "version"})
    @BeforeMethod
    public void setup(String browser, String platform, String version) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBrowserVersion(version);
            chromeOptions.setPlatformName(platform);
            driver = new RemoteWebDriver(new URL(SAUCE_URL), chromeOptions);
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.setBrowserVersion(version);
            edgeOptions.setPlatformName(platform);
            driver = new RemoteWebDriver(new URL(SAUCE_URL), edgeOptions);
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBrowserVersion(version);
            firefoxOptions.setPlatformName(platform);
            driver = new RemoteWebDriver(new URL(SAUCE_URL), firefoxOptions);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
