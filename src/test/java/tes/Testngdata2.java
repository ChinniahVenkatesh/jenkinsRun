package tes;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngdata2 {
	
	@Parameters({"url"})
	@Test()
	public void test1(@Optional("https://www.espncricinfo.com")String name)
	{
		System.out.println(name);
	}

}
