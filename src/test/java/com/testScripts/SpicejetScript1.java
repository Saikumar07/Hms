package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.SpicejetComponents;
import com.utility.BaseClass;

public class SpicejetScript1 extends BaseClass{
	SpicejetComponents components=new SpicejetComponents();

  @Parameters("TestCaseNo")	
  @Test(description="Spicejet oneway search")
  public void f(String no) throws Exception {
	  readData.readTestDataFile("D:\\WorkSpace_9AM_Appium\\MobileAutomation\\TestData\\SpicejetTestdata.xlsx", no);
	  components.launchApp();
	  components.search();
  }
}
