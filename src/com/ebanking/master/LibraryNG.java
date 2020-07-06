package com.ebanking.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class LibraryNG {

	WebDriver driver;
	String ExpectedValue, ActualValue;
	FileInputStream fis;
	Properties pr;
	
	
	
@BeforeSuite
public String OpenApplication(String URL) throws IOException
	
	{
		
			// LAUNCH BROWSER
	
	fis= new FileInputStream("C:\\SeleniumProjectsWorks\\EBanking\\src\\com\\ebanking\\properties\\Repository.properties");
	pr = new Properties();
	pr.load(fis);
	ExpectedValue = "Ranford Bank";	
	driver = new FirefoxDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	//String Title = driver.getTitle();
	//System.out.println(Title);
	System.out.println(driver.getTitle());
	ActualValue = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	//Comparison 

	if (ExpectedValue.equalsIgnoreCase(ActualValue))
	{
	System.out.println("Application launch sussesfully");	
	}
	else
	{
		System.out.println("Application did not launch sussesfully");
	}
	return "application launch";
	}
	

			// ADMIN LOGIN
	@BeforeTest
	public String AdminLogin(String Username, String Password)
	{
	

		ExpectedValue = "Welcome to Admin";
		driver.findElement(By.id(pr.getProperty("Uname"))).sendKeys(Username);
		driver.findElement(By.id(pr.getProperty("Pword"))).sendKeys(Password);
		driver.findElement(By.id(pr.getProperty("LIn"))).click();
		//driver.findElement(By.id(pr.getProperty("LIn"))).click();
		
		//Comparison 
		ActualValue = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		if (ExpectedValue.equalsIgnoreCase(ActualValue))
		{
			System.out.println("Admin logged in succesfully");	
		}
		else
		{
			System.out.println("Admin did not launch succesfully");
		}
		return "Logged in";

	}
	@AfterTest
	public void ApplicationLogout()
	{
		driver.findElement(By.xpath(pr.getProperty("Logout"))).click();

	}
	@AfterSuite
	public void AppliationClose()
	{
		driver.close();

	}
}
