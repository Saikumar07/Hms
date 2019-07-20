package com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.objectRepository.Hms_Locators;
import com.objectRepository.Spicejet_Search_Locator;
import com.utility.BaseClass;
import com.utility.ReadData;

public class HmsSearch_BusinessFunction extends BaseClass {
	public Hms_Locators HmsLocators=new Hms_Locators();
	
	public void launchApp() throws Exception{
		try{
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
		readData.addStepDetails("launchApp","Application should open the url","Successfully opened the URL" ,"Pass", "Y");
		  }catch(Exception e){
			  readData.addStepDetails("launchApp","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
		  }
	}
	public void login() throws Exception{
		try{			
			type(HmsLocators.username,readData.testDataValue.get("Username") );
			type(HmsLocators.password, readData.testDataValue.get("Password"));
			click(HmsLocators.login);
		readData.addStepDetails("login ","HMS should login into the application","Logged in into the applciation" ,"Pass", "Y");
		  }catch(Exception e){
			  readData.addStepDetails("login ","HMS should login into the application", "Unable to login into the application :"+e.getMessage(), "Fail", "N");
		  }
	}
	public void navigateToPR() throws Exception{
		try{
			click(HmsLocators.registration);
			select(HmsLocators.patient_catatgort, readData.testDataValue.get("Patient Category"));
			readData.addStepDetails("navigateToPR ","HMS should login into the application", "Unable to login into the application :", "Pass", "Y");	
		 }catch(Exception e){
			  readData.addStepDetails("navigateToPR ","HMS should login into the application", "Unable to login into the application :"+e.getMessage(), "Fail", "N");
		  }	
	}
	
	public void Permanent_Registration() throws Exception{
		try{
			select(HmsLocators.relation, readData.testDataValue.get("Relation"));
			select(HmsLocators.title, readData.testDataValue.get("Title"));
			type(HmsLocators.first_Name, readData.testDataValue.get("First Name"));
			select(HmsLocators.patient_Identifier, readData.testDataValue.get("Patient Identifier"));
			type(HmsLocators.pan_no, readData.testDataValue.get("PAN/Voter ID/AADAR Nos"));
			type(HmsLocators.last_name, readData.testDataValue.get("Last Name"));
			click(HmsLocators.dob);
			
			waitForElement(HmsLocators.date, 20);
			
			click(HmsLocators.date);
			
			select(HmsLocators.nationality, readData.testDataValue.get("Nationality"));
			type(HmsLocators.age, readData.testDataValue.get("Age"));
			select(HmsLocators.Vip, readData.testDataValue.get("VIP"));
			select(HmsLocators.Gender, readData.testDataValue.get("Gender"));
			select(HmsLocators.Education, readData.testDataValue.get("Education"));
			select(HmsLocators.Marital_Status, readData.testDataValue.get("Marital Status"));
			select(HmsLocators.Occupation, readData.testDataValue.get("Occupation"));
			select(HmsLocators.Religion, readData.testDataValue.get("Religion"));
			select(HmsLocators.Bloodgrp, readData.testDataValue.get("Blood Group"));
			select(HmsLocators.PrimaryLanguage, readData.testDataValue.get("Primary Language"));
			select(HmsLocators.Citizenship, readData.testDataValue.get("Citizenship"));
			select(HmsLocators.SeniorCitizenProof, readData.testDataValue.get("Senior Citizen Proof Submited"));
			type(HmsLocators.Address1, readData.testDataValue.get("Address1"));
			type(HmsLocators.Phone, readData.testDataValue.get("Phone"));
			select(HmsLocators.Country_code, readData.testDataValue.get("Country"));
			type(HmsLocators.Pin_Zip, readData.testDataValue.get("Pin or Zip"));
			type(HmsLocators.browse, readData.testDataValue.get("Path"));
			click(HmsLocators.Submit);
			Thread.sleep(2000);
			alertaction("ok");
			Thread.sleep(2000);
			readData.addStepDetails("Permanent Registration  ","Permanent Registration  should be done","Conformation shoud get" ,"Pass", "Y");
		  }catch(Exception e){
			  readData.addStepDetails("Permanent Registration ","Permanent Registration is not done", "Invalid credential :"+e.getMessage(), "Fail", "N");
		  }
    }
}
