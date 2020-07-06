package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException {

		Library Lb= new Library();
		
		Lb.OpenApplication("http://183.82.100.55/ranford2");
		Lb.AdminLogin("Admin","M1ndq");
		
		String Fpath = "C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\result\\Role.txt";
		String SD;
		
		String Rpath = "C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\result\\Ress_Role.txt";
		
		FileReader FR = new FileReader(Fpath);
		BufferedReader BR = new BufferedReader(FR);
		String Sread = BR.readLine();
		System.out.println(Sread);
		
		FileWriter FW = new FileWriter(Rpath);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		while ((SD=BR.readLine())!=null)
			
		{
			System.out.println(SD);
			
			String SR[] = SD.split("###");
			String RName =SR[0];
			String RDecs =SR[1];
			String RType =SR[2];
			
			String Ress=Lb.RoleCreation(RName, RDecs, RType);
			System.out.println(Ress);
			BW.write(SD+"$$$$"+ Ress);
			BW.newLine();
			
		}
		BW.close();
		BR.close();
			
		
	}

}
