package Library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ReadExcelData(String filepath)
	{
		        try {
					//Create an object of File class to open xlsx file
					File src = new File(filepath);
					
					//Create an object of FileInputStream class to read excel file
					FileInputStream fis = new FileInputStream(src);
					
					wb = new XSSFWorkbook(fis);
					
					
				} 
		        catch (Exception e) {
					System.out.println(e.getMessage());
				}     
	}
	
	
	public String getdata(int sheetnumber, int rownum, int column)
	{
		     sheet1=wb.getSheetAt(sheetnumber);
		     String data1=sheet1.getRow(rownum).getCell(column).getStringCellValue();
	
		
		     return data1;
	}
	
	public int rowcount()
	{
		int rowcount = sheet1.getLastRowNum();
		return rowcount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
