package sauceLabTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.naveenautomationSauceLab.TestBase.TestBase;

public class SauceLabNaveenAutomation extends TestBase {

    @Test
    public void validateLogin() throws InterruptedException {
        // Navigate to the login page
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        
        // Enter email and password
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("centanvin68@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@1234");
        
        // Submit the login form
        driver.findElement(By.xpath("//input[@type='submit']")).submit();

        // Validate the "My Account" heading is displayed
        boolean isMyAccountDisplayed = driver.findElement(By.cssSelector("div.row #content h2:first-of-type")).isDisplayed();
        Assert.assertTrue(isMyAccountDisplayed, "My Account section is not displayed.");

        // Optional: Add a delay to observe the result, useful for debugging
        Thread.sleep(3000);
    }
}

	
	
	
	
	
	
	
		

