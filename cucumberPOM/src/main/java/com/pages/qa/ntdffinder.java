package com.pages.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.qa.testbase;

public class ntdffinder extends testbase {

	
	@FindBy(xpath="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement flightfinder;
	
	@FindBy(xpath="//img[@src='/images/banner2.gif']")
	WebElement Banner;
	
	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement RadioButton;
	
	@FindBy(xpath="//a[contains(text(),'CONTACT')]")
	WebElement contact;
	public ntdffinder()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyffinderTitle()
	{
	return driver.getTitle();
}
	
	public void rbutton()
	{
		RadioButton.isEnabled();
	}
	
	public void clickonContactlink()
	{
		Actions act = new Actions(driver);
		act.moveToElement(contact).build().perform();
		contact.click();
				
	}
}