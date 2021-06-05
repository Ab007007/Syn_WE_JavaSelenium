package com.synechron.javatraining.files;

import java.io.File;

public class PrintFilesInaDir {

	
	public static void main(String[] args) {
		File f = new File("D:/");
		//printFileNames(f);
		File[] files = f.listFiles();
		
		for (File file : files)
		{
			System.out.println(file.getName() + " is a " + (file.isDirectory()? "Folder": "File"));
			System.out.println(" ITS Absolute PATH : " + file.getAbsolutePath());
			System.out.println(" Executable " + file.canExecute());
			System.out.println(" Readable " + file.canRead());
			System.out.println(" Writable " + file.canWrite());
			System.out.println(" PARENT " + file.getParent());
			System.out.println(" SIZE " + file.length());
			System.out.println("-------------------------------------------------------------------");
		}
		
		
		
	}

	private static void printFileNames(File f) {
		String[] files = f.list();
		
		for (String file : files) {
			System.out.println(file);
			
		}
	}
}
