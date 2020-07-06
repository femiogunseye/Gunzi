package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BranchE {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Library Lb= new Library();
		
		Lb.OpenApplication("http://183.82.100.55/ranford2");
		Lb.AdminLogin("Admin","M1ndq");
		
		FileInputStream Fiss = new FileInputStream("C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		
		XSSFWorkbook WBB =new XSSFWorkbook(Fiss);
		
		
		XSSFSheet WSS = WBB.getSheet("BranchData");
		
		
		int Rcount = WSS.getLastRowNum();
		System.out.println(Rcount);
		
		
		for (int i = 1; i <=Rcount; i++) {
			
			XSSFRow WRR = WSS.getRow(i);
			
			XSSFCell WCC = WRR.getCell(0);
			XSSFCell WCC1 = WRR.getCell(1);
			XSSFCell WCC2 = WRR.getCell(2);
			XSSFCell WCC3 = WRR.getCell(3);
			XSSFCell WCC4 = WRR.getCell(4);
			XSSFCell WCC5 = WRR.getCell(5);
			
			XSSFCell WCC6 = WRR.createCell(6);
			
			String BranchName = WCC.getStringCellValue();
			String BranchAd = WCC1.getStringCellValue();
			String ZiCode = WCC2.getStringCellValue();
			String Country = WCC3.getStringCellValue();
			String State = WCC4.getStringCellValue();
			String City = WCC5.getStringCellValue();

			
			String Ress = Lb.BranchCreation(BranchName, BranchAd, ZiCode, Country, State, City);
			System.out.println(Ress);
			
			WCC6.setCellValue(Ress);
												
			
		}
		
		FileOutputStream Fos = new FileOutputStream("C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\result\\Ress_Role.xlsx");
		WBB.write(Fos);
		WBB.close();
		

	}

}
