package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features={"C:\\Users\\Vanak\\eclipse-workspace\\ATE_BookSwagon_Project2\\src\\test\\java\\features\\searchbox.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\ATE_BookSwagon_Project2\\src\\test\\java\\features\\todaysdeal.feature"},
		
				
		glue = {"steps"},
				dryRun=false,
		plugin = { "html:target/report.html",
				"json:target/cucumber.json",
				
				"pretty"  ,
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	,
				},
               tags ="@all")
		
				
		public class TestRunner {
}

