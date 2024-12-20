package com.qa.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ScreenShotListener extends TestUtil implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		takeScreenshotAtEndOfTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		takeScreenshotAtEndOfTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		takeScreenshotAtEndOfTest(result.getMethod().getMethodName());
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
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
