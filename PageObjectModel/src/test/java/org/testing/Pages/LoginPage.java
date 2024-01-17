package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	ChromeDriver driver;
	Properties pr;
	public LoginPage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String Username,String Password) throws Exception
	{
		//the complete code of signin page write here
		//we rquire drive object& Properties objcets
		WebElement login=driver.findElement(By.xpath(pr.getProperty("loginButton")));
		login.click();
		WebElement emailTextBox = driver.findElement(By.name(pr.getProperty("username")));
		emailTextBox.sendKeys("deepaktest31792@gmail.com");
		Thread.sleep(3000);
		WebElement NextButton = driver.findElement(By.id(pr.getProperty("nxtbtn")));
		NextButton.click();
		Thread.sleep(3000);
		WebElement PasswordTextBox = driver.findElement(By.xpath(pr.getProperty("Password")));
		PasswordTextBox.sendKeys("Deepak@123");
		WebElement passNext = driver.findElement(By.id(pr.getProperty("next")));
		passNext.click();
		Thread.sleep(5000);
	}


}
