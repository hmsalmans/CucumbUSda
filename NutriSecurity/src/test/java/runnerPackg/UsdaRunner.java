package runnerPackg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "Features",
		glue     = "SteDefPckg",
		plugin   = { "pretty", "html: target/report.html" },
				tags = "@tag1"
				
		
		)



public class UsdaRunner {

}
