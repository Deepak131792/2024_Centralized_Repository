package useofcollection.youtubepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubemainpage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver refe=new ChromeDriver();
		refe.get("https://www.youtube.com/");
		refe.manage().window().maximize();
  		try
  		{
		List<WebElement> all=refe.findElements(By.id("video-title"));//total video :53 will show 
		//List<WebElement> all=refe.findElements(By.id("video-title11"));//id we will give wring id then it will not give any exception and total video count
		//will show as 0
		for(WebElement el:all)
		{
			el.click();
			Thread.sleep(2000);
			refe.navigate().back();
		}
		}catch (Exception e) {
		//System.out.println("total videos "+all.size());
			System.out.println("not able to find ");
		}
	}
}


