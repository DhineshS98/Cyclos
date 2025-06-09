package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Webpages.Baseclass;
import Webpages.Loginpage;



public class Login_TC_01 extends Baseclass {
	
	@Test
	public void Positivelogin() throws InterruptedException
	{
		
		Loginpage lp=new Loginpage(driver);
		lp.validlogin();
	}
	
	@Test
	public void negativelogin() throws InterruptedException {
		Loginpage lp=new Loginpage(driver);
		//lp.invalidlogin();
		Assert.assertEquals(lp.invalidlogin(),"The given name / password are incorrect. Please, try again.");
	}

}
