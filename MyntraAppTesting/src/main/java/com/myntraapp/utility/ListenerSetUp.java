package com.myntraapp.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.myntraapp.testbase.TestBase;

public class ListenerSetUp extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	logger.info(result.getName()+" Test Case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getName()+" Test Case is completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info(result.getName()+" Test Case is Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info(result.getName()+" Test Case is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
