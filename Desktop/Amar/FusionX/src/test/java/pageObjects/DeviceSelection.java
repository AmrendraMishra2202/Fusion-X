package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DeviceSelection extends Base{
	
	public WebDriver driver;
	
	public DeviceSelection(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Identification of Web elements
	
	@FindBy(xpath="//div[@class='rtTop']/span[2]")
	WebElement GroupExpand;
	
	@FindBy(xpath="//div[@class='rtTemplate']//span[text()=' 67b4730f9403676d']")
	WebElement NodeSelection;
	
	@FindBy(xpath="//td[normalize-space()='CCL']")
	WebElement ContextMenu;
	
	//Action Methods
	
	public void GroupExpand()
	{
		GroupExpand.click();
	}
	
	public void NodeSelect()
	{
		NodeSelection.click();
	}
	
	public void contextmenu()
	{
		Actions act=new Actions(driver);
		act.contextClick(ContextMenu).perform();
	}
}
