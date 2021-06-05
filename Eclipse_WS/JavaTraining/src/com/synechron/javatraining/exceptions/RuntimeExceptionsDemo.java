package com.synechron.javatraining.exceptions;

public class RuntimeExceptionsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		String str = null;
		try
		{
			System.out.println(str.length());
			System.out.println(str.charAt(0));
		}
		catch (NullPointerException ex)
		{
			System.out.println("Please check the string assigned or not");
			System.out.println(ex.getMessage());
		}
		System.out.println("main Ended");
	}

}
