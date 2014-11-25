package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BaseSetUpPage extends Assert{
	public WebDriver driver;
	
	public BaseSetUpPage(String url) {
		driver=new FirefoxDriver();
		driver.get(url);
	}
	public BaseSetUpPage() {
		// TODO Auto-generated constructor stub
	}
	
	
	public  void setUp(String url){
		driver.get(url);
	}
	public void tearDown(){
		driver.quit();

	}

}
