package com.synechron.javatraining.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		File f = new File("data/test.txt");
	
		if(f.exists())
			System.out.println("File Alredy Exist");
		else
		{
			try 
			{
				f.createNewFile();
				System.out.println("File is newly Created");
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
		
		System.out.println(" Executable " + f.canExecute());
		System.out.println(" Readable " + f.canRead());
		System.out.println(" Writable " + f.canWrite());
		
	}
}
