package Webpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.utils.FileUtil;

	public class Baseclass {
		
		public WebDriver driver;
		
		/*public Baseclass(WebDriver driver)
		{
			this.driver= driver;
	}*/
		@BeforeMethod
		public void initalize() throws InterruptedException
		{
			driver = new ChromeDriver();
			driver.get("https://demo.cyclos.org/ui/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		
		@AfterMethod
		public void exit()
		{
			driver.quit();
		}
		
		public String capturescreenshot(String testName) throws IOException
		{
			TakesScreenshot s=(TakesScreenshot)driver;
			File src=s.getScreenshotAs(OutputType.FILE);
			//File destination= new File("/Cyclos/test-output/Screenshot");
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        String path = "screenshots/" + testName + "_" + timestamp + ".png";
	        Files.createDirectories(Paths.get("screenshots"));
	        Files.copy(src.toPath(), Paths.get(path));
	        return path;		
		}
	}



