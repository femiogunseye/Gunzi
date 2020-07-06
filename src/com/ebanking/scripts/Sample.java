package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browers
String Expectedval = "Ranford Bank";	
WebDriver driver = new FirefoxDriver();
driver.get("http://183.82.100.55/ranford2");
driver.manage().window().maximize();
//String Title = driver.getTitle();
//System.out.println(Title);
System.out.println(driver.getTitle());
String Actualval = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
//Comparison 

if (Expectedval.equalsIgnoreCase(Actualval))
{
System.out.println("Application launch sussesfully");	
}
else
{
	System.out.println("Aplication did not launch sussesfully");
}
	

//Admin login
Expectedval = "Welcome to Admin";
driver.findElement(By.id("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
driver.findElement(By.id("login")).click();
//Comparison 
Actualval = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();

if (Expectedval.equalsIgnoreCase(Actualval))
{
System.out.println("Admin logged in succesfully");	
}
else
{
	System.out.println("Admin did not launch succesfully");
}



// Add branches
Expectedval = "Sucessfully";
driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
driver.findElement(By.id("BtnNewBR")).click();
driver.findElement(By.id("txtbName")).sendKeys("korecommss");
driver.findElement(By.id("txtAdd1")).sendKeys("Westways");
driver.findElement(By.id("txtZip")).sendKeys("40412");
Select Country= new Select(driver.findElement(By.id("lst_counrtyU")));
Country.selectByVisibleText("UK");
Select State= new Select(driver.findElement(By.id("lst_stateI")));
State.selectByVisibleText("England");
Select City= new Select(driver.findElement(By.id("lst_cityI")));
City.selectByVisibleText("LONDON");
driver.findElement(By.id("btn_insert")).click();
Thread.sleep(4000);
Actualval = driver.switchTo().alert().getText();
driver.switchTo().alert().accept();
driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();

if (Actualval.contains(Expectedval)) {
	System.out.println("Branch Created");	
	}
else
{
	System.out.println("Branch Already Exist");
}
	


//Add Role
Expectedval = "Created";
driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
driver.findElement(By.id("btnRoles")).click();
driver.findElement(By.id("txtRname")).sendKeys("korefinancee");
driver.findElement(By.id("txtRDesc")).sendKeys("Finance Recoder");
Select RoleType= new Select(driver.findElement(By.id("lstRtypeN")));
RoleType.selectByVisibleText("E");
driver.findElement(By.id("btninsert")).click();
Thread.sleep(4000);
Actualval = driver.switchTo().alert().getText();
driver.switchTo().alert().accept();
driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
if (Actualval.contains(Expectedval)) {
	System.out.println("Role Created");	
	}
else
{
	System.out.println("Role Already Exist");
}

//Add Employee
Actualval = "New Employer";
driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
driver.findElement(By.id("BtnNew")).click();
driver.findElement(By.id("txtUname")).sendKeys("femiOgu");
driver.findElement(By.id("txtLpwd")).sendKeys("femii");
Select Role= new Select(driver.findElement(By.id("lst_Roles")));
Role.selectByVisibleText("korefinance");
Select Branch= new Select(driver.findElement(By.id("lst_Branch")));
Branch.selectByVisibleText("korecomms");
driver.findElement(By.xpath("//*[@id=\"BtnSubmit\"]")).click();
Thread.sleep(4000);
Actualval = driver.switchTo().alert().getText();
driver.switchTo().alert().accept();
driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();

if (Actualval.contains(Expectedval)) 
	{
	System.out.println("Employee Created");	
	}
else
{
	System.out.println("Employee Already Exist");
}

driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
driver.close();









	}

}
