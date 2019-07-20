package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.SpicejetHomepageComponents;
import com.utility.BaseClass;

public class Spicejet_Scenario1 extends BaseClass{
	SpicejetHomepageComponents homepageComponents=new SpicejetHomepageComponents();
	
  @Parameters("TestcaseNo")	
  @Test(description="Spciejet search")
  public void f(String no) throws Exception {
	  
	  readData.readTestDataFile("D:\\WorkSpace_Appium\\SeleniumAutomation_Mobile_Web\\TestData\\SpicejetData.xlsx", no);
	  homepageComponents.launchURL();
	  homepageComponents.search();
  }
}
