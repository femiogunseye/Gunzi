package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanRoleHP {
	@FindBy (id= "btnRoles")
	WebElement NewRole;
	
	@FindBy (xpath= "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement RanHRole;
	
	@FindBy (xpath= "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[3]/a/img")
	WebElement LogoutRoleP;
	
	
	public void NewRoleTab()
	{
		NewRole.click();	
		
	}
	
	public void RoleHomeTab()
	{
		RanHRole.click();	
		
	}
	
	public void BranchHPLogout()
	{
		LogoutRoleP.click();	
		
	}
}
