package tes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadJsonFileData {
	

	
	XSSFWorkbook book ;
	XSSFSheet sheet;
    

	@Test()
	public void readData() throws FileNotFoundException, IOException, ParseException
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\tes\\testdata.json";
		JsonParser jsonparse = new JsonParser();
	JsonElement jsonelement = jsonparse.parse(new FileReader(path));
	jsonelement.getAsJsonObject();
	JsonObject jobj = jsonelement.getAsJsonObject();
	jobj.getAsJsonObject("student1");
	System.out.println(jobj.getAsJsonObject("student1[name]"));
		
	}
	
	@Test
	public void excelData() throws IOException
	{
		String path = "C:\\Users\\chinn\\OneDrive\\Documents\\testDatasep.xlsx";
		book = new XSSFWorkbook(path);
		sheet = book.getSheet("Sheet1");
		int rowIndex = sheet.getLastRowNum();
		for(int i = 0 ; i <= rowIndex ; i++)
		{
			XSSFRow row = sheet.getRow(i);
			int cellIndex = sheet.getRow(i).getLastCellNum();
			for(int j = 0 ; j < cellIndex; j++)
			{
				if(row.getCell(j).getStringCellValue().contains("LoginData"))
				{
					Iterator<Cell> cell = row.cellIterator();
					while(cell.hasNext())
					{
						String cellValue = cell.next().getStringCellValue();
						if(cellValue.contains("username"))
						{
							System.out.println(cellValue);
						}
						
					}
				}
			}
		}
		
	}

}
