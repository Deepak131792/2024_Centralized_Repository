package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {

	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void LunchBrowserr() throws IOException
	{
		File f=new File("../Framaeworkpar/Object properties");
		FileReader fr= new FileReader(f);
		pr=new Properties();
		pr.load(fr);  
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
}
	@AfterMethod
	
	public void closerbrowser()
	{
		driver.close();
	}
}