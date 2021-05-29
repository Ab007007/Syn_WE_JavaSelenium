package com.synechron.javatraining.inheritence;

public class Doctor extends Person
{
	
	String hospitalName ;
	String hospID;
	String empEmail;
	
	@Override
	public void profession() {
		System.out.println("Doctor");
		
	}
	
	
	
	public static void main(String[] args) {
		Doctor e1 = new Doctor();
		
		e1.name = "AHB";
		e1.height = 5.8;
		e1.weight = 55;
		e1.hospitalName = "Fortis";
		e1.hospID = "EMP123";
		e1.empEmail = "DAFDS@fortis.com";
		
		e1.getFamily();
		e1.maxAge();
		e1.profession();
		
		
		
	}
}
