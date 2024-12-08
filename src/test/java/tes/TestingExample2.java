package tes;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

public class TestingExample2 extends TestingExample{
	

	

	@Test(priority = 1)
	public void test02() throws InterruptedException
	{
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	}
	
	
	@Test(dependsOnMethods="test02")
	public void test03()
	{
		System.out.println(driver.getTitle());
	}
	
	
}
