package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Receivepayment extends Baseclass {
	
	public Receivepayment(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void credit() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Pay user ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Receive payment']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("Test01");
		driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("10");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	}
	

}
