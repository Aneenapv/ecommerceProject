//package StepsForHooks;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.*;
//
//public class HooksSteps {
//	
//	WebDriver driver= null;
//	
//	@Before(order=1)
//	public void browserSetup()
//	{
//		System.out.println("....I am inside browser setup from  before hooks....");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//	}
//	
//
//	//@Before(order=0)
//	//@Before("@smoke")
//	
//	@Before(value="@smoke",order=0)
//		
//	
//	public void setup2()
//	{
//		System.out.println("...I am inside setup2...with smoke tag");
//	}
//	
//	@BeforeStep
//	public void beforeSteps()
//	{
//		System.out.println("I am inside beforeSteps");
//	}
//	
//	@AfterStep
//	public void afterSteps()
//	{
//		System.out.println("I am inside afterSteps");
//	}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	
//	}
//
//	@When("user enters valid credentials")
//	public void user_enters_valid_credentials() {
//	
//	}
//
//	@When("user clicks on login button")
//	public void user_clicks_on_login_button() {
//	  
//	}
//
//	@Then("user navigated to homepage")
//	public void user_navigated_to_homepage() {
//	  
//	}
//	
//	@After(order=0)
//	public void tearDown()
//	{
//		System.out.println("....I am inside browser teardown from after hooks....");
//		driver.quit();
//	}
//
//	@After(order=1)
//	public void tearDown2()
//	{
//		System.out.println("...I am inside tearDown2...");
//	}
//
//}