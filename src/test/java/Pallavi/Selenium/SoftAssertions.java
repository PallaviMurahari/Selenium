package Pallavi.Selenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	@Test
	public void softAssertion1() {
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(true, false);
		System.out.println("Expressions not matching");
		sa.assertNotEquals(10, 20);
		System.out.println("Expressions matching");
	}

}
