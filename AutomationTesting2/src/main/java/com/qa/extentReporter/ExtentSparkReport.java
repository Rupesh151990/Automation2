package com.qa.extentReporter;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.base.TestBase;

public class ExtentSparkReport extends TestBase {
	
	public static ExtentReports generateSparkReport() {
		
		ExtentReports extentReport= new ExtentReports();
		File extentreportpath = new File(System.getProperty("user.dir")+"//test-output//ExtentReport//extentreport.html");
		ExtentSparkReporter sparkReport =  new ExtentSparkReporter(extentreportpath);
		
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("Free CRM Application");
		sparkReport.config().setTimeStampFormat("dd/mm/yyyy hh:mm:ss");
		
		extentReport.attachReporter(sparkReport);
		
		extentReport.setSystemInfo("Application URL", prop.getProperty("url"));
		extentReport.setSystemInfo("Browser Name ", prop.getProperty("browser"));
		extentReport.setSystemInfo("OS", System.getProperty("os.name"));
		extentReport.setSystemInfo("System Name", System.getProperty("user.name"));
		
		return extentReport;
		
	}

}
