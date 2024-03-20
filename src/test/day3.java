package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLogin Home Loan");
		Assert.assertEquals(false, true);
	}
	
	@Test(dataProvider = "getData")
	public void MobileloginHomeLoan(String p1, String p2)
	{
		System.out.println("Mobile Login Home Loan");
		System.out.println("Data Provider Data Run for : "+p1+" / "+p2);
	}
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("API Login Home Loan");	
	}
	@DataProvider
	public Object[][] getData()
	{
		Object [][] obj = new Object[3][2];
		obj[1][0] = "User Name 1 ";
		obj[1][1]= "Password 1";
		
		obj[2][0] = "User Name 2 ";
		obj[2][1]= "Password 2";
		
		obj[0][0] = "User Name 3 ";
		obj[0][1]= "Password 3";
		
		return obj;
		
	}
}
