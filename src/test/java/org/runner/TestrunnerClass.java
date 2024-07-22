package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\deepa\\eclipse-workspace\\ProjectCucumber\\src\\test\\resources\\Feature\\CucuProject.feature",
glue="org.step",
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE,
plugin= {
		"html:target\\htmlReports",
		"junit:target\\xmlreport.xml",
		"json:target\\jsonReport.json"

		
}
)
public class TestrunnerClass {
	
	@AfterClass
	public static void report() {
		ReportingClass.generateReport("target\\jsonReport.json");
		
		System.out.println();
	}
	
}
