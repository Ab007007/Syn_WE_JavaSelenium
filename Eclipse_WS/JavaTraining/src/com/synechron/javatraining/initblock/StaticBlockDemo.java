package com.synechron.javatraining.initblock;

public class StaticBlockDemo {

	
	static
	{
		System.out.println("Before Main");
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("--- main started ---");
		
		System.out.println("--- end main ----");
	}
}
