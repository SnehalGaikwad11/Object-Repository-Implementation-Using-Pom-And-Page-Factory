package ConfigurationDemo;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ConfigReader;

public class TestSelenium {

	
	ConfigReader config;
	
	@BeforeTest
	public void setUp() throws IOException
	{
	config=new ConfigReader();
	System.setProperty("webdriver.chrome.driver", config.getChromePath());
	System.out.println("Ready for SetUp");
	}

	@Test
	public void testConfig() throws IOException 
	{
	System.out.println("Here Test is Started");

	WebDriver driver = new ChromeDriver();
	driver.get(config.GetUrl());
	//driver.quit();
	System.out.println("Here Test is Closed");

	}
	}

