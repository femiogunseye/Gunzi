package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EmpCreationPage {
	
	@FindBy (id= "txtUname")
	WebElement Ename;
	
	@FindBy (id= "txtLpwd")
	WebElement EPassW;
	
	@FindBy (id= "lst_Roles")
	WebElement ERole;
	
	@FindBy (id= "lst_Branch")
	WebElement EBranch;
	
	
	
	@FindBy (id= "BtnSubmit")
	WebElement ECreationSubmit;
	
	
	
	public void EmployeeCreationP(String EmpName, String EmpPassW, String EmpRole, String EmpB) throws InterruptedException
	{
		Ename.sendKeys(EmpName);
		EPassW.sendKeys(EmpPassW);
		Select ER = new Select(ERole);
		ER.selectByVisibleText(EmpRole);
		Select EB = new Select(EBranch);
		EB.selectByVisibleText(EmpB);
		ECreationSubmit.click();
		
	}


}
