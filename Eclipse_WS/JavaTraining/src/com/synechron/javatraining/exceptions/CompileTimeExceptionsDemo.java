package com.synechron.javatraining.exceptions;

public class CompileTimeExceptionsDemo 
{

	public static void main(String[] args) {
		System.out.println("--- Main Started ---");
		try 
		{
			System.out.println("inside try");
			exceptionDemo(1);
			System.out.println("last line of try");
		}
		catch (Exception e) {
			System.out.println("Exception while executing method");
		}
		finally
		{
			System.out.println("Always!!!!");
		}
		System.out.println("--- Main Ended ---");
	}
	
	
	
	
	public static void exceptionDemo(int a) throws Exception 
	{
		if(a==1)
			throw new Exception();
		else
			System.out.println("Function executed successfully");
		
	}
	
}
