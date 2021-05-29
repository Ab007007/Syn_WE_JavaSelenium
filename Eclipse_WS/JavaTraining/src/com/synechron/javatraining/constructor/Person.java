package com.synechron.javatraining.constructor;

public class Person {

	String name;
	double height;
	double weight;
	long phonenum;
	static int count ;
	
	{
		count++;
	}
	
	
	
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
	
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Aravinda",5.8, 78, 99885858);
		Person p3 = new Person("Harry",5.0, 88, 88885858);
		
		for (int i = 0; i < 10; i++) {
			new Person();
		}
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Total objects created to this class " + count);
	}
}
