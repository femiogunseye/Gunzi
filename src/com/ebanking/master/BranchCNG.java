package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchCNG extends Base{
	
	@Test(dataProvider="BranchData")
	
	public void Bcre(String BName, String BAdd, String ZCode, String CTry, String State, String CTy) throws InterruptedException
	{
		Lb.BranchCreation(BName, BAdd, ZCode, CTry, State, CTy);
	}
	
	@DataProvider
	public Object [][] BranchData(){
		
		Object[][] obj = new Object[4][6];
		
		obj [0][0] = "IbadanBranch";
		obj [0][1] = "AdamasigbaMolete";
		obj [0][2] = "10101";
		obj [0][3] = "UK";
		obj [0][4] = "England";
		obj [0][5] = "LONDON" ;
		
		obj [1][0] = "LagosBranch";
		obj [1][1] = "GRAIkeja";
		obj [1][2] = "10102";
		obj [1][3] = "INDIA";
		obj [1][4] = "GOA";
		obj [1][5] = "GOA";
		
		obj [2][0] = "IkoyiBranch";
		obj [2][1] = "AwolowoRoad";
		obj [2][2] = "10103";
		obj [2][3] = "USA";
		obj [2][4] = "NewYork";
		obj [2][5] = "Watertown";
		
		obj [3][0] = "AbeokutaBranch";
		obj [3][1] = "OnikoloboEgba";
		obj [3][2] = "10104";
		obj [3][3] = "UK";
		obj [3][4] = "Yorkshire";
		obj [3][5] = "Bradford";
		
		return obj;

	}
}
