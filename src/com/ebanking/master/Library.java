package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library {
	
	
public static WebDriver driver;
public static String ExpectedValue, ActualValue;
public static FileInputStream fis;
public static Properties pr;
	
	
	

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
	
	public String BranchCreation(String BranchName, String BranchAdd, String ZipCode, String Ctry, String Ste, String Cty) throws InterruptedException
	{
		ExpectedValue = "Sucessfully";
		driver.findElement(By.xpath(pr.getProperty("Branch"))).click();
		driver.findElement(By.id(pr.getProperty("Newbranch"))).click();
		driver.findElement(By.id(pr.getProperty("B-Name"))).sendKeys(BranchName);
		driver.findElement(By.id(pr.getProperty("B-Add1"))).sendKeys(BranchAdd);
		driver.findElement(By.id(pr.getProperty("Z-Code"))).sendKeys(ZipCode);
		Select Country= new Select(driver.findElement(By.id(pr.getProperty("B-Country"))));
		Country.selectByVisibleText(Ctry);
		Select State= new Select(driver.findElement(By.id(pr.getProperty("B-State"))));
		State.selectByVisibleText(Ste);
		Select City= new Select(driver.findElement(By.id(pr.getProperty("B-City"))));
		City.selectByVisibleText(Cty);
		driver.findElement(By.id(pr.getProperty("BCreationSubmit"))).click();
		Thread.sleep(4000);
		ActualValue = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(pr.getProperty("BHome"))).click();

		if (ActualValue.contains(ExpectedValue)) 
		{
			System.out.println("Branch Created");	
		}
		else
		{
			System.out.println("Branch Already Exist");
		}
		return ActualValue;
		
	}
	
	public String RoleCreation(String RName, String RDecs, String RType) throws InterruptedException
	{
		ExpectedValue = "Created";
		driver.findElement(By.xpath(pr.getProperty("Roles"))).click();
		driver.findElement(By.id(pr.getProperty("NewRole"))).click();
		driver.findElement(By.id(pr.getProperty("R-Name"))).sendKeys(RName);
		driver.findElement(By.id(pr.getProperty("R-Desc"))).sendKeys(RDecs);
		Select RoleType= new Select(driver.findElement(By.id(pr.getProperty("R-Type"))));
		RoleType.selectByVisibleText(RType);
		driver.findElement(By.id(pr.getProperty("RCreationSubmit"))).click();
		Thread.sleep(4000);
		ActualValue = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(pr.getProperty("RHome"))).click();
		if (ActualValue.contains(ExpectedValue)) {
			System.out.println("Role Created");	
			}
		else
		{
			System.out.println("Role Already Exist");
		}
		return ActualValue;
	}
	
	public String EmployeeCreation(String EUserName, String EPassword, String RName, String BranchName) throws InterruptedException
	{
		ActualValue = "New Employer";
		//driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.xpath(pr.getProperty("Employee"))).click();
		driver.findElement(By.id(pr.getProperty("NewEmployee"))).click();
		driver.findElement(By.id(pr.getProperty("EmployeeName"))).sendKeys(EUserName);
		driver.findElement(By.id(pr.getProperty("LoginPassword"))).sendKeys(EPassword);
		Select Role= new Select(driver.findElement(By.id(pr.getProperty("E-Role"))));
		Role.selectByVisibleText(RName);
		Select Branch= new Select(driver.findElement(By.id(pr.getProperty("E-Branch"))));
		Branch.selectByVisibleText(BranchName);
		driver.findElement(By.xpath(pr.getProperty("ECreationSubmit"))).click();
		Thread.sleep(4000);
		ActualValue = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(pr.getProperty("EHome"))).click();

		if (ActualValue.contains(ExpectedValue)) {
			System.out.println("Employee Created");	
			}
		else
		{
			System.out.println("Employee Already Exist");
		}
		return ActualValue;

	}
	
	public void ApplicationHome()
	{
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();

	}
	
	public void ApplicationLogout()
	{
		driver.findElement(By.xpath(pr.getProperty("Logout"))).click();

	}
	
	public void AppliationClose()
	{
		driver.close();

	}
}
