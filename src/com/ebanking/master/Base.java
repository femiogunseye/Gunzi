package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
	
	Library Lb =new Library();
	
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  Lb.AdminLogin("Admin","M1ndq");
  }

  @AfterTest
  public void afterTest() {
	  Lb.ApplicationLogout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException {
	  Lb.OpenApplication("http://183.82.100.55/ranford2");
  }

  @AfterSuite
  public void afterSuite() {
	  Lb.AppliationClose();
  }

}
