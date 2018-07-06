package CucumberFramework.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/CucumberFramework/FeatureFiles/"},
		glue = {"CucumberFramework.StepFiles"},
		plugin = {"pretty", "html:target/cucumber",
				"json:target/cucumber.json"
			//	,
				//"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
		},
		monochrome = true
		)

public class MainRunner {
}
