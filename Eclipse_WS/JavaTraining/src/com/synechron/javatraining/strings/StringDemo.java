package com.synechron.javatraining.strings;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str = new String("aru03.info@gmail.com");
		
		String emailID = "arav@gmail.com,ahb@yahoo.com,knr@outlook.com";

		System.out.println("Character at index 0 " + str.charAt(0));
		System.out.println("Character at index 5 " + str.charAt(5));
		System.out.println("Index of a " + str.indexOf("a"));
		System.out.println("Index of a " + str.indexOf("a", 3));
		System.out.println("LAST Index of a " + str.lastIndexOf("a"));
		System.out.println("LAST Index of a " + str.lastIndexOf("a", 3));
		
		System.out.println("Substring : " + str.substring(str.indexOf("@")+1));
		System.out.println("Substring : " + str.substring(str.indexOf("@")+1, str.lastIndexOf(".")));
		System.out.println("TO UPPER : " + str.toUpperCase());
		System.out.println("LOWER : " + str.toLowerCase());
		System.out.println("aru03.info@gmail.com".equals(str));
		System.out.println("Aru03.info@gmail.com".equalsIgnoreCase(str));
		
		
		String[] stringArray = str.split("@");
		for (String string : stringArray)
		{
			System.out.println(string);
		}
		
		
		String[] emailIds = emailID.split(",");
		
		for (String email : emailIds) {
			System.out.println(email.substring(email.indexOf("@")+1, email.lastIndexOf(".")));
		}
	
	}

}
