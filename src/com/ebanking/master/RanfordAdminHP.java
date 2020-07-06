package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RanfordAdminHP {
	
	@FindBy (xpath ="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement BranchAdmin;
	
	@FindBy (xpath ="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement RoleAdmin;
	
	@FindBy (xpath ="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement EmpAdmin;
	
	@FindBy (xpath ="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")
	WebElement LogoutAdmin;
	
	
	
	public void BranchesA()
	
	{
		BranchAdmin.click();	
	}
	
	public void RolesA()
	
	{
		RoleAdmin.click();	
	}

	public void EmpA()

	{
		EmpAdmin.click();
	}
	
	public void LogoutA()

	{
		LogoutAdmin.click();
	}


}
