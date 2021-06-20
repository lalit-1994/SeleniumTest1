package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	File src;
	
	
	public WriteExcelData(String filepath)
	{
		        try {
					//Create an object of File class to open xlsx file
		        	src = new File(filepath);
					
					//Create an object of FileInputStream class to read excel file
					FileInputStream fis = new FileInputStream(src);
					
					wb = new XSSFWorkbook(fis);
					
				} 
		        catch (Exception e) {
					e.printStackTrace();
				}     
	}
	
	public void setcelldata(int sheetnumber,int rownumber, int colnumber, String celldata) throws Exception
	{
		sheet1=wb.getSheetAt(sheetnumber);
		
		sheet1.getRow(rownumber).createCell(colnumber).setCellValue(celldata);
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		System.out.println("Data Writtem successfully, check your excel");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
