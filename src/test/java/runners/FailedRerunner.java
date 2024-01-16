package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber",
                "json:target/cucumber.json",
                "rerun:target/failedrun.txt"},
        features={"@target/failedrun.txt"},
        glue="ui_automation.step_definitions",
        tags="@test",
        dryRun = false,
        monochrome = true
)



public class FailedRerunner {
}
