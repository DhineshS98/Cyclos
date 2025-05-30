import org.openqa.selenium.By;

public class Loginpage extends Baseclass {
	
	 public void validlogin()
	 {
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Demo");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 thread.sleep(3000);
	 }
	 public void invalidlogin()
	 {
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dem1");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1214");
		 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 thread.sleep(3000);
		 String alertmsg=driver.switchTo().alert().getText();
	 }
	

}
