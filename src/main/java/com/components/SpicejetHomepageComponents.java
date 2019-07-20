package com.components;

import com.objectRepository.SpicejetHomePage_OR;
import com.utility.BaseClass;

public class SpicejetHomepageComponents extends BaseClass{
	SpicejetHomePage_OR homepage=new SpicejetHomePage_OR();
	
	public void launchURL() throws Exception{
		try{
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("launchURL", "Application should OpenURL", "Successfully opened the URL", "Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("launchURL", "Application should OpenURL", "Unable to Open URL"+e.getMessage(), "Fail", "N");
		}
	
	}
	
	public void search() throws Exception{
	try{
		click(homepage.oneWayRB);
		click(homepage.from);
		click(homepage.hyderabad);
		click(homepage.bengaluru);
		click(homepage.date);
		select(homepage.Adult, readData.testDataValue.get("Adult"));
		select(homepage.Child, readData.testDataValue.get("Child"));
		select(homepage.Infants, readData.testDataValue.get("Infant"));
		select(homepage.Currency, readData.testDataValue.get("CURRENCY"));
		readData.addStepDetails("search", "Application should perform oneway search", "Successfully completed oneway search", "Pass", "Y");	
	}catch(Exception e){
		readData.addStepDetails("search", "Application should perform oneway search", "Unable complete oneway search", "Fail", "N");		
	}
		
		
	}

}











