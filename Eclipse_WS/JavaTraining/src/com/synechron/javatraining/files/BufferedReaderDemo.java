package com.synechron.javatraining.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	
	public static void main(String[] args) throws IOException {
		
		File  f = new File("data/test_15.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		int j = 0;
		String line = null;
		while((line= br.readLine())!=null)
		{
			System.out.println(line);
			j++;
		}
		
		System.out.println("Total iterations made " + j);
		br.close();
		fr.close();
		
		
	}
}
