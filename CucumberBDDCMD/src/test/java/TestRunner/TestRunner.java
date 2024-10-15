package TestRunner;

	import org.junit.runner.RunWith;
	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
	monochrome=true, 
	plugin={"pretty","html:target/HtmlReports/htmlReport",
			"json:target/cucumber.json"}
	//tags="@smoketest"
	)

	//plugin={"pretty","html:target/HtmlReports/htmlReport"}
	// plugin={"pretty","json:target/JsonReports/jsonReport"}
	// plugin={"pretty","junit:target/JunitReports/junitReport"}



	public class TestRunner {

	}




