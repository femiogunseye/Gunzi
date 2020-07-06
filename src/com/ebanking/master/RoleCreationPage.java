package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCreationPage {

	
	@FindBy (id= "txtRname")
	WebElement Rname;
	
	@FindBy (id= "txtRDesc")
	WebElement RDesc;
	
	@FindBy (id= "lstRtypeN")
	WebElement RType;
	
	@FindBy (id= "btninsert")
	WebElement RoleCreationSubmit;


  	public void RoleCreationP(String RN, String RD, String RTY)
  	
  	{
  		
  		Rname.sendKeys(RN);
  		RDesc.sendKeys(RD);
  		Select RT = new Select(RType);
  		RT.selectByVisibleText(RTY);
  		RoleCreationSubmit.click();
	
  	}
}