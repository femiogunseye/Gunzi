package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanBranchesHP {
	
	@FindBy (id= "BtnNewBR")
	WebElement NewBranch;
	
	@FindBy (xpath= "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement RanHBranch;
	
	@FindBy (xpath= "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[3]/a/img")
	WebElement LogoutBranchP;
	
	
	public void NewBranchTab()
	{
		NewBranch.click();	
		
	}
	
	public void BranchHomeTab()
	{
		RanHBranch.click();	
		
	}
	
	public void BranchHPLogout()
	{
		LogoutBranchP.click();	
		
	}

}
