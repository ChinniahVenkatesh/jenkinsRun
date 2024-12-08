package tes;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import tesLiseners.testLisners;

public class Testngclass1 {
	public WebDriver driver;

	@Test(dataProvider="testData")
	public void test01(String data1)
	{
		System.out.println(data1);
		//System.out.println(data2);
		
	}
	
	@Test(dataProvider="testDataArray")
	public void test02(int data1)
	{
		Assert.assertEquals(false, false);
		
	}
	
	@DataProvider(name="testData")
	public Iterator<Object> testData()
	{
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Dhoni");
		al.add("CSK");
		return al.iterator();
		
	}
	
	@BeforeMethod
	public void testMethod() {
		System.out.println("Before Method");
	}

	@DataProvider(name="testDataArray")
	public Object[] testData1()
	{
		Object [] data = {23};
		return data;
		
	}
	
	@Test
	public void initBrowser()
	{
		driver = new ChromeDriver();
	}
}
