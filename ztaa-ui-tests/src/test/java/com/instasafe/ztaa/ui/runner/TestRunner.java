package com.instasafe.ztaa.ui.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/",
		glue = {"com.instasafe.ztaa.ui.stepdefinitions"},
				plugin= {"de.monochromata.cucumber.report.PrettyReports:target/cucumber",
						"pretty","html:target/cucumber-html-report.html","json:target/cucumber.json","junit:target/cucumber.xml"},
		tags="@login"
		)

public class TestRunner {
	
	/*@AfterClass
	public static void tearDown() {
		File reportOutputDirectory = new File("target/cucumber");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("cucumber.json");
		

		String buildNumber = "1";
		String projectName = "ZTAA UI Tests";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		
		
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Branch", "release/1.0");

		

		// optionally specify qualifiers for each of the report json files
		configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
		

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}*/
	

}
