package testCases;

import org.testng.annotations.Test;

import pageObjects.DeviceSelection;

public class TC_04_RemoteOperations extends TC_03_DeviceSelection{
	
	@Test (priority=3)
	public void RemoteOperation()
	{
		DeviceSelection ds=new DeviceSelection(driver);
		
		ds.contextmenu();
	}
}
