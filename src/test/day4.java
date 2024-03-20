package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String URL)
	{
		System.out.println("WebLogin Car Loan");
		System.out.println("Parameter URL = "+ URL);
	}
	@Test
	public void MobileloginCarLoan()
	{
		System.out.println("Mobile Login Car Loan");
	}
	@Test(groups= {"Smoke"})
	public void LoginAPICarLoan()
	{
		System.out.println("API Login Car Loan");	
	}
	@BeforeTest
	public void test12322()
	{
		System.out.println("Before test Annotation for day 4");
	}
}
