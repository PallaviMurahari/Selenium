package Pallavi.Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTestDemoProg {
	@Test(alwaysRun=true)
	void firstMethod() {
		System.out.println("First Method execution");
	}
	@Test
	void secondMethod() {
		System.out.println("Second Method execution");
	}
	@BeforeMethod
	void methodOneExecution() {
		System.out.println("methodOne execution");
	}
	@AfterMethod
	void methodTwoExecution() {
		System.out.println("methodTwo execution");
	}

}

