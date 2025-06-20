package Webpages;
	import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Loginpage extends Baseclass {
		
		public Loginpage(WebDriver driver) {
			this.driver=driver;
		}
			 
		public void validlogin() throws InterruptedException
		 {
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Demo");
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
			 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			 Thread.sleep(3000);
		 }
		 public String invalidlogin() throws InterruptedException
		 {
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dem1");
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1214");
			 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			 Thread.sleep(5000);
			 String alertmsg=driver.findElement(By.className("notification-message")).getText();
			 System.out.println(alertmsg);
			return alertmsg;
		 }
		

	


}
