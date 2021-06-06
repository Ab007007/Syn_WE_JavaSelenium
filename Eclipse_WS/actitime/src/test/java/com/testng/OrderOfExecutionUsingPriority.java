package com.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingPriority 
{
  @Test(priority = 1)
  public void launch() 
  {
	  System.out.println("Test-1");
  }

  @Test(priority = 2)
  public void login() 
  {
	  System.out.println("Test-1");
  }
  @Test(priority = 3)
  public void createCustomer() 
  {
	  System.out.println("Test-1");
  }
  @Test(priority = 4)
  public void logout() 
  {
	  System.out.println("Test-1");
  }
}
