package tes;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class dataTest {

	@Test
	public void test01() throws ParseException, IOException
	{
		JSONParser parser = new JSONParser();
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\tes\\test.json";
		FileReader filereader = new FileReader(path);
		Object object = parser.parse(filereader);
		JSONObject jsonObject= (JSONObject) object;
		System.out.println(jsonObject.get("name"));
		/*
		 * 
		 * 
		 * System.out.println(jsonObject.get("MN.age"));
		 */
		
	}
}
