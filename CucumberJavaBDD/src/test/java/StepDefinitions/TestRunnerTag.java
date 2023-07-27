package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Tags/tags.feature",
glue= {"StepDefinitions"},
tags= ("@cucumber or @automation")


)


public class TestRunnerTag 
{
     
}
