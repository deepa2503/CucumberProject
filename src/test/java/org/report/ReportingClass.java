package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	public static void generateReport(String json) {
		
		File file = new File("target");
		Configuration con = new Configuration(file,"Adactin Hotel WebPage Validation");
		con.addClassifications("Author", "Jack");
		con.addClassifications("User-story", "20123");
		con.addClassifications("Tool", "BDD-Cucumber-Junit-7.13.0");
		
		List<String> list = new LinkedList<String>();
		list.add(json);
		
		ReportBuilder report = new ReportBuilder(list,con);
		report.generateReports();
		

}
}
