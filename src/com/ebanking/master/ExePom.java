package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePom {
	
	
	WebDriver driver;
	RanfordAdminHP RAP;
	RoleCreationPage RCP;
	BranchCreationPage BCP;
	RanBranchesHP RBP;
	
	
	@BeforeTest
	public void Pom() throws InterruptedException
	
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2/");
		
		
		RanfordHP RHP = PageFactory.initElements(driver, RanfordHP.class);
		RHP.login();
	}
	
	
	@Test(priority=0, dataProvider="RoleData")
	public void RoleCreEx(String RN, String RD, String RTY) throws InterruptedException
	{
		RAP = PageFactory.initElements(driver, RanfordAdminHP.class);
		RAP.RolesA();
		RanRoleHP RRH = PageFactory.initElements(driver, RanRoleHP.class);
		RRH.NewRoleTab();
		RCP = PageFactory.initElements(driver, RoleCreationPage.class);
		RCP.RoleCreationP(RN, RD, RTY);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		RRH.RoleHomeTab();
	}
		
	@Test(priority=1, dataProvider="BranchData")
	public void BranchCreEX(String BName, String BAdd, String ZCode, String CTry, String State, String CTy) throws InterruptedException
	
	{
		RAP.BranchesA();
		RanBranchesHP RBP = PageFactory.initElements(driver, RanBranchesHP.class);
		RBP.NewBranchTab();
		BCP = PageFactory.initElements(driver, BranchCreationPage.class);
		BCP.BranchCreationP(BName, BAdd, ZCode, CTry, State, CTy);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		RBP.BranchHomeTab();
	}
	
	@Test(priority=2, dataProvider="EmpData")
	public void EmpCreEX(String EmpName, String EmpPassW, String EmpRole, String EmpB) throws InterruptedException
	
	{
		RAP.EmpA();
		RanEmpHP EHP = PageFactory.initElements(driver, RanEmpHP.class);
		EHP.NewEmpTab();
		EmpCreationPage ECP = PageFactory.initElements(driver, EmpCreationPage.class);
		ECP.EmployeeCreationP(EmpName, EmpPassW, EmpRole, EmpB);
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		EHP.EmpAHomeTab();
		
		
	}
	
	
	@AfterTest
	public void BHPLogout()
	{
		RAP = PageFactory.initElements(driver, RanfordAdminHP.class);
		RAP.LogoutA();
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
		
		@DataProvider
		public Object [][] BranchData()
		{
			
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
	
		
		
	


