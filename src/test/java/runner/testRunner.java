package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
	@CucumberOptions(tags="",
		features = {"src/test/java/features/login.feature"},
        glue = {"stepDefinition","utilities"},
        plugin = {"pretty","html:target/htmlreport.html",
            "rerun:build/cucumber-reports/rerun.txt"},
        dryRun = false,
        monochrome=true
			
			)
	@Test
public class testRunner extends AbstractTestNGCucumberTests{

	

}
