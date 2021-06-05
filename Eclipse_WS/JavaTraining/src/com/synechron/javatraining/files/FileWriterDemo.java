package com.synechron.javatraining.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	
	public static void main(String[] args) throws IOException {
		System.out.println("Writing to file");
		File f = new File("data/test.txt");
		
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.write("this is from my writer class");
		
		bw.flush();
		bw.close();
		fw.close();
		System.out.println("Success");
	}
}
