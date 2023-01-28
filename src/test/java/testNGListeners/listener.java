package testNGListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listener extends TestListenerAdapter{
		
		public void onTestStart(ITestResult ir) 
		{
			System.out.println("Test Started");
		}
		
		public void onTestSuccess(ITestResult ir)
		{
			System.out.println("Test Passed");
		}

		public void onTestFailure(ITestResult ir)
		{
			System.out.println("Test Failed");
		}
		public void onTestSkipped(ITestResult ir)
		{
			System.out.println("Test Skipped");
		}
	}

