package com.synechron.javatraining.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenerateTables
{
	
	public static void main(String[] args) {
		
		File f = null;
		FileOutputStream fos = null;
		String str = "\n This is my first program on Files \n";
		try
		{
			f = new File("data/test.txt");
			fos = new FileOutputStream(f, true);
			fos.write(str.getBytes());
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("Please Check the File PATH ");
		} 
		catch (IOException e) {
			System.out.println("Check the Write permission to file");
		}
		finally
		{
			try
			{
				fos.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}
