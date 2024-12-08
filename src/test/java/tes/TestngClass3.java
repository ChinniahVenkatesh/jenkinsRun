package tes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngClass3 {

	@Test(groups={"smoke"}, enabled = true)
	public void test02()
	{
		System.out.println("Smoke Test");
	}
	
	@BeforeTest
	public void test()
	{
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void testclass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeSuite
	public void testsuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeMethod
	public void testMethod() {
		System.out.println("Before Method");
	}
}
