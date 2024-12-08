package tes;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class TestingClass5 {
	
	public FileReader filereader;
	
	@Test
	public void jsonDataRead() throws JsonIOException, JsonSyntaxException, FileNotFoundException
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\tes\\testdata.json";
		JsonParser jsonparse = new JsonParser();
		JsonObject jsonobject = (JsonObject) jsonparse.parse(new FileReader(path));
		jsonobject  = jsonobject.get("glossary").getAsJsonObject();
		System.out.println(jsonobject.get("GlossDiv"));
		System.out.println(jsonobject.get("title"));
		jsonobject = jsonobject.get("GlossDiv").getAsJsonObject();
		System.out.println(jsonobject.get("title"));
		
	}

}
