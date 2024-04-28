package org.runner;

import org.junit.runner.RunWith;
import org.reports.Reporting;
import org.junit.AfterClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"json:target\\loginSearch.json", "html:target\\loginSearch.html"},
			glue="org.stepdefinitions",
			features="src\\test\\resources\\Features\\Login.feature")
public class TestRunner {
	
	@AfterClass
	public static void createReport() {
		
		Reporting.generateJVMReport(Reporting.getProjectPath()+"\\target\\loginSearch.json");
	
	}
}