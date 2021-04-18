package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//by default cucumber uses Junit framework
@RunWith(Cucumber.class)                //to run with cucumber class  
@CucumberOptions(features="Features",
glue="Step_definition",
tags={"@smokeTest"}, //~@tag is used to not include that tagged scearios
plugin={"pretty","html:target/html_report","junit:target/junit-xml-report.xml","pretty:target/json-report.json"})   //annotation is used to set some properties for our cucumber test like feature file, step definition, 
// ~ is used to skip the scenarios with specific tags
public class TestRunner {
	
}


//hooks can be used to run piece of code beore and after every scenario using: @Before and @After tags in a separate hook class
