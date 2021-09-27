package Cucumber;

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.Reporter;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import extendReport.fileReader;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/Features/Urban.feature",
			glue="StepDefination")
					//plugin= {"pretty","html:target/test-output.html"})
			//plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},monochrome = true)
					
	public class TestRunner extends AbstractTestNGCucumberTests  {
		/*@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(fileReader.getInstance().getConfigReader().getReportConfigPath()));
		}*/
	
	}
