package com.synechron.javatraining.wc;

public class WrapperClassesDemo {

	
	
	public static void main(String[] args) {
		
		String salary = "30000";
		
		
		int salaryInInt = Integer.valueOf(salary);
		
		System.out.println("Net salary per year " + (salaryInInt * 12));
		
	}
}
