package Library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	 Properties pro;
	
	public ConfigReader()
	{
		  try {
			  File src = new File(".//config.property");
			
			  FileInputStream  fis = new FileInputStream(src);
			
			  pro = new Properties();
			  
			  pro.load(fis);
		} 
		  
		  catch (Exception e) {
			
			System.out.println(e.getMessage());
		} 
	}
		
		  public String getchromePath()
		  {
			  String driverpath=pro.getProperty("ChromeDriver");
			  return driverpath;
		  }
		  
		  
		  public String getApplicationURL()
		  {
			  String url=pro.getProperty("URL");
			  return url;
		  }
		  
		  
		  
		  
		  
		  
		  
	}


