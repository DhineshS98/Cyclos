package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

	public class Baseclass {
		
		WebDriver driver;
		public Baseclass()
		{
			this.driver= driver;
	}
		@BeforeMethod
		public void initalize()
		{
		
			driver =new ChromeDriver();
			driver.get("https://demo.cyclos.org/ui/login");
			driver.manage().window().maximize();
		}
		
		@AfterMethod
		public void exit()
		{
			driver.quit();
		}




	}



