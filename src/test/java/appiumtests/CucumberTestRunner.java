package appiumtests;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"appiumtests"}, monochrome = true, plugin = {"pretty", "html:target/HtmlReports/report.html"})
public class CucumberTestRunner {

}
