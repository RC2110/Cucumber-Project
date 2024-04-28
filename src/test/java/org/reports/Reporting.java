package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;

import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
	}
	
	public static void generateJVMReport(String jsonFile) {
		File reportDirectory = new File(getProjectPath()+"\\target\\");
		
		Configuration config = new Configuration(reportDirectory, "login&Searchfeature");
		
		config.addClassifications("Platform", "Windows");
		config.addClassifications("Version", "11");
		config.addClassifications("Build", "2.3.2");
		config.addClassifications("author", "rajaa");
		
		List<String> jsonFiles = new ArrayList<String>();
		
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		
		builder.generateReports();

	}
	
	
	

}
