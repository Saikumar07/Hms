package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.HMSLoginPageComponents;
import com.utility.BaseClass;

public class HMSTestScript1 extends BaseClass{
	HMSLoginPageComponents hms=new HMSLoginPageComponents();

  @Parameters("TestCaseNo")	
  @Test(description="Test the Login Functionality")
  public void f(String no) throws Exception {
	  readData.readTestDataFile("D:\\WorkSpace_8AM_APPIUM\\MobileAutomation\\Testdata\\HMSTestData.xlsx", no);
	  hms.launchURL();
	  hms.login();
  }
}














