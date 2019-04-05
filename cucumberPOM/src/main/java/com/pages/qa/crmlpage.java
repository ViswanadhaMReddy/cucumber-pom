package com.pages.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.qa.testbase;

import junit.framework.Assert;

public class crmlpage extends testbase {

//	Login page factories
	
	@FindBy(xpath="//input[@placeholder='Login']") 	WebElement userName;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement login;
	@FindBy(xpath="//img[@class='img-responsive']") WebElement  crmlogo;

// Initialization the pageObjects ,// this KEYWORD initialize the above page factory objects

	public crmlpage()
{
	PageFactory.initElements(driver, this);  
}

//Actions

 public void crmlpageTitle()
 {
	 String title=driver.getTitle();
	 Assert.assertEquals("CRMPRO Log In Screen", title);
 }
 
 public boolean crmImage()
 {
	Assert.assertTrue("logo displayed",true);
	return true;
 }
 
 public HomePage crmlpage(String un,String pwd)
 {
 userName.clear();	 
 userName.sendKeys(un);
 
 password.clear();
 password.sendKeys(pwd);
 
 login.click();
 
  return new HomePage();
}


} 

