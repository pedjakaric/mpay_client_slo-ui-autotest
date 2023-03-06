package stepDefinitions.base;

import com.codeborne.selenide.logevents.SimpleReport;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.sql.Timestamp;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Hooks {
    private final SimpleReport report = new SimpleReport();


@Before
public void setup() throws Exception {
    //getWebDriver();
   //new RobotThread();

}

    @Before
    public void beforeTest(Scenario scenario) throws Exception {
        scenario.log("Starting " + scenario.getName());
        report.start();
    }

    @After
    public void afterTest(Scenario scenario) {
        scenario.log("Finished " + scenario.getName());
        report.finish(scenario.getName());
    }


    //if the scenario is unsuccessful make a screenshot in html report
    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
        if (scenario.isFailed()) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());

            byte[] screenshot = ((TakesScreenshot) getWebDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", timeMilliseconds);
        }

    }
}
