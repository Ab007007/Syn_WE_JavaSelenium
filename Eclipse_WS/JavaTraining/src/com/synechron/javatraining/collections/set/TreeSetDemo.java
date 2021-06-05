package com.synechron.javatraining.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{
	
	public static void main(String[] args) 
	{
		Set s = new TreeSet();
		
		s.add(7894);
		s.add(1234);
		s.add(4567);
		
	
		System.out.println(s.size());
		
		
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
