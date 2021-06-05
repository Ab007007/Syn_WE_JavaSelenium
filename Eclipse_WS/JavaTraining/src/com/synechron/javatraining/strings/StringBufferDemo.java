package com.synechron.javatraining.strings;

public class StringBufferDemo {

	
	public static void main(String[] args) {
		
		
		String str1 = new String("aru03.info@gmail.com");
		
		String emailID = "arav@gmail.com,ahb@yahoo.com,knr@outlook.com";

		StringBuffer str = new StringBuffer(str1);
				
		
		
		System.out.println("Character at index 0 " + str.charAt(0));
		System.out.println("Character at index 5 " + str.charAt(5));
		System.out.println("Index of a " + str.indexOf("a"));
		System.out.println("Index of a " + str.indexOf("a", 3));
		System.out.println("LAST Index of a " + str.lastIndexOf("a"));
		System.out.println("LAST Index of a " + str.lastIndexOf("a", 3));
		
		System.out.println("Substring : " + str.substring(str.indexOf("@")+1));
		System.out.println("Substring : " + str.substring(str.indexOf("@")+1, str.lastIndexOf(".")));
		System.out.println("aru03.info@gmail.com".equals(str));
		
		
		String[] emailIds = emailID.split(",");
		
		for (String email : emailIds) {
			System.out.println(email.substring(email.indexOf("@")+1, email.lastIndexOf(".")));
		}
		
		
		System.out.println("Revers : " + str.reverse());
		System.out.println("Insert : " + str.insert(0, "AFD "));
	
	}
}
