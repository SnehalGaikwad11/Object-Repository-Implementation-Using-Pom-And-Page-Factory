package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadChrodriverfromproertyfile {
	
	
	@Test
	public void  testConfig() throws Exception
	
	{
		File file=new File("./configuration/config.properties");
        FileInputStream fis=new FileInputStream(file);
        
        Properties pro=new Properties();
        pro.load(fis);
        
         String chromepath=pro.getProperty("chromedriver");
         System.out.println("Chrome Path is:"+chromepath);
	}

}
