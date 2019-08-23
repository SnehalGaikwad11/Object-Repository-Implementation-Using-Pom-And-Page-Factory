package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;
	
	public ConfigReader()
	{

		try {
			File file=new File("./configuration/config.properties");
			FileInputStream fis=new FileInputStream(file);
			pro=new Properties();
			pro.load(fis);
		}
		catch (Exception e) 
		{
				System.out.println("Exceptions is:"+e.getMessage());	
		}
	}
	
	
	public String getChromePath() {
		
		String path=pro.getProperty("ChromeDriver");
		return path;
		
	}
	
	public String GetUrl()
	{
		return pro.getProperty("URL");
	}

}
