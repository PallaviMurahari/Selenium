package Pallavi.Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	public void hardAssertion1() {
		Assert.assertEquals(true, true);
		System.out.println("Its not matching");
		Assert.assertEquals(10, 20);
		System.out.println("Its matching");
		
	}
	

}
