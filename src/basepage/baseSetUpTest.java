package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class baseSetUpTest extends Assert{
	public WebDriver driver=new FirefoxDriver();
	
	public void setUp(String url){
		driver.get(url);
		}
	public void tearDown(){
		driver.quit();
		
	}

}
