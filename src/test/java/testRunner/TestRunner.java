package testRunner;

import org.junit.runner.RunWith;	

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/java/featureFiles",
glue = "stepDefinitions", tags="@RegTest", monochrome=true,
plugin= {"pretty","html:target/CucumberReport.html","json:target'CucumberReport.json","junit:target/CucumberReport.xml"})
@RunWith(Cucumber.class)
	
public class TestRunner {

}
