package practise;

import org.testng.annotations.Test;

public class class2 extends class1 {
	@Test
	public void method2()
	{
		method1();
		System.out.println("From Class 2 - Method 2");
		method1();
	}

	@Test
	public void method3()
	{
		//method1();
		System.out.println("From Class 2 - Method 3");
		//method1();
	}
}
