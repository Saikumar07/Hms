package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hms_Locators {


	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By login = By.xpath("//input[@value='Login']");
  
	public By registration =By.linkText("Registration");
	public By perminentRegistration =By.linkText("Permanent Registration");
	
	public By patient_catatgort = By.xpath("//select[@name='PATIENT_CAT']");
	public By relation = By.xpath("//select[@name='RELATION']");

	public By title = By.xpath("//select[@name='TITLE']");
	public By first_Name = By.xpath("//input[@name='PNT_NAME']");
	public By patient_Identifier = By.xpath("//select[@name='PAT_IDENTITY']");
	public By pan_no =By.xpath("//input[@name='PAT_IDENTITY_PROOF']");
	public By last_name = By.xpath("//input[@name='LAST_NAME']");
	public By dob = By.xpath("//*[@name='DOB']");
	public By date = By.xpath("//*[@id='tcalGrid']/tbody/tr[5]/td[3]");
	public By nationality =By.xpath("//select[@name='NATIONALITY']");
	public By age=By.xpath("//input[@name='AGE']");

	public By Vip = By.xpath("//select[@name='IS_MLC']");
	public By Gender =By.xpath("//select[@name='SEX']");
	public By Education =By.xpath("//select[@name='EDUCATION']");
	public By Marital_Status = By.xpath("//select[@name='MTRL_STATUS']");
	public By Occupation = By.xpath("//select[@name='OCCUPATION']");
	
	public By Religion = By.xpath("//select[@name='RELIGION']");
	public By Bloodgrp = By.xpath("//select[@name='BLOOD_GRP_CODE']");
	public By PrimaryLanguage = By.xpath("//select[@name='PLANGUAGE']");
	public By Citizenship = By.xpath("//select[@name='CITIZENSHIP']");
	public By SeniorCitizenProof = By.xpath("//select[@name='SC_PROOF']");
	public By Address1 = By.xpath("//input[@name='ADDRESS1']");
	public By Phone = By.xpath("//input[@name='MOBILE_NO']");
	public By Pin_Zip = By.xpath("//input[@name='ZIP']");
	public By browse = By.xpath("//input[@name='image']");
	public By Country_code = By.xpath("//select[@name='COUNTRY_CODE']");
	public By Submit = By.xpath("//*[@name='submit']");
	
	
	
	
	
	
	
}