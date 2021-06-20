package DataProvider;

import Library.WriteExcelData;

public class SetCellData {

	public static void main(String[] args) {
		
		
		try {
			WriteExcelData obj1 = new WriteExcelData("C:\\Users\\lalit.yadav\\Desktop\\automation\\Data Files\\Credentials.xlsx");
			
			obj1.setcelldata(0, 0, 2, "Correct Credentials");
			
			System.out.println("Test Compoleted");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
