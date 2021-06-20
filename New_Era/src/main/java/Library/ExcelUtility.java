package Library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public FileInputStream fis;
	public FileOutputStream fout;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path;
	
	public ExcelUtility(String path)
	{
		this.path=path;
	}
	
	//This method will return the row count of the given excel sheet
	public int getRowCount(String sheetname) throws IOException 
	{
		fis= new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();
		wb.close();
		fis.close();
		
		return rowcount;
		
	}
	
	//This method will return the column count of the given row of the excel sheet
	public int getColumnCount(String sheetname, int rownum) throws IOException
	{
		fis= new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rownum);
		int cellCount=row.getLastCellNum();
		wb.close();
		fis.close();
		
		return cellCount;
		
	}
	
	//This method will return the cell data
	public String getCellData(String sheetname, int rownum, int colnum) throws IOException
	{

		fis= new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		DataFormatter formatter = new DataFormatter();//Returns the formatted value fo the cell as a string regardless of cell type	
		String data;
		try {
			data=formatter.formatCellValue(cell);
		} 
		catch (Exception e) {
			
			data="";
		}
		
		wb.close();
		fis.close();
		
		return data;
	}
	
	//This method will set the cell value with given data
	public void setCellData(String sheetname, int rownum, int colnum, String data) throws IOException
	{
		fis= new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		
		
		row=sheet.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		
		fout = new FileOutputStream(path);
		wb.write(fout);
		wb.close();
		fis.close();
		fout.close();
	}
	
	//This method will set the cell color as green
	public void fillGreenColor(String sheetname, int rownum, int colnum) throws IOException 
	{

		fis= new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		wb.write(fout);
		wb.close();
		fis.close();
		fout.close();
	}
	
	//This method will set the cell color as red
	public void fillRedColor(String sheetname, int rownum, int colnum) throws IOException 
	{

		fis= new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		wb.write(fout);
		wb.close();
		fis.close();
		fout.close();
	}

}
