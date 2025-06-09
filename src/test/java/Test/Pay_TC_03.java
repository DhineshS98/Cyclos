package Test;

import org.testng.annotations.Test;

import Webpages.Baseclass;
import Webpages.Loginpage;
import Webpages.Receivepayment;

public class Pay_TC_03 extends Baseclass {
	
	@Test
	public void test_crediting() throws InterruptedException
	
	{
		try {
		Loginpage lp=new Loginpage(driver);
		lp.validlogin();
		Receivepayment re=new Receivepayment(driver);
		re.credit();
		capturescreenshot("test_info");
		}
		catch (Exception e) {
            e.printStackTrace(); // You can also use logging here
        }
	}
}
