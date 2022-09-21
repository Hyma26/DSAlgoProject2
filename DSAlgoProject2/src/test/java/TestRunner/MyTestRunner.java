package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Gunagnya\\eclipse-workspace\\DSAlgoProject2\\src\\test\\resources\\com\\features\\PortalPage.feature",
		glue= {"stepdefinition","appHooks"},
		dryRun=false,
		monochrome = true,
		plugin={"pretty","html:test-output"}
		)

public class MyTestRunner 
{

}
