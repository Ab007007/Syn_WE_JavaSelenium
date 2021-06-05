package com.synechron.javatraining.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo
{
	
	
	public static void main(String[] args) {
		File f = null;
		FileInputStream fis = null;
		try
		{
			f = new File("data/test_15.txt");
			fis = new FileInputStream(f);
			int i,j=0;
			while((i=fis.read()) != -1)
			{
				System.out.print((char)i);
				j++;
			}
//			int a  = fis.read();
//			System.out.println((char)a);
			System.out.println("\ntotal iterations " + j );
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Exception while reading file");
		} catch (IOException e) {
			System.out.println("Exception while reading file");
		}
		finally
		{
			try
			{
				fis.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
