package tes;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing {

	@Test
	public void assertiontest()
	{
		Assert.assertEquals("Test", "Testing");
		System.out.println("Testing");
	}
	
	@Test
	public void softAssertTest()
	{
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false);
		System.out.println("Testing");
		softAssert.assertAll();
	}
}
