package com.sauseDemo.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sauseDemoBasePage.BaseClass1;

public class TestListener extends BaseClass1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test has started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test is successful");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		logger.info("Test finished");
	}
	
	  

}
