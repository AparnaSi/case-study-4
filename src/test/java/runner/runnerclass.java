package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/file1.feature"},
		glue = "stepdef")
		//plugin="html:target/htmlreporter")
		//plugin="json:target/cucumber.json"
		//plugin="junit:target/xmlreport.xml"
		//tags={"~@hp"}) 

        
public class runnerclass {
	
	
    
}
