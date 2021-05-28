package com.synechron.javatraining.methods;

public class Addition 
{
	
	static int a  = 10;
	static int b = 20;
	
	public static void main(String[] args) {
		Addition ad  = new Addition();
		
		ad.sum();
		int c= ad.sum(20, 30);
		
		System.out.println("sum of two numbers is " + c);
		System.out.println("Average of two numbers  is " + c/2);
		
		
		///static functions
		
		sub();
		int d  =  sub(30, 10);
		System.out.println("sub of two numbers is " + d);
		System.out.println("Average of two numbers  is " + d/2);
		
	}
	
	
	/*
	 * [access specifiers] [access modifiers] return_type nameofthefunction([arguments1, arguments2,...]) 
	 * {
	 *	
	 * }
	 */
	void sum()
	{
	
		int c ;
		c = a + b;
		System.out.println("The sum of two numbers from sum function " + c);
		
	}
	
	int sum(int a , int b)
	{
		int c = a + b;
		
		return c;
	}
	
	static void sub()
	{
	
		int c ;
		c = a - b;
		System.out.println("The sub of two numbers from sum function " + c);
		
	}
	
	static int sub(int a , int b)
	{
		int c = a - b;
		
		return c;
	}
	
	
	
	

}
