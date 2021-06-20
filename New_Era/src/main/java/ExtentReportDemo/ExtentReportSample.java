package ExtentReportDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportSample 
{
	
	
	@Test
	public void VerifyGoogleTitle()
	{
		ExtentHtmlReporter report = new ExtentHtmlReporter("./EReports/report1.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest logger=extent.createTest("Login Test");
		logger.log(Status.INFO, "Login to Appication");
		logger.log(Status.PASS, "Verify Login Screen");
		extent.flush();
		
		ExtentTest logger2=extent.createTest("Login Test two");
		logger2.log(Status.INFO, "Login to Appication two");
		logger2.log(Status.FAIL, "Verify Login Screen two");
		extent.flush();
		
	}

}
