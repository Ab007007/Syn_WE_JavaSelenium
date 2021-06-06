package com.synechron.automation.actitime.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalDataReader {

	public static String getGlobalData(String key) {
		
		String value = null;
		File f = null;
		FileInputStream fis = null;
		Properties props =null;
		
		try {
			f = new File("data/globaldata.properties");
			 fis = new FileInputStream(f);
			 props = new Properties();
			 props.load(fis);
			 value = props.getProperty(key);
			 System.out.println("Got value " + value);
		}
		catch(Exception ex)
		{
			System.out.println("Exception while reading global data file");
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		return value;
	}

}
