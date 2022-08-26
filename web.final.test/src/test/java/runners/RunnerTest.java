package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features"
		,glue= {"stepDefinitions"}
		,tags = {"@Formulario"}
		,plugin = {"pretty", "html:target/cucumber-reports"}
		,monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false
		)

public class RunnerTest {

}
