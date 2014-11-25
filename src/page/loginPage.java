package page;

import java.util.Set;

import inboxpage.InboxPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepage.BaseSetUpPage;

public class LoginPage extends BaseSetUpPage{

	
	private By email=By.id("Email");
	private By passwd=By.id("Passwd");
	private By signIn=By.id("signIn");


	public LoginPage(WebDriver driver) {
		this.driver=driver;// TODO Auto-generated constructor stub
	}
	public void enterUserName(String userName){
	
		driver.findElement(email).sendKeys(userName);
	
	}
	public void enterPassword(String password){
	
		driver.findElement(passwd).sendKeys(password);
	
	}

	public InboxPage clickLoginButton() throws InterruptedException{
	
		driver.findElement(signIn).click();
	
		return new InboxPage(driver);
	}
}
