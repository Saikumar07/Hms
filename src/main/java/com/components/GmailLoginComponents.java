package com.components;

import org.testng.annotations.Test;

import com.objectRepository.GmailLoginLocators1;
import com.utility.BaseClass;

public class GmailLoginComponents extends BaseClass{
	GmailLoginLocators1 gmailLocators = new GmailLoginLocators1();
 
	public void launchApp() throws Exception {
		try {
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));	
			readData.addStepDetails("launchApp", "Application should openURL", "Succesfully opened the URL", "Pass", "Y");
		}catch(Exception e) {
			readData.addStepDetails("launchApp", "Application should openURL", "Unable to open the URL", "Fail", "N");		
		}
	}
	
	public void login() throws Exception {
		try {
			type(gmailLocators.username, readData.testDataValue.get("Username"));
			click(gmailLocators.next);
			type(gmailLocators.password, readData.testDataValue.get("Password"));
			click(gmailLocators.next);
			readData.addStepDetails("login", "Application should login", "Login Success", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("login", "Application should login", "Login Failed", "Fail", "N");		
		}
	}
}









