package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/uiFeatures",
        glue = {"StepDefinitions"},
        dryRun = false,
        tags = {"@Regression"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = false
)

public class TestRunner {
}
