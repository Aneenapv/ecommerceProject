package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SpotifyPropertyUtil {
	
	public static String getProperty(String filePath, String key)
	{
		Properties prop = new Properties();
		
		try
		{
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		prop.load(reader);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

}
