package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Base{
	
	public WebDriver driver;
	
	public Login(WebDriver driver)
	{
		super(driver);
	}
	
	//Identification of WebElements
	
	@FindBy(xpath="//button[@id='details-button']")
	WebElement Advancedbtn;
	
	@FindBy(xpath="//a[@id='proceed-link']")
	WebElement ProceedLink;
	
	@FindBy(xpath="//input[@name='UserName']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement PassWord;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement Loginbtn;
	
	
	//Action Methods
	
	public void clickonAdvance()
	{
		Advancedbtn.click();
	}
	
	public void clickonProceedLink()
	{
		ProceedLink.click();
	}
	
	public void SetUserName(String uname)
	{
		UserName.sendKeys(uname);	
	}
	
	public void SetPassWord(String pswd)
	{
		PassWord.sendKeys(pswd);
	}
	
	public void ClickonLoginbtn()
	{
		Loginbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
