package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP {
	
	
	@FindBy (id= "txtuId")
	WebElement Uname;
	
	@FindBy (id= "txtPword")
	WebElement PassW;
	
	@FindBy (id= "login")
	WebElement LogN;
	
	
	public void login()
	{
		Uname.sendKeys("Admin");
		PassW.sendKeys("M1ndq");
		LogN.click();
		
		
	}

}
