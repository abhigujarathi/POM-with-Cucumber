package testRunners;

import org.junit.runner.RunWith;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/AppFeatures"},
		glue= {"StepDefinitions","AppHooks"},
		plugin = {"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)

public class MyTestRunner {

}
