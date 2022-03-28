package demo;

import org.testng.annotations.Test;

public class StudentTest {

	@Test(groups="SmokeTest")
	public void student() {
		System.out.println("Student admission done");
	}
	
	@Test(groups="RegressionTest")
	public void master() {
		System.out.println("Master teaching done");
	}
}
