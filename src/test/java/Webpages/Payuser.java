package Webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class Payuser extends Baseclass {
	
	public Payuser(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void payuser(String creditor) throws InterruptedException, AWTException
	{
		 // To handle change password prompt
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Pay user ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='d-flex']/button")).click();
		Thread.sleep(3000);
		List<WebElement> userslist = driver.findElements(By.xpath("//div[@class='mb-2']/a"));
		
		for(int i=0;i<userslist.size();i++)
		{
		WebElement user = driver.findElements(By.xpath("//div[@class='mb-2']/a")).get(i);
		String name = user.getText().trim();
		if(name.equals(creditor))
		user.click();
		break;
		}
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("10");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		String successfulmsg =driver.findElement(By.xpath("//div[text()='The payment was successfully processed']")).getText();
		System.out.println(successfulmsg);*/
	}


}
