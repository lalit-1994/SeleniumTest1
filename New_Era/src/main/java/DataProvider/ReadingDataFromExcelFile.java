package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcelFile {

	

	@Test(priority=1)
	public static void readData() throws IOException
	{
		
		File file = new File("E:\\123\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sb=wb.getSheetAt(0);
		String output = sb.getRow(0).getCell(1).getStringCellValue();
		int rowcount=sb.getLastRowNum();
		
		for(int i=0;i<=rowcount;i++)
		{
			System.out.println(sb.getRow(i).getCell(0).getStringCellValue());
			System.out.println(sb.getRow(i).getCell(1).getStringCellValue());
		}
		
		
	}
}
