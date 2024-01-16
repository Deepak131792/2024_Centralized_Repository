package useofcollection.youtubepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultiWindowHandeling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver refe=new ChromeDriver();
		refe.get("https://www.facebook.com/");
		refe.manage().window().maximize();
		Actions ac=new Actions(refe);
	//	for(int i=0;i<5;i=i+1)
		{
			ac.sendKeys(Keys.TAB).perform();
			//ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();//without forloop it is very fast click 5 times
			Thread.sleep(2000);
			//System.out.println();
		}
		
}
}