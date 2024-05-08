package testCases;

import org.testng.annotations.Test;

import pageObjects.CreateGroup;
import pageObjects.Login;
import testBase.BaseClass;
	
		
public class TC_02_CreateGroup extends TC_01_LoginTestCase{
	
	
	
	
	
	

		
	
		@Test (priority=1)
		public void CreateGrp() throws InterruptedException
		{
			
			//LoginTest();
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIII");
		CreateGroup gp=new CreateGroup(driver);
		
		//gp.clickonccl();
		
		gp.contextclickonsite();
		
		gp.clickonAddGroup();
		
		gp.setGroupName("Amar");
		
		gp.clickonsavebtn();
		
		}
}
