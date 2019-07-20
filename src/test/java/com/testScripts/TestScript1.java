package com.testScripts;

import org.testng.annotations.Test;

import com.components.Components_HMS;
import com.utility.BaseClass;

public class TestScript1 extends BaseClass{
	Components_HMS comp=new Components_HMS();
  @Test(description="HMS Login")
  public void f() throws Exception {
	  readData.readTestDataFile("C:\\Nagesh\\Training_730AM\\Workspace\\SeleniumAutomation\\TestData\\HMSTestData.xlsx", "1");
	  comp.launchapp();
	  comp.login();
  }
}
