package inboxpage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepage.BaseSetUpPage;

public class InboxPage extends BaseSetUpPage {

	private By compose=By.xpath("//div[@class='z0']/div");
	private By to=By.className("aRx");


	public InboxPage(WebDriver driver) {
		this.driver=driver;
	}

	public InboxPage clickComposeEmail(){
		WebElement composeElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")));
		if(composeElement.isDisplayed())		
			driver.findElement(compose).click();
		System.out.println("Hello1");
		return this;
	}

	public boolean verifyCompose(){
		WebElement we=driver.findElement(to);
		return we.isDisplayed();
	}
}
