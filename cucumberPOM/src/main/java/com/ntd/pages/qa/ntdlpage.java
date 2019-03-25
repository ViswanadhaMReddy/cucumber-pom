package com.ntd.pages.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ndt.base.qa.testbase;

public class ntdlpage extends testbase {

//	Login page factories
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	@FindBy(xpath="//img[@src='/images/nav/logo.gif']")
	WebElement  logo;

// Initialization the pageObjects
// this KEYWORD initialize the above page factory objects
public ntdlpage()
{
	PageFactory.initElements(driver, this);  
}

//Actions

 public String ntdlpageTitle()
 {
	 return driver.getTitle();
 }
 
 public boolean ntdImage()
 {
	 return logo.isDisplayed();
 }
 
 public ntdffinder  ntdlpage(String un,String pwd)
 {
 userName.sendKeys(un);
 password.sendKeys(pwd);
 login.click();
  return new ntdffinder();
}


} 

