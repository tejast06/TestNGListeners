package listenersdemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerNG implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test are failed and results are " +result.getName());
	}
	
	public void onTestSkip(ITestResult result) {
		System.out.println("Test are skip and results are " +result.getName());
		
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test are start and results are " +result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test are success and results are " +result.getName());
		
	}

}
