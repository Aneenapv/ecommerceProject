package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

//public class GoogleSearchSteps {
// 
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside- browser opened");
//	   driver = new ChromeDriver();
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//	   driver.manage().window().maximize();
//	}
//
//	
//	@And("user is on google.com page")
//	public void user_is_on_google_com_page() {
//		System.out.println("Inside- opens google.com");
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@And("user enters automation step by step on search bar")
//	public void user_enters_automation_step_by_step_on_search_bar() {
//		System.out.println("Inside- user entered search text");
//		driver.findElement(By.id("APjFqb")).sendKeys("automation step by step");
//		
//		   
//	}
//
//	@And("user clicks on enter button")
//	public void user_clicks_on_enter_button() {
//		   System.out.println("Inside- user clicked enter button");
//		   driver.findElement(By.xpath("//input[@value='Google Search']")).click();
//	}
//
//	@Then("user navigated to automation step by step page lists")
//	public void user_navigated_to_automation_step_by_step_page_lists() {
//		   System.out.println("Inside- opened the search page list");
//		   driver.getPageSource().contains("Online Courses");
//		   
//		   driver.close();
//	}
//
//	
//}
