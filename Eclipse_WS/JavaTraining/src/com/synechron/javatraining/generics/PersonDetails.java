package com.synechron.javatraining.generics;

import java.util.ArrayList;
import java.util.List;

import com.synechron.javatraining.constructor.Person;
import com.synechron.javatraining.variables.Employee;

public class PersonDetails {

	public static void main(String[] args) 
	{
		
		List<Person> al = new ArrayList<Person>();

		al.add(new Person("Person1", 5.5, 77, 90909090));
		al.add(new Person("Person2", 5.6, 37, 91909090));
		al.add(new Person("Person3", 5.7, 47, 92909090));
		al.add(new Person("Person4", 5.8, 57, 93909090));
		al.add(new Person("Person5", 5.9, 67, 94909090));
		al.add(new Person("Person6", 6.5, 87, 95909090));
		 
		
		
		
		for (Person person : al) {
			System.out.println(person);
		}
	}
	
}
