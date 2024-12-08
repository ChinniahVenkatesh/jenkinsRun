package tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test1 {

	WebDriver driver;
	@Test
	public void test01()
	{
		driver  = new EdgeDriver();
		driver.get("https://www.espncricinfo.com");
	}
	
	@Test
	public void test02()
	{
		driver  = new EdgeDriver();
		driver.get("https://www.espn.in/cricket");
	}
}
