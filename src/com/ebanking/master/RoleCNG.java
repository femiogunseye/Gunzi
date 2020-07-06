package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleCNG extends Base {
	
	@Test(dataProvider="RoleData")
	public void Rcre(String RName, String RDesc, String RoleType) throws InterruptedException
	{
		Lb.RoleCreation(RName,RDesc, RoleType);
	}
	
	@DataProvider
	public Object [][] RoleData(){
		
		Object[][] obj = new Object[4][3];
		
		obj [0][0] = "Accountant";
		obj [0][1] = "AccountTeller";
		obj [0][2] = "E";
		
		obj [1][0] = "Accountan";
		obj [1][1] = "AccountTeller2";
		obj [1][2] = "E";
		
		obj [2][0] = "Account";
		obj [2][1] = "AccountTeller";
		obj [2][2] = "E";
		
		obj [3][0] = "Accounta";
		obj [3][1] = "AccountTeller";
		obj [3][2] = "E";
		
		return obj;
		
		
		


		
	}

}
