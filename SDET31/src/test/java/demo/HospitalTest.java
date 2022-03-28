package demo;

import org.testng.annotations.Test;

public class HospitalTest {

	@Test(groups="RegressionTest")
	public void patient() {
		System.out.println("patient admission done");
	}
	
	@Test(groups="SmokeTest")
	public void doctor() {
		System.out.println("doctor checking done");
	}
		
		@Test
		public void cashier() {
			System.out.println("he charges hell lot of money for that ");		
	}
		@Test
		public void accounts() {
			System.out.println("accounts created");
		}

	
}
