package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpCNG extends Base{
	
@Test(dataProvider="EmpData")
	
	public void Ecre(String EmployeeName, String LoginPWD, String EmpRole, String EmpBranch) throws InterruptedException
	{
		Lb.EmployeeCreation(EmployeeName, LoginPWD, EmpRole, EmpBranch);
	}
	
	@DataProvider
	public Object [][] EmpData(){
		
		Object[][] obj = new Object[4][4];
		
		obj [0][0] = "IbadanBranch";
		obj [0][1] = "AdamasigbaMolete";
		obj [0][2] = "TRED";
		obj [0][3] = "IbadanBranch";

		
		obj [1][0] = "LagosBranch";
		obj [1][1] = "GRAIkeja";
		obj [1][2] = "gowri";
		obj [1][3] = "LagosBranch";
		
		
		obj [2][0] = "IkoyiBranch";
		obj [2][1] = "AwolowoRoad";
		obj [2][2] = "testerx";
		obj [2][3] = "IkoyiBranch";
		
		
		obj [3][0] = "AbeokutaBranch";
		obj [3][1] = "OnikoloboEgba";
		obj [3][2] = "Account";
		obj [3][3] = "AbeokutaBranch";
		
		
		return obj;

	}

}
