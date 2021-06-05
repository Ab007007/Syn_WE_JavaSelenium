package com.synechron.javatraining.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	
	
	public static void main(String[] args) {
		
		Map mp = new LinkedHashMap();
		
		
		mp.put("name", "Aravinda");
		mp.put("email", "aru@gmail");
		mp.put("phone", 1321123);
		
		System.out.println("Size " + mp.size());
		System.out.println(mp.get("name"));
		System.out.println(mp.get("email"));
		System.out.println(mp.get("phone"));
		
		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			System.out.println("Printing element " + mp.get(it.next()));
		}
		
		
		
	}
}
