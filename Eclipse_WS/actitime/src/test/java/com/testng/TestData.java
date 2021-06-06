package com.testng;

import org.testng.annotations.DataProvider;

public class TestData {

	  @DataProvider
	  public Object[][] demodata() {
	    return new Object[][] {
	      new Object[] { 1, "a", true },
	      new Object[] { 2, "b", false },
	    };
	  }
	  
	  
	  @DataProvider
	  public Object[][] createcustomerdata() {
	    return new Object[][] {
	      new Object[] { "Syn-WE-TestNG-Cu8","Syn-WE-TestNG-Cu1-Desc6" },
	      new Object[] { "Syn-WE-TestNG-Cu9","Syn-WE-TestNG-Cu1-Desc7" },
	    };
	  }
	  
	  
	  @DataProvider
	  public Object[][] createprojectdata() {
	    return new Object[][] {
	      new Object[] { "Syn-WE-TestNG-Cu1","Project1","Project-Desc1" },
	      new Object[] { "Syn-WE-TestNG-Cu1","Project2","Project-Desc2" },
	      new Object[] { "Syn-WE-TestNG-Cu2","Project1","Project-Desc1" },
	      new Object[] { "Syn-WE-TestNG-Cu3","Project1","Project-Desc1" },
	      new Object[] { "Syn-WE-TestNG-Cu3","Project2","Project-Desc2" },
	    };
	  }
}
