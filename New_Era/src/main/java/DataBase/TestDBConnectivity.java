package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class TestDBConnectivity {

	@Test
	public void TestDB_Connection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");                  //step 1
		System.out.println("Driver loaded successfully");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");  //step 2
		System.out.println("Connection established successfully");
		
		Statement stm=con.createStatement();                           //step 3
		ResultSet rs=stm.executeQuery("select * from products;");                     //step 4
		
		/*
		rs.next();
		String output =rs.getString(2);    //working code, returning values using column index
		System.out.println(output);
		*/     
		
		while(rs.next())
		{
			String pname=rs.getString("product_name");
			System.out.println("Product name is :"+pname);
			
			String price=rs.getString("regular_price");
			System.out.println("Product regular price is :"+price);
		}
		
	
				
		
		
		
		
		
	}
}
