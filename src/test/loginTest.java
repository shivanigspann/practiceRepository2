package test;

import inboxpage.InboxPage;
import page.*;


import org.openqa.selenium.By;
import org.testng.Assert;


import org.testng.annotations.*;

import basepage.BaseSetUpPage;


public class LoginTest extends BaseSetUpPage{

	LoginPage lp=new LoginPage(driver);
	InboxPage ip=new InboxPage(driver);

	LoginTest(){
		super("http://www.gmail.com");

	}
	@Test
	public void testGmail() throws InterruptedException{
		lp.enterUserName("shivani17185");
		lp.enterPassword("123shivirocks_");
		ip=lp.clickLoginButton().clickComposeEmail();
		
		assertTrue(ip.verifyCompose(),"compose is not clicked");
		System.out.println("Hello4");
		
	}
	@AfterMethod
	public void closeBrowser(){
		tearDown();
	}
}
