package QA;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TEST3 {
	@Test(groups = { "Smoke" })
	public void demo4() {
		System.out.println("1 round of testing");
	}

	@Test
	public void demo5() {
		System.out.println("2 round of testing");
	}

	@BeforeSuite
	public void BSuit() {
		System.out.println("I  am no 1");
	}

	@Test(dependsOnMethods = { "demo4", "demo5" })
	public void demo6() {
		System.out.println("3 round of testing");
	}

	// @Test(timeOut=4000)
	@Test(dataProvider = "getData")
	public void demo7(String username, String Password) {
		System.out.println("4 round of testing");
		System.out.println("username");
		System.out.println("Password");
	}

	@DataProvider
	public Object[][] getData() // here we change the return type from void to Object[][] because we are
								// returning the same
	{
		// 1st combination - 1username and password
		// 2st combination - 2username and 2 password
		// 3rd combination - 3username and 3 password

		// 1 set
		Object[][] data = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";

		// Columns in the row are nothing but values for that particular Combination

		// 2 set
		data[1][0] = "Secondusername";
		data[1][1] = "SecondPassword";

		// 3 set
		data[2][0] = "Thirdusername";
		data[2][1] = "thirdpassword";
		return data;

	}

}
