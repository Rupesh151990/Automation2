package com.qa.extentReporter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.base.TestBase;

public class ExtentReportListener extends TestBase implements ITestListener {
	ExtentReports extentreport;
	ExtentTest extenttest;

	@Override
	public void onStart(ITestContext context) {
		extentreport = ExtentSparkReport.generateSparkReport();

	}

	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getName();
		extenttest=extentreport.createTest(testName);
		extenttest.log(Status.INFO, testName + "Start Execution");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName=result.getName();
		extenttest.log(Status.INFO, result.getThrowable());
		extenttest.log(Status.PASS, testName + "Test Case Got Passed Successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
