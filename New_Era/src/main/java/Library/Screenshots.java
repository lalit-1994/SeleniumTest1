package Library;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots 
{
	public static void captureScreeShot(WebDriver driver,String filename) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\lalit.yadav\\Desktop\\automation\\screenshots\\2021\\"+filename+".png");
		FileHelper.copyFile(source, destination);
		System.out.println("Screenshot Captured");
	}

}
