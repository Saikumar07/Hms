package com.components;

import com.objectRepository.Spicejet_Search_Locator;
import com.utility.BaseClass;

public class SpicejetComponents extends BaseClass{
	Spicejet_Search_Locator spicejet=new Spicejet_Search_Locator();

	public void launchApp() throws Exception{
		try{
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("launchApp", "Application should openURL", "Successfully opened the URL", "Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("launchApp", "Application should openURL", "Unable to open the URL", "Fail", "N");
		}
	
	}
	
	public void search() throws Exception{
		try{
			click(spicejet.OneWaySrch);
			click(spicejet.LeavingFrom);
			click(readData.testDataValue.get("From"));
			wait(2000);
			click(readData.testDataValue.get("To"));
			wait(2000);
			click(spicejet.Date_19);
			select(spicejet.Adult, readData.testDataValue.get("Adult"));
			select(spicejet.Child, readData.testDataValue.get("Child"));
			select(spicejet.Infants, readData.testDataValue.get("Infant"));
			select(spicejet.Currency, readData.testDataValue.get("Currency"));
			click(spicejet.FindFlightBtn);
			readData.addStepDetails("search", "Application should search oneway", "Successfully searched", "Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("search", "Application should search oneway", "Unable search", "Fail", "N");
		}
	
	}
	

}
