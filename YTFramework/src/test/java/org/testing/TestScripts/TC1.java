package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.errorprone.annotations.FormatString;

public class TC1 {

	ChromeDriver driver;
	@BeforeMethod
	public void LunchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Login() throws InterruptedException
	{
		WebElement signinButton = driver.findElement(By.xpath("//a[contains(@href,'https://accounts.google.com/ServiceLogin?')]"));
		signinButton.click();
		WebElement emailTextBox = driver.findElement(By.name("identifier"));
		emailTextBox.sendKeys("deepaktest31792@gmail.com");
		WebElement NextButton = driver.findElement(By.id("identifierNext"));
		NextButton.click();
		Thread.sleep(5000);
		WebElement PasswordTextBox = driver.findElement(By.xpath("//input[@name='Passwd']"));
		PasswordTextBox.sendKeys("Deepak@123");
		WebElement passNext = driver.findElement(By.id("passwordNext"));
		passNext.click();
		Thread.sleep(5000);
		WebElement trend = driver.findElement(By.xpath("//a[contains(@href,'/feed/trending')]"));
		trend.click();
		WebElement avtButton  = driver.findElement(By.id("avatar-btn"));
		avtButton.click();
		Thread.sleep(2000);
		WebElement signOut = driver.findElement(By.xpath("//a[@href='/logout']"));
		signOut.click();
	}
	@AfterMethod
	
	public void browserclose()
	{
		driver.close();
	}
}
