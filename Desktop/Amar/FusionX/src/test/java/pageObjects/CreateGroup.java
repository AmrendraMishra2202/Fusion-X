package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreateGroup extends Base{
	
	public WebDriver driver;
	
	public CreateGroup(WebDriver driver)
	{
		super(driver);
	}
	
	
	//identification of Web Elements
	
	@FindBy(xpath="//span[@class='rtIn icon-Site']")       ////span[@class='rtIn icon-Site']
	WebElement Site;
	
	@FindBy(xpath="//span[normalize-space()='Add Group']")
	WebElement AddGroup;
	
	//within General Settings
	
	@FindBy(xpath="//input[@id='txtTreeGroupName']")
	WebElement GroupName;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnApplySettings']")
	WebElement Savebtn;
	
	@FindBy(xpath="//span[normalize-space()='CCL (0)']")
	WebElement CCL;
	
	//Action Methods
	
	public void contextclickonsite()
	{	
      //  new Actions(driver).contextClick(Site).perform();
		
		  // Create JavaScript Executor
    //    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to trigger context click
      //  jsExecutor.executeScript("arguments[0].dispatchEvent(new MouseEvent('contextmenu', { bubbles: true, cancelable: true, view: window, button: 2 }))", Site);
		
		System.out.println(Site.isDisplayed());
		Actions actions = new Actions(driver);
		actions.contextClick(Site).perform();
	//new Actions(driver).moveToElement(Site).contextClick().perform();
		
	}
	
	public void clickonAddGroup()
	{
		AddGroup.click();
	}
	
	public void setGroupName(String grpname)
	{
		GroupName.sendKeys(grpname);
	}
	
	public void clickonsavebtn()
	{
		Savebtn.click();
	}

	public void clickonccl()
	{
		Actions act=new Actions(driver);
		
		act.contextClick(CCL).perform();
	}
	
}
