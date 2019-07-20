package com.components;

import com.objectRepository.Hms_Locators;
import com.utility.BaseClass;

public class HMS_PRPage_Components extends BaseClass{
	Hms_Locators loc=new Hms_Locators();
	
	public void launchURL() throws Exception{
		try {
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("launchURL", "App Should openURL", "successfully opened URL", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("launchURL", "App Should openURL", "Unable to open url", "Fail", "N");
		}
	}
	
	public void login() throws Exception{
		try {
			type(loc.username, readData.testDataValue.get("Username"));
			type(loc.password, readData.testDataValue.get("Password"));
			click(loc.login);
			readData.addStepDetails("login", "App Should login", "successfully loggedin", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("login", "App Should login", "Unable to login", "Fail", "N");
		}
	}
	
	public void navigateToPR() throws Exception{
		try {
			click(loc.registration);
			click(loc.perminentRegistration);
			readData.addStepDetails("navigateToPR", "navigate To PR Page", "successfully navigated to PR", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("navigateToPR", "navigate To PR Page", "Unable to navigate to PR", "Fail", "N");
		}
		
	}
	

}





