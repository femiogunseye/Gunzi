package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeE {

	public static void main(String[] args) throws InterruptedException, IOException {
		Library Lb= new Library();
		
		Lb.OpenApplication("http://183.82.100.55/ranford2");
		Lb.AdminLogin("Admin","M1ndq");
		
		FileInputStream Fiss = new FileInputStream("C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		
		XSSFWorkbook WBB =new XSSFWorkbook(Fiss);
		
		
		XSSFSheet WSS = WBB.getSheet("EmpData");
		
		
		int Rcount = WSS.getLastRowNum();
		System.out.println(Rcount);
		
		
		for (int i = 1; i <=Rcount; i++) {
			
			XSSFRow WRR = WSS.getRow(i);
			
			XSSFCell WCC = WRR.getCell(0);
			XSSFCell WCC1 = WRR.getCell(1);
			XSSFCell WCC2 = WRR.getCell(2);
			XSSFCell WCC3 = WRR.getCell(3);
			
			XSSFCell WCC4 = WRR.createCell(4);
			
			String EmpName = WCC.getStringCellValue();
			String LoginPWD = WCC1.getStringCellValue();
			String EmpRole = WCC2.getStringCellValue();
			String EmpBranch = WCC3.getStringCellValue();
			
			

			
			String Resss = Lb.EmployeeCreation(EmpName, LoginPWD, EmpRole, EmpBranch );
			System.out.println(Resss);
			
			WCC4.setCellValue(Resss);
		}
		
		FileOutputStream Fos = new FileOutputStream("C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\result\\Role.xlsx");
		WBB.write(Fos);
		WBB.close();
				
	}

}
