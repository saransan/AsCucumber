package StepDefinition;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "src\\test\\java\\Addcustomer.feature" ,  glue = {
				"StepDefinition" }, monochrome = true, plugin = "html:target")
public class TestRun {

}
