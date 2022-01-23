package com.Resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class 
{
	public WebDriver driver;		//declared webDeiver object - driver
	public WebDriver Driver_initialization() throws IOException
	{
		Properties prop = new Properties();
		//FileInputStream : is used to read the file
		FileInputStream fis = new FileInputStream("C:\\Users\\saran\\eclipse-workspace\\TestNGFramework\\src\\main\\java\\com\\Resources\\data.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("Browser");
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\saran\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		//firefox code
		else if(BrowserName.equals("Firefox"))
		{	
		}
		//IE code
		else if(BrowserName.equals("IE"))
		{
		}
		return driver;
	}
}
//base class :used is browser realated code.
//maven project architecture provide karta hai