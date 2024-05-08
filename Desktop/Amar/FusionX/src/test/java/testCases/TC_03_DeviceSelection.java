package testCases;

import org.testng.annotations.Test;

import pageObjects.DeviceSelection;

public class TC_03_DeviceSelection extends TC_01_LoginTestCase{
	
	@Test (priority=2)
	public void Device_Selection_Tree_View()
	{
		DeviceSelection ds=new DeviceSelection(driver);
		
		ds.GroupExpand();
		
		ds.NodeSelect();
	}
}
