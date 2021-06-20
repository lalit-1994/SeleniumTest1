package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case started with test case name as : " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case passed with test case name as : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case failed with test case name as : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case skipped" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}

}
