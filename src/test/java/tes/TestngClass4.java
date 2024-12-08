package tes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngClass4 {
	
	SoftAssert softassert;
	@Test
	public void softAssertTest()
	{
		Assert.assertEquals("Arun", "aru");
		System.out.println("test");
	}
	
	@Test
	public void softAssertExample()
	{
		softassert = new SoftAssert();
		softassert.assertEquals("Arun", "aru");

		System.out.println("test");
		softassert.assertAll();
	}
	

}


/*
 * //pending topics 1.JSON Array 2.Testng command prompt
 */
