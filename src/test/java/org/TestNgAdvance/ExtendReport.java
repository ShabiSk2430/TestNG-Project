
package org.TestNgAdvance;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport implements ITestListener{
	
	private ExtentReports Reports;
	private ExtentTest Test;
	
	public void onStart(ITestContext context) {
		System.out.println("OnStart");
		Reports = new ExtentReports();
		ExtentSparkReporter HtmlReport = new ExtentSparkReporter("target/Reports/ExtendReport.html");
		Reports.attachReporter(HtmlReport);
		Reports.setSystemInfo("Environment", "QA");
		Reports.setSystemInfo("Testers", "Shabi,Mini");
		Reports.setSystemInfo("Team", "QA Supporters");
	 }
	
	public void onTestStart(ITestResult result) {
		System.out.println("OnTestStart");
		Test=Reports.createTest(result.getMethod().getMethodName());
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess");
		Test.log(Status.PASS, "TestFailes");
	}
     		  
	public void onTestFailure(ITestResult result) {
		Test.log(Status.FAIL, "TestFailes");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Onfinish");
		Reports.flush();
	 }
	

}
