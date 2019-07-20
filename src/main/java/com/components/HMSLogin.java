package com.components;

import org.testng.annotations.Test;

import com.objectRepository.Hms_Locators;
import com.utility.BaseClass;

public class HMSLogin extends BaseClass{
	public Hms_Locators hms=new Hms_Locators();
  
	public void launchURL() throws Exception {
		try {
			openBrowser("chrome");
			openURL("http://selenium4testing.com/hms");
			readData.addStepDetails("launchURL", "App should open URL", "Successfully open", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("launchURL", "App should open URL", "Unable to open", "Fail", "N");
		}
	}
	
	public void login() throws Exception {
		try {
			type(hms.username, readData.testDataValue.get("Username"));
			type(hms.password, readData.testDataValue.get("Password"));
			click(hms.login);
			readData.addStepDetails("login", "App should login", "Successfully login", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("login", "App should login", "Unable to login", "Fail", "Y");	
		}
	}
}












