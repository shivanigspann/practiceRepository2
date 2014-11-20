package page;

import java.util.Set;

import inboxpage.InboxPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepage.baseSetUpTest;

public class loginPage {
	WebDriver driver;
	private By email=By.id("Email");
	private By passwd=By.id("Passwd");
	private By signIn=By.id("signIn");

	public loginPage(WebDriver driver){
		this.driver=driver;
		driver.get("http://www.gmail.com");
		
	}
	public void enterUserName(String userName){
		System.out.println("Hello2");
		driver.findElement(email).sendKeys(userName);
		System.out.println("Hello3");
	}
	public void enterPassword(String password){
		System.out.println("Hello4");
		driver.findElement(passwd).sendKeys(password);
		System.out.println("Hello5");
	}

	public InboxPage clickLoginButton() throws InterruptedException{
		System.out.println("Hello6");
		driver.findElement(signIn).click();
		System.out.println("Hello7");
		Set<String> allWin=driver.getWindowHandles();
		for(String s:allWin){
			if(driver.switchTo().window(s).getTitle().contains("Inbox"))
				break;
		}
		System.out.println("Window "+driver.getTitle());
		WebElement composeElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")));
		if(composeElement.isDisplayed())
			System.out.println("Hello8");
		return new InboxPage(driver);
	}
}
