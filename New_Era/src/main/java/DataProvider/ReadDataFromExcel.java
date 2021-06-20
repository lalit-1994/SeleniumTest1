package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel 
{
	public static void main(String args[]) throws Exception
	{
		//Create an object of File class to open xlsx file
		File src = new File("C:\\Users\\lalit.yadav\\Desktop\\automation\\Data Files\\Credentials.xlsx");
		
		//Create an object of FileInputStream class to read excel file
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String output = sheet1.getRow(0).getCell(1).getStringCellValue();
		
	    System.out.println("Data from excel sheet is "+output);
	    System.out.println("-------------------------------------------------------");
	    
	    int rowcount = sheet1.getLastRowNum();
	    
	    for(int i=0;i<=rowcount;i++)
	    {
	    	String data = sheet1.getRow(i).getCell(0).getStringCellValue();
	    	System.out.println(data);
	    	
	    }
	    
	    System.out.println("-------------------------------------------------------");
	    
	    for(int j=0;j<=rowcount;j++)
	    {
	    	
	    	String data1 = sheet1.getRow(j).getCell(1).getStringCellValue();
	    	System.out.println(data1);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
		
	    wb.close();
	
	}

}
