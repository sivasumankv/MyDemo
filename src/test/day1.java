package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void Demo()
	{
			System.out.println("Hello");
	}
	@Test(groups= {"Smoke"})
	public void  SecondTest()
	{
		System.out.println("Bye");
	}

	@AfterTest
	public void test12345()
	{
		System.out.println("After test from Day1");
	}
}
