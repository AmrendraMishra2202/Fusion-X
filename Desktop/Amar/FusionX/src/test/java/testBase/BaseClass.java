package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public WebDriver browserSetup()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://mdmserver.vdi.com/Login.aspx");
		
		return driver;
	}
	
	@AfterClass
	public void closeapp() throws InterruptedException
	{	
		
		Thread.sleep(30000);
		driver.quit();
	}
}
