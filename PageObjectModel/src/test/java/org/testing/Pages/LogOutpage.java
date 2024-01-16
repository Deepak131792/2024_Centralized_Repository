package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutpage {

	ChromeDriver driver;
	Properties pr;
	

	public LogOutpage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void Lgout() throws InterruptedException
	{
		WebElement avtButton  = driver.findElement(By.id(pr.getProperty("signbtn")));
		avtButton.click();
		Thread.sleep(2000);
		WebElement signOut = driver.findElement(By.xpath(pr.getProperty("logout")));
		signOut.click();
		Thread.sleep(2000);
		
	}
}
