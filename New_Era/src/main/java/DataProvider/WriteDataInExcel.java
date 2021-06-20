package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataInExcel {

	
	
	@Test(priority=1)
	public static void readData() throws IOException
	{
		
		File file = new File("E:\\123\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sb=wb.getSheetAt(0);
		//String output = sb.getRow(0).getCell(1).getStringCellValue();
		int rowcount=sb.getLastRowNum();
		
		for(int i=0;i<=rowcount;i++)
		{
		sb.getRow(i).createCell(2).setCellValue("Correct Credentials");
		}
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		wb.close();
		
		System.out.println("File Written successfully");
		
}
}
