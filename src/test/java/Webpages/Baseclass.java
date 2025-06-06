package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

	public class Baseclass {
		
		public WebDriver driver;
		
		/*public Baseclass(WebDriver driver)
		{
			this.driver= driver;
	}*/
		@BeforeMethod
		public void initalize() throws InterruptedException
		{
		
			driver =new ChromeDriver();
			driver.get("https://demo.cyclos.org/ui/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		
		@AfterMethod
		public void exit()
		{
			driver.quit();
		}
	}



