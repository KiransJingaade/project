package demo;

import org.testng.annotations.Test;

public class StudentTest {

	@Test
	public void student() {
		System.out.println("Student admission done");
	}
	
	@Test
	public void master() {
		System.out.println("Master teaching done");
	}
	StudentTest obj = new StudentTest();
	obj.student;
}
