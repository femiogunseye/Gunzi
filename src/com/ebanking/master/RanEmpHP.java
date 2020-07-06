package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanEmpHP {
	
	@FindBy (id= "BtnNew")
	WebElement NewEmp;

	@FindBy (xpath= "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement RanEmpH;
	
	@FindBy (xpath= "/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[3]/a/img")
	WebElement LogoutEmpP;
	
	
	public void NewEmpTab()
	{
		NewEmp.click();
	}
	
	public void EmpAHomeTab()
	{
		RanEmpH.click();		
	}
	
	public void EmpALogout()
	{
		LogoutEmpP.click();	
		
	}

}
