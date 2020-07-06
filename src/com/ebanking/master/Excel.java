package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.io.FileBackedOutputStream;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pc\\Desktop\\geckodriver.exe");
		Library Lb = new Library();
		Lb.OpenApplication("http://183.82.100.55/ranford2/");
		Lb.AdminLogin("Admin", "M1ndq");
		
		//To Get Test Data From Excel
		
		FileInputStream Fis = new FileInputStream("C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		//Workbook
		XSSFWorkbook WB =new XSSFWorkbook(Fis);
		
		//Get Sheet
		
		XSSFSheet WS = WB.getSheet("RoleData");
		
	//Row count
		
		int Rcount = WS.getLastRowNum();
		System.out.println(Rcount);
	//Multiple iteration-----Loop
		
	// Using For loop for row count
		
		for (int i = 1; i <=Rcount; i++) {
			
			XSSFRow WR = WS.getRow(i);
			
			XSSFCell WC = WR.getCell(0);
			XSSFCell WC1 = WR.getCell(1);
			XSSFCell WC2 = WR.getCell(2);
			XSSFCell WC3 = WR.createCell(3);
			
			String RoleName = WC.getStringCellValue();
			String RoleDesc = WC1.getStringCellValue();
			String RoleType = WC2.getStringCellValue();

			
			String Res = Lb.RoleCreation(RoleName, RoleDesc, RoleType);
			System.out.println(Res);
			
			WC3.setCellValue(Res);
												
			
		}
		
		FileOutputStream Fos = new FileOutputStream("C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\result\\Role.xlsx");
		WB.write(Fos);
		WB.close();
		
	
		
		
		
			
		
		
		

	}

}
