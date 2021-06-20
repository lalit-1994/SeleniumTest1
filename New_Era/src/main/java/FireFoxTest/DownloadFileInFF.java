package FireFoxTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class DownloadFileInFF {

	
	
	@Test
	public void downloadImage() throws Exception 
	{
		
        System.setProperty("webdriver.gecko.driver","C:\\BeatBlip\\drivers\\geckodriver.exe");
        String downloadFilepath="C:\\BeatBlip\\Sync";
        
        FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.helperApps.alwaysAsk.force", false);
		options.addPreference("browser.download.dir", downloadFilepath); 
		options.addPreference("browser.download.defaultFolder",downloadFilepath); 
		options.addPreference("browser.download.manager.showWhenStarting", false);
		options.addPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
		
		FirefoxDriver driver = new FirefoxDriver(options);
        
        driver.manage().window().maximize();
        driver.get("https://www.flickr.com/photos/bbalaji/33279919208");
        Thread.sleep(3000);
        String actual_url=driver.getCurrentUrl();
        System.out.println(actual_url);
        
        WebElement download_btn=driver.findElement(By.xpath("//a[@title=\"Download this photo\"]"));
        
        
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", download_btn);
        
        
        WebElement imageSize_btn=driver.findElement(By.xpath("//*[contains(text(),'(5400 × 3600)')]"));
        executor.executeScript("arguments[0].click();", imageSize_btn);
        
        
        
        Thread.sleep(10000);
        
        
        
        
        driver.quit();
		
	}
	
}
