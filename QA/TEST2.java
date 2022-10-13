package QA;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEST2 {

	@Test
	public void demo3() {
		System.out.println("Vicky");

	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("I will execute first");
	}

	@Test(groups = { "Smoke" })
	public void Test1() {
		System.out.println("TestCase 1");
	}

	@Test
	public void test2() {
		System.out.println("TestCase 2");

	}
}
