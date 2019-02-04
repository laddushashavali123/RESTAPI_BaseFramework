package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        /*plugin = {"pretty", "html:target/cucumber --strict"},*/
        features = "src/test/resources/features",
        tags = "@run",
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"
                ,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:reports/extent-report.html"
        })
public class RunTests {

}
