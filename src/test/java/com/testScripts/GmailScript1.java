package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.GmailLoginPageComponent;
import com.utility.BaseClass;

public class GmailScript1 extends BaseClass{
	GmailLoginPageComponent login=new GmailLoginPageComponent();
	
  @Parameters("TestcaseNo")
  @Test(description="Gmail login")
  public void f(String no) throws Exception {
	  readData.readTestDataFile("D:\\WorkSpace_Appium\\SeleniumAutomation_Mobile_Web\\TestData\\GmailLogin.xlsx", no);
	  login.launchURL();
	  login.login();
  }
}
