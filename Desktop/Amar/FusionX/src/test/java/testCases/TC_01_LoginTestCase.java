package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Login;
import testBase.BaseClass;

public class TC_01_LoginTestCase extends BaseClass{
	
	@Test (priority=0)
	public void LoginTest() throws InterruptedException
	{
		System.out.println("Hi");
		
		Login lg=new Login(driver);
		
		lg.clickonAdvance();
		
		lg.clickonProceedLink();
		
		lg.SetUserName("admin1");
		
		lg.SetPassWord("admin123");
		
		lg.ClickonLoginbtn();
		
		Thread.sleep(10000);
		
		
	}
}
