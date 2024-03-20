package practise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class class1 {

	public void method1() {
		System.out.println("From class1 - Method1");
	}

	@BeforeMethod
	public void test1() {
		System.out.println("From Class1 - @Before Method");
	}
	
	@AfterMethod
	public void test2() {
		System.out.println("From Class1 - @After Method");
	}
	
}
