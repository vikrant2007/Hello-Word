package QA;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements testing listeners
public class Listeners implements ITestListener {

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("This test case is fail"+Result.getName());
	}

	@Override 
	public void onTestSkipped(ITestResult Result) {

	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("This test case is pass");
	}
	public Void test
	System.out.println("Hello Word");

}
