package org.testing.Pages;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;
    Properties pr;
	public HomePage(ChromeDriver driver,Properties pr)//constructor 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void clickTrending()
	{
		WebElement trend = driver.findElement(By.xpath(pr.getProperty("trnd")));
		trend.click();
		
	}
}
