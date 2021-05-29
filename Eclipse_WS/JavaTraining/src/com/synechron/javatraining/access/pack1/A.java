package com.synechron.javatraining.access.pack1;

public class A {

	
	private int privateVariable = 10;
	int defaultVariable = 100;
	protected int protectedVariable = 1000;
	public int publicVariable = 10000;
	
	final static public int publicVariable2 = 20000;
	
	//abstract void test();
	public static void main(String[] args) 
	{
		
		A a1 = new A();
		
		System.out.println(a1.privateVariable);
		System.out.println(a1.defaultVariable);
		System.out.println(a1.protectedVariable);
		System.out.println(a1.publicVariable);
		
	}
	
}
