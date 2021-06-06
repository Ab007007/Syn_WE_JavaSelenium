package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderDemo 
{
  @Test(dataProvider = "demodata", dataProviderClass = TestData.class)
  public void f(Integer n, String s, Boolean flag) 
  {
	  System.out.println(n +"------>" + s +"------>" + flag );
	  
  }


}
