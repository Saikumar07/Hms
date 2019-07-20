package com.testScripts;

import org.testng.annotations.Test;

import com.components.GmailLoginComponents;
import com.utility.BaseClass;

public class GmailTestScript1 extends BaseClass{
	GmailLoginComponents gmailComponents = new GmailLoginComponents();
  @Test(description="HMS Login")
  public void f() throws Exception {
	  readData.readTestDataFile("C:\\Nagesh\\Training_730AM\\Workspace\\SeleniumAutomation\\TestData\\GmailData.xlsx", "1");
	  gmailComponents.launchApp();
	  gmailComponents.login();
  }
}
