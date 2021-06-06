package com.testng;

import org.testng.annotations.Test;

public class GroupDemo 
{
	@Test(groups = {"smoke","regression"})
	public void test1()
	{
		
	}

	@Test(groups = {"smoke"})
	public void test2()
	{
		
	}

	@Test(groups = {"smoke","sanity"})
	public void test3()
	{
		
	}

	@Test(groups = {"regression"})
	public void test4()
	{
		
	}

	@Test(groups = {"smoke","regression"})
	public void test5()
	{
		
	}

	@Test(groups = {"regression"})
	public void test6()
	{
		
	}

	@Test(groups = {"smoke","regression"})
	public void test7()
	{
		
	}

}
