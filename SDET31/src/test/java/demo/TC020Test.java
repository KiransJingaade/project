package demo;

import org.testng.annotations.Test;

public class TC020Test {
	
@Test(groups="SmokeTest")
public void createProject() {
	System.out.println("running create project test case");
}

@Test(groups="RegressionTest")
public void deleteProject() {
	System.out.println("running delete project test case");
}

}
