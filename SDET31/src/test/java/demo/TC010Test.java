package demo;

import org.testng.annotations.Test;

public class TC010Test {

	@Test(groups="SmokeTest")
	public void createCustomer() {
		System.out.println("running create customer test case");
	}
	
	@Test(groups="RegressionTest")
	public void deleteCustomer() {
		System.out.println("running delete customer test  case");
	}
}
