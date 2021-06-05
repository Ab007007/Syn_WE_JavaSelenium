package com.synechron.javatraining.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintTable {

	static int num = 15;
	public static void main(String[] args) throws IOException {
		System.out.println("Writing to file");
		File f = new File("data/test_" + num + ".txt");
		
		if(!f.exists())
			f.createNewFile();
		
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Generating a table for " + num);
		for (int i = 1; i <= 10; i++) 
		{
			bw.newLine();
			bw.write( num + " * " + i + " = " + (num*i));
		}
		
		bw.flush();
		bw.close();
		fw.close();
		System.out.println("Success");
	}
}
