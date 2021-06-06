package com.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingDependson 
{
  @Test
  public void launch() 
  {
	  System.out.println("Test-1");
  }

  @Test(dependsOnMethods = "launch")
  public void login() 
  {
	  System.out.println("Test-1");
  }
  @Test(dependsOnMethods = {"login" , "launch"})
  public void createCustomer() 
  {
	  System.out.println("Test-1");
  }
  @Test(dependsOnMethods = "createCustomer")
  public void logout() 
  {
	  System.out.println("Test-1");
  }
}
