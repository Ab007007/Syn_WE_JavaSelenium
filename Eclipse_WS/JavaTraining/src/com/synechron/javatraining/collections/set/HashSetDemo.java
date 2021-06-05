package com.synechron.javatraining.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{
	
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		
		s.add(1234);
		s.add(4567);
		s.add(7894);
	
		System.out.println(s.size());
		
		
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
