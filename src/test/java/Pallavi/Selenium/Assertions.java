package Pallavi.Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	public void hardAssertion1() {
		Assert.assertEquals(false, true);
		System.out.println("Its not matching");
		Assert.assertEquals(10, 20);
		System.out.println("Its matching");
	}
	@Test
	public void softAssertion1() {
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(true, false);
		System.out.println("Expressions not matching");
		sa.assertNotEquals(10, 20);
		System.out.println("Expressions matching");

}
}

