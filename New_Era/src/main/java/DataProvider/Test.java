package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws Exception {
		
		File src = new File("E:\\123\\Test.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String Data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String Data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(Data1);
		System.out.println(Data2);
		System.out.println("-------------------------------------");
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		
		

	}

}
