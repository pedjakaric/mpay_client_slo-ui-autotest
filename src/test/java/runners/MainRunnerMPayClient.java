package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;




@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
        //tags = "897ytewr@smoke",
        monochrome = true, dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"} )


public class MainRunnerMPayClient extends AbstractTestNGCucumberTests{
    public static final String tags = "@smoke";

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
