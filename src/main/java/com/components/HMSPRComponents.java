package com.components;

import com.objectRepository.Hms_Locators;
import com.utility.BaseClass;

public class HMSPRComponents extends BaseClass{
	Hms_Locators hmsLoc= new Hms_Locators();
	
	public void launchApp() throws Exception {
		try {
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("launchApp", "Application should open URL", "Successfully opened URL", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("launchApp", "Application should open URL", "Unable to open URL", "Fail", "N");	
		}
	}
	public void login() throws Exception {
		try {
			type(hmsLoc.username, readData.testDataValue.get("Username"));
			type(hmsLoc.password, readData.testDataValue.get("Password"));
			click(hmsLoc.login);
			readData.addStepDetails("login", "Application should login", "Successfully loggedin", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("login", "Application should login", "Unable to login", "Fail", "N");
		}
	}
	public void navigateToCreatePatient() throws Exception {
		try {
			click(hmsLoc.registration);
			readData.addStepDetails("navigateToCreatePatient", "Application should navigate to create patient", "Successfully navigated to created patient", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("navigateToCreatePatient", "Application should navigate to create patient", "Unable to  navigate to create patient", "Fail", "N");
		}
	}
	
	public void createPatient() throws Exception {
		try {
			select(hmsLoc.patient_catatgort, readData.testDataValue.get("Patient Category"));
			select(hmsLoc.relation, readData.testDataValue.get("Relation"));
			select(hmsLoc.title, readData.testDataValue.get("Title"));
			type(hmsLoc.first_Name, readData.testDataValue.get("First Name"));
			click(hmsLoc.dob);
			click(hmsLoc.date);
			
			select(hmsLoc.nationality, readData.testDataValue.get("Nationality"));
			type(hmsLoc.age, readData.testDataValue.get("Age"));
			type(hmsLoc.pan_no, readData.testDataValue.get("PAN/Voter ID/AADAR Nos"));
			type(hmsLoc.last_name, readData.testDataValue.get("Last Name"));
			select(hmsLoc.Vip, readData.testDataValue.get("VIP"));
			select(hmsLoc.Gender, readData.testDataValue.get("Gender"));
			select(hmsLoc.Education, readData.testDataValue.get("Education"));
			select(hmsLoc.Marital_Status, readData.testDataValue.get("Marital Status"));
			select(hmsLoc.Occupation, readData.testDataValue.get("Occupation"));
			select(hmsLoc.Religion, readData.testDataValue.get("Religion"));
			select(hmsLoc.Bloodgrp, readData.testDataValue.get("Blood Group"));
			select(hmsLoc.PrimaryLanguage, readData.testDataValue.get("Primary Language"));
			select(hmsLoc.Citizenship, readData.testDataValue.get("Citizenship"));
			select(hmsLoc.SeniorCitizenProof, readData.testDataValue.get("Senior Citizen Proof Submited"));
			type(hmsLoc.Address1, readData.testDataValue.get("Address1"));
			type(hmsLoc.Phone, readData.testDataValue.get("Phone"));
			select(hmsLoc.Country_code, readData.testDataValue.get("Country"));
			select(hmsLoc.patient_Identifier, readData.testDataValue.get("Patient Identifier"));
			type(hmsLoc.Pin_Zip, readData.testDataValue.get("Pin or Zip"));
			type(hmsLoc.browse, readData.testDataValue.get("Path"));
			readData.addStepDetails("createPatient", "Application should create patient", "Successfully created patient", "Pass", "Y");
			click(hmsLoc.Submit);
			Thread.sleep(2000);
		} catch (Exception e) {
			readData.addStepDetails("createPatient", "Application should create patient", "Unable to create patient", "Fail", "N");
		}
	}
	
	public void printTextOnAlert() throws Exception {
		try {
			String text=getAlertMessageText();
			System.out.println(text);
		//	readData.addStepDetails("printTextOnAlert", "Application should Click on alert", "Successfully Click on alert", "Pass", "N");
		} catch (Exception e) {
			readData.addStepDetails("printTextOnAlert", "Application should navigate to create patient", "Unable to Click on alert", "Fail", "N");
		}
	}
	public void clickOnAlert() throws Exception {
		try {
			alertaction("ok");
			Thread.sleep(1000);
			readData.addStepDetails("clickOnAlert", "Application should Click on alert", "Successfully Click on alert", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("clickOnAlert", "Application should navigate to create patient", "Unable to Click on alert", "Fail", "N");
		}
	}

}














