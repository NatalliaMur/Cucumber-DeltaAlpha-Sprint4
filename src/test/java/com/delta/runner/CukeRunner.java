package com.delta.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith (Cucumber.class)
@CucumberOptions (
		
		plugin = {"pretty",
				"html:target/built-in-html-report",
				"json:target/Cucumber.json "
		
		},
		tags ="@smoke or @regression",
		features = "src/test/resources/com/delta/features",
		glue = "com/delta/step_defenitions"
//		,strict = true
//   ,  dryRun = true
//		,monochrome =true
//		,stepNotifications = true
//		,snippets = SnippetType.CAMELCASE
		)
public class CukeRunner {

}
