package PropertyFileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {

	
	
	@Test
	public void testconfig() throws Exception 
	{
		
	  File src = new File(".//config.property");
	
	  FileInputStream  fis = new FileInputStream(src);
	
	  Properties pro = new Properties();
	  
	  pro.load(fis);
	  
	  String AppURL=pro.getProperty("URL");
	  
	  System.out.println("Application url is ------"+AppURL);
	
	}
}
