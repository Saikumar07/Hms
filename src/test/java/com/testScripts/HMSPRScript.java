package com.testScripts;

import org.testng.annotations.Test;

import com.components.HMSPRComponents;
import com.utility.BaseClass;

public class HMSPRScript extends BaseClass{
	HMSPRComponents hmscomponents = new HMSPRComponents();
  @Test(description = "HMS PR")
  public void f() throws Exception {
	  readData.readTestDataFile("C:\\Nagesh\\Training_730AM\\Workspace\\SeleniumAutomation\\TestData\\HMSTestData.xlsx", "2");
	  hmscomponents.launchApp();
	  hmscomponents.login();
	  hmscomponents.navigateToCreatePatient();
	  hmscomponents.createPatient();
	  hmscomponents.printTextOnAlert();
	  hmscomponents.clickOnAlert();
  }
}
