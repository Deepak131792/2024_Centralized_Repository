package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC1 extends Base {

	@Test
	public void Login() throws InterruptedException
	{
		WebElement signinButton = driver.findElement(By.xpath(pr.getProperty("loginButton")));
		signinButton.click();
		WebElement emailTextBox = driver.findElement(By.name(pr.getProperty("username")));
		emailTextBox.sendKeys("deepaktest31792@gmail.com");
		WebElement NextButton = driver.findElement(By.id(pr.getProperty("nxtbtn")));
		NextButton.click();
		Thread.sleep(5000);
		WebElement PasswordTextBox = driver.findElement(By.xpath(pr.getProperty("Password")));
		PasswordTextBox.sendKeys("Deepak@123");
		WebElement passNext = driver.findElement(By.id(pr.getProperty("next")));
		passNext.click();
		Thread.sleep(5000);
		WebElement trend = driver.findElement(By.xpath(pr.getProperty("trnd")));
		trend.click();
		WebElement avtButton  = driver.findElement(By.id(pr.getProperty("signbtn")));
		avtButton.click();
		Thread.sleep(2000);
		WebElement signOut = driver.findElement(By.xpath(pr.getProperty("logout")));
		signOut.click();
	}
}
