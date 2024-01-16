package firstmavenProject.seleniumintro;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Basicscript 
{
	public void  Browserhandle() throws InterruptedException
	{
		ChromeDriver refe=new ChromeDriver();
		refe.get("https://www.facebook.com/");
		Options op=refe.manage();
		Window w=op.window();
  		w.maximize();
		//WebElement username=refe.findElement(By.cssSelector("input#email"));
		//username.sendKeys("Deepak");  //Perform the action 
		WebElement createAccount=refe.findElement(By.linkText("Create new account"));
		createAccount.click();
		Thread.sleep(3000);
		WebElement firstname=refe.findElement(By.name("firstname"));
		firstname.sendKeys("Deepak");
		WebElement sur=refe.findElement(By.name("lastname"));
		sur.sendKeys("Yadav");
		WebElement email=refe.findElement(By.name("reg_email__"));
		email.sendKeys("testmail@gmail.com");
		WebElement emailcon=refe.findElement(By.name("reg_email_confirmation__"));
		emailcon.sendKeys("testmail@gmail.com");
		WebElement pswrd=refe.findElement(By.name("reg_passwd__"));
		pswrd.sendKeys("Test123");
       // System.out.println("Pleas Enter Firstname Value");  //Provide input while run time 
		//Scanner s=new Scanner(System.in);
		//String firstnamee=s.next();
		//firstname.sendKeys(firstnamee);
		WebElement day=refe.findElement(By.name("birthday_day"));
		Select d=new Select(day);
		//d.selectByVisibleText("8");
		d.selectByIndex(7);
		WebElement month=refe.findElement(By.id("month"));
		Select m=new Select(month);
		m.selectByValue("7");
		WebElement year=refe.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("1992");
		//WebElement gender=refe.findElement(By.id("u_3_5_bs"));
		//gender.click();
		//refe.get("");
		refe.findElement(By.xpath("//input[@value='2']")).click();
		
	
	}
	
public static void main(String[] args) throws InterruptedException  {
	
	Basicscript basic=new Basicscript();
	basic.Browserhandle();
	
}
}
