package Test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Webpages.Baseclass;
import Webpages.Loginpage;
import Webpages.Payuser;

public class Pay_TC_02 extends Baseclass {
	

	@Test
	public void payment() throws InterruptedException, AWTException
	{
		Loginpage lp=new Loginpage(driver);
		lp.validlogin();
		Payuser py=new Payuser(driver);
		py.payuser("Ann's Café");
	}

}
