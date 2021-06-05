package com.synechron.javatraining.strings;

public class StringReverseDemo {

	
	public static void main(String[] args) {
		String str = "Hello All How are you today!!";
		
		String[] strArray = str.split(" ");
		
		for (int i = 0; i < strArray.length; i++) 
		{
			String str1 = null;
			str1 = strArray[i];
			
			stringReverse(str1);
			System.out.print(" ");
		}
		
	//	stringReverse(str);
	}

	
	
	
	
	
	private static void stringReverse(String str) {
		for (int i = str.length()-1; i >=0 ; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
