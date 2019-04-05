package com.pages.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.qa.testbase;

public class HomePage extends testbase {

	
	@FindBy(xpath="//td[contains(text(),'User: Vinmayi Reddy')]") WebElement userNamelabel;
	@FindBy(xpath="//a[@title='Contacts']") WebElement contacts;
	@FindBy(xpath="//a[@title='New Contact']") WebElement NewContact;
	
	public HomePage()
	{
	  PageFactory.initElements(driver, this);
	}
	
	

	
				
	}
