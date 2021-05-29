package com.synechron.javatraining.inheritence;

public abstract class Person extends Animal {

	String name;
	double height;
	double weight;
	long phonenum;
	static int count ;
	public abstract void profession();
	
	@Override
	public String toString() {
		
		String str = "Person Object Values are \n Name : " + this.name 
				+ "\n Height : " + this.height + "\n Weight : " + this.weight +
				"\n phonenum : " + this.phonenum  + "\n------------------------------";
		// TODO Auto-generated method stub
		return str;
	}
	
	public Person() {

		System.out.println("Default Constructor called!!!");
	}
	
	public Person(String name,	double height,	double weight,	long phonenum) {
			this.name = name;
			this.height = height;
			this.weight = weight;
			this.phonenum = phonenum;
		
	}
	
	@Override
	public void getFamily() {
		System.out.println("Person is a HumanBeing");
		
	}

	@Override
	public void maxAge() {
		System.out.println("MAX AGE is 100+ years");
		
	}
}
