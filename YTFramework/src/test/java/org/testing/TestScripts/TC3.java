package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {

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
		WebElement video =driver.findElement(By.id("video-title"));
		video.click();
		WebElement likeButton  = driver.findElement(By.className("yt-spec-button-shape-next__button-text-content"));
		likeButton.click();
	}
}