package com.synechron.javatraining.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo 
{
	
	
	public static void main(String[] args) {
		
		List al =  new ArrayList();
		al.add("aaa");
		al.add(33);
		al.add(5.5);	
		al.add(33);
		al.add(5.5);
		al.add(true);
		printCollection(al);
		
		System.out.println("Inserting element at 0th index ");
		al.add(0, "New AAA");
		printCollection(al);
		
		System.out.println("Delete element at 0th Index");
		al.remove(0);
		printCollection(al);
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
			printCollection(al);
			printCollectionUsingForEach(al);
			printCollectionUsingIterator(al);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
	}

	private static void printCollection(List al) {
		System.out.println("------------------ PRINTING USING FOR LOOP  ------------------------------------");
		System.out.println(" Total Elements in Collection " + al.size());
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("Element at " + i + " index " + " : " + al.get(i));
		}
	}
	
	
	
	private static void printCollectionUsingForEach(List al) {
		System.out.println("--------------------- PRINTING USING FOREACH LOOP  ---------------------------------");
		System.out.println(" Total Elements in Collection " + al.size());
		for (Object object : al) {
			System.out.println(object);
		}
	}
	
	private static void printCollectionUsingIterator(List al) {
		System.out.println("--------------------- PRINTING USING ITERATOR  ---------------------------------");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
