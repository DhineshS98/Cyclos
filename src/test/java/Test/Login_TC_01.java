package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Webpages.Loginpage;



public class Login_TC_01 extends Loginpage {
	
	WebDriver driver;
	
	@Test
	public void Positivelogin() throws InterruptedException
	{
		
		Loginpage lp=new Loginpage();
		lp.validlogin();
	}

}
