package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	WebDriver driver;
	Properties prop;
	
	
	
	
	/*
	public void loadPropertyFile()
	{
		prop=new Properties();
		
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			prop.load(fis);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	*/
	
	public BaseClass()
	{
prop=new Properties();
		
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			prop.load(fis);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
	}
		
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		//loadPropertyFile();
		String browserName=prop.getProperty("BROWSER");
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get(prop.getProperty("URL"));
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		
	//	driver.quit();
	}	
}
