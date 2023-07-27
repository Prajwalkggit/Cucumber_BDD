package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/pom.feature",glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/HtmlReport/POM.html",
		"pretty","json:target/JSONReport/POMJson.json",
		"pretty","junit:target/JUNITReport/POMJunit.xml"}
)

public class TestRunner 
{
    
}
