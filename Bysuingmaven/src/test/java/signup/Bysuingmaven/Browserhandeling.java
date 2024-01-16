package signup.Bysuingmaven;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browserhandeling {

	//public static void main(String[] args) throws InterruptedException {
	 @Test
	public void first() throws InterruptedException {
		ChromeDriver refvar=new ChromeDriver();
		refvar.get("https://www.facebook.com/");
		refvar.manage().window().maximize();
		//WebElement createAccount=refvar.findElement(By.linkText("Create new account"));
		WebElement createAccount=refvar.findElement(By.xpath("//a[text()='Create new account']"));
		createAccount.click();
		Thread.sleep(2000);
		//WebElement firstname=refvar.findElement(By.xpath("//input[@name='firstname']"));
		 WebElement firstname=refvar.findElement(By.xpath("//input[contains(@id,'u_2_b_')]"));
		//WebElement firstname=refvar.findElement(By.xpath("//input[@tabindex='0']"));
		firstname.sendKeys("Deepesh");
		WebElement lstname=refvar.findElement(By.xpath("//input[@name='lastname']"));
		lstname.sendKeys("shah");
		WebElement mailid=refvar.findElement(By.xpath("//input[@name='reg_email__']"));
		mailid.sendKeys("test@gmail.com");
		WebElement mailidcnfrm=refvar.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		mailidcnfrm.sendKeys("test@gmail.com");
		WebElement pswrd=refvar.findElement(By.xpath("//input[@autocomplete='new-password']"));
		pswrd.sendKeys("test123");
		WebElement day=refvar.findElement(By.id("day"));
		//Select t =new Select(day);
	  //  t.selectByVisibleText("8");
		dropdownSelectionUsingVisibleText("8",day);
	    WebElement month=refvar.findElement(By.name("birthday_month"));
	    dropdownSelectionUsingVisibleText("Aug",month);
	  //  Select m=new Select(month);
	//    m.selectByValue("8");
	   WebElement year=refvar.findElement(By.name("birthday_year"));
	   dropdownSelectionUsingVisibleText("1996",year);
	  // Select y=new Select(year);
	  // y.selectByValue("1995");
	  WebElement gender=refvar.findElement(By.xpath("//input[@value='2']"));  ///For male radio button
	  // WebElement gender=refvar.findElement(By.xpath("//input[@value='-1']"));
		gender.click();		
}
	public static void dropdownSelectionUsingVisibleText(String visibleTextValue,WebElement dropdownelement )
	{
		Select t =new Select(dropdownelement);
	    t.selectByVisibleText(visibleTextValue);
		
	}
}


