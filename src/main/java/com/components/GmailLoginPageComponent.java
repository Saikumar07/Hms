package com.components;

import com.objectRepository.GmailLoginPage_OR;
import com.utility.BaseClass;

public class GmailLoginPageComponent extends BaseClass{
	GmailLoginPage_OR login=new GmailLoginPage_OR();
	
	public void launchURL() throws Exception{
		try{
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("launchURL", "Application should OpenURL", "Successfully opened the URL", "Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("launchURL", "Application should OpenURL", "Unable to Open URL"+e.getMessage(), "Fail", "N");
		}
	
	}
	public void login() throws Exception{
		try{
		type(login.username, readData.testDataValue.get("Username"));
		click(login.next);
		Thread.sleep(3000);
		type(login.password, readData.testDataValue.get("Password"));
		click(login.next);
		readData.addStepDetails("login", "Application should login", "Successfully loggedIn", "Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("login", "Application should login", "Unable to login"+e.getMessage(), "Fail", "N");
		}
	
	}
}
