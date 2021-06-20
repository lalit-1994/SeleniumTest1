package DataProvider;

import Library.ReadExcelData;

public class GetDataFromExcelUsingLib {

	public static void main(String[] args) {
		
		
		ReadExcelData obj = new ReadExcelData("C:\\Users\\lalit.yadav\\Desktop\\automation\\Data Files\\Credentials.xlsx");
		
		String firstname=obj.getdata(0, 0, 0);
		
		System.out.println(firstname);
		
		System.out.println("--------------------------------------------------------------");
		
		int count  = obj.rowcount();
		
		for(int a=0;a<=count;a++)
		{
			String exceldata=obj.getdata(0, a, 0);
			System.out.println(exceldata);
		}
		

	}

}
