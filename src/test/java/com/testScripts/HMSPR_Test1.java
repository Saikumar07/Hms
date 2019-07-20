package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.Components_HMS;
import com.utility.BaseClass;

public class HMSPR_Test1 extends BaseClass{
	Components_HMS pr=new Components_HMS();
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:6 -  Test the permanent registration form in hms")	
	public void f(String no) throws Exception {
		readData.readTestDataFile("D:\\WorkSpace_745\\SeleniumAutomation\\TestData\\HMSTestData.xlsx", no);
		pr.launchapp();
		pr.login();
		pr.navigateToPR();
		pr.verifyPR();
		
  }
}
