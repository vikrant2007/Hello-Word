package QA;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TEST1 {

	@Test // Test is an annotations of an TESTNG
	public void demo() // 1 test case + what ever the method name we define here will treated as an
						// test case so demo is our test case name
	{
		System.out.println("Hello Word");
	}

	@AfterTest
	public void demo12() {
		System.out.println("I will Execute last");
	}

	@Test(enabled = false)
	public void demo2() // 2 test case
	{
		System.out.println("Word");
	}

	@Test
	public void demo8() {
		System.out.println("Hello Vicky");
	}

	@AfterSuite

	public void Asuit() {
		System.out.println("I am no 1 from last");
	}

	@Test
	public void demo9() {
		System.out.println("Hello Vinay");
		Assert.assertTrue(false); // to fail the test
	}

	@Test(groups = { "Smoke" })
	public void demo10() {
		System.out.println("Hello Sai");
	}

}
