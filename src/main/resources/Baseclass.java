import org.openqa.selenium.WebDriver;

public class Baseclass {
	
	WebDriver driver;
	public Baseclass()
	{
		this.driver= driver;
}
	@Beforemethod
	public void initalize()
	{
	
		driver =new Chromedriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
	}
	
	@Aftermethod
	public void exit()
	{
		driver.quit();
	}




}
