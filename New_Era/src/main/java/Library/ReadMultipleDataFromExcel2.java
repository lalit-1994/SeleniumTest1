package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadMultipleDataFromExcel2 {
	
	@Test
	public static ArrayList<Object> readdata() throws IOException {
		
		File src = new File("E:\\Sample Data\\TestSheet.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Sheet1");
		//String data=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		int rowcount= sheet1.getLastRowNum();
		int cellcount=sheet1.getRow(0).getLastCellNum();
		
		System.out.println("Number of rows is :" +rowcount);
		System.out.println("Number of rows is :" +cellcount);
		
		ArrayList<Object> Exceldata = new ArrayList<Object>();
		
		
		for(int j=1;j<=rowcount;j++)
		{
		    for(int i=0;i<=cellcount-1;i++)
		     {
		    		
			   String output=sheet1.getRow(j).getCell(i).getStringCellValue();
			   Exceldata.add(output);
			   //System.out.println(output);
		    }
		}
		
		return Exceldata;
		
	}

}
