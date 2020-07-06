package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//INSTANCE OF A CLASS
		
		Library Lb= new Library();
		
		String rvalue = Lb.OpenApplication("http://183.82.100.55/ranford2");
		System.out.println(rvalue);
		rvalue = Lb.AdminLogin("Admin","M1ndq");
		System.out.println(rvalue);
		rvalue = Lb.BranchCreation("Koreco", "xsways", "11234", "UK", "England", "LONDON");
		System.out.println(rvalue);
		rvalue = Lb.RoleCreation("FinanceD", "Accountant", "E");
		System.out.println(rvalue);
		rvalue = Lb.EmployeeCreation("FemFem", "FemFemFem","Accountant", "Koreco");
		System.out.println(rvalue);
		Lb.ApplicationLogout();
		Lb.AppliationClose();

	}

}
