package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.HMS_PRPage_Components;
import com.utility.BaseClass;

public class HMSTestScript2 extends BaseClass{
	
	HMS_PRPage_Components prPage=new HMS_PRPage_Components();

  @Parameters("TestCaseNo")	
  @Test(description="HMS PR page")
  public void f(String no) throws Exception {
	  readData.readTestDataFile("D:\\WorkSpace_8AM_APPIUM\\MobileAutomation\\Testdata\\HMSTestData.xlsx", no);
	  prPage.launchURL();
	  prPage.login();
	  prPage.navigateToPR();
  }
}
