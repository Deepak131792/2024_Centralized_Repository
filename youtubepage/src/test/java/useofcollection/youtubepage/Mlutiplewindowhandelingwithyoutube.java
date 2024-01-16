package useofcollection.youtubepage;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mlutiplewindowhandelingwithyoutube {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver refe=new ChromeDriver();
		refe.get("https://www.youtube.com/");
		refe.manage().window().maximize();
		WebElement video =refe.findElement(By.id("video-title"));
				Actions ac=new Actions(refe);
				ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
	            String currenttab=refe.getWindowHandle();
	           Set<String> allWindows= refe.getWindowHandles();
	           System.out.println("total tabs "+allWindows.size());
	           int deepak=0;
	           for(String s:allWindows)
	           {
	        //	 refe.switchTo().window(s);
	        	 deepak=deepak+1;
	        	 if(deepak==2)
	        	// if(refe.getCurrentUrl().equals("SecondtabURL"))
	        	 {
	        		 refe.switchTo().window(s);
 
	           break;
	        	 }
	        	 }
	        	 
	           System.out.println("now url is "+refe.getCurrentUrl());
	           refe.switchTo().window(currenttab);
	           System.out.println("Finally Url is "+refe.getCurrentUrl());
	} 
}
