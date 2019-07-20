package com.components;

import com.objectRepository.Hms_Locators;
import com.utility.BaseClass;

public class Components_HMS extends BaseClass{
	
	Hms_Locators hms=new Hms_Locators();
	
	public void launchapp() throws Exception{
		try{
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));	
			readData.addStepDetails("launchApp","Application should open the url","Successfully opened the URL" ,"Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("launchApp","Application should open the url","unable to open the URL" ,"Fail", "N");	
		}
	}
	
	public void login() throws Exception{
		try{
			type(hms.username, readData.testDataValue.get("Username"));
			type(hms.password, readData.testDataValue.get("Password"));
			click(hms.login);
			readData.addStepDetails("login","Application should login","Successfully loggedIn" ,"Pass", "Y");	
		}catch(Exception e){
			readData.addStepDetails("login","Application should login","Unable to loggedIn" ,"Fail", "N");
		}
	}
	public void navigateToPR() throws Exception{
		try{
			click(hms.registration);
			click(hms.perminentRegistration);
			readData.addStepDetails("navigateToPR","Application should navigateToPR","Successfully navigated" ,"Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("navigateToPR","Application should navigateToPR","Unable to navigate" ,"Fail", "N");
		}
	}
	
	public void verifyPR() throws Exception{
		try{
			select(hms.patient_catatgort, readData.testDataValue.get("Patient Category"));
			select(hms.relation, readData.testDataValue.get("Relation"));
			select(hms.title, readData.testDataValue.get("Title"));
			type(hms.first_Name, readData.testDataValue.get("First Name"));
			readData.addStepDetails("verifyPR","Application should verifyPR","Successfully verified" ,"Pass", "Y");
		}catch(Exception e){
			readData.addStepDetails("verifyPR","Application should verifyPR","Unable to verify" ,"Fail", "N");
		}
	}

}











