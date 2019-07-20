package com.components;

import com.objectRepository.HMS_LoginPage_OR;
import com.utility.BaseClass;

public class HMSLoginPageComponents extends BaseClass{
	HMS_LoginPage_OR or=new HMS_LoginPage_OR();
	
	public void launchURL() throws Exception{
		try {
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
		} catch (Exception e) {
		
		}
		
	}
	
	public void login() throws Exception{
		try {
			type(or.username, readData.testDataValue.get("Username"));
			type(or.password, readData.testDataValue.get("Password"));
			click(or.login);
		} catch (Exception e) {
		
		}
	}

}















