package tes;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestingExample {
	
	EdgeDriver driver;

	@BeforeClass()
	public void initiBrowser()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com");
	}
	
	
	@AfterClass()
	public void closeBrowser()
	{
		driver.close();
	}
	
}
