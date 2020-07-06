package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationPage {
	
	@FindBy (id= "txtbName")
	WebElement Bname;
	
	@FindBy (id= "txtAdd1")
	WebElement BrAdd1;
	
	@FindBy (id= "txtZip")
	WebElement ZCode;
	
	@FindBy (id= "lst_counrtyU")
	WebElement Country;
	
	@FindBy (id= "lst_stateI")
	WebElement BState;
	
	@FindBy (id= "lst_cityI")
	WebElement BCity;
	
	@FindBy (id= "btn_insert")
	WebElement BCreationSubmit;
	
	
	
	public void BranchCreationP(String BName, String BAdd, String ZCod, String CTry, String State, String CTy) throws InterruptedException
	{
		Bname.sendKeys(BName);
		BrAdd1.sendKeys(BAdd);
		ZCode.sendKeys(ZCod);
		Select CU = new Select(Country);
		CU.selectByVisibleText(CTry);
		Select ST = new Select(BState);
		ST.selectByVisibleText(State);
		Select BC = new Select(BCity);
		BC.selectByVisibleText(CTy);
		BCreationSubmit.click();
		
	}

}
