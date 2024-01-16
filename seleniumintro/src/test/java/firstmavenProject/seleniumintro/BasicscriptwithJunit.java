package firstmavenProject.seleniumintro;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicscriptwithJunit {
	
	ChromeDriver ref;
	@Before
	public void init()
	{
		 ref= new ChromeDriver();
		ref.get("https://www.facebook.com/");
		Options op=ref.manage();
		Window w=op.window();
		w.maximize();
	}
	@After
	public void closure()
	{
		ref.close();
	}
	
	@Test
	public void  Browserhandle() throws InterruptedException
	{
		
		//WebElement username=ref.findElement(By.cssSelector("input#email"));
		//username.sendKeys("Deepak");  //Perform the action 
		WebElement createAccount=ref.findElement(By.linkText("Create new account"));
		createAccount.click();
		Thread.sleep(3000);
		WebElement firstname=ref.findElement(By.name("firstname"));
		firstname.sendKeys("Deepak");
		WebElement sur=ref.findElement(By.name("lastname"));
		sur.sendKeys("Yadav");
		WebElement email=ref.findElement(By.name("reg_email__"));
		email.sendKeys("testmail@gmail.com");
		WebElement emailcon=ref.findElement(By.name("reg_email_confirmation__"));
		emailcon.sendKeys("testmail@gmail.com");
		WebElement pswrd=ref.findElement(By.name("reg_passwd__"));
		pswrd.sendKeys("Test123");
       // System.out.println("Pleas Enter Firstname Value");  //Provide input while run time 
		//Scanner s=new Scanner(System.in);
		//String firstnamee=s.next();
		//firstname.sendKeys(firstnamee);
		WebElement day=ref.findElement(By.name("birthday_day"));
		Select d=new Select(day);
		//d.selectByVisibleText("8");
		d.selectByIndex(7);
		WebElement month=ref.findElement(By.id("month"));
		Select m=new Select(month);
		m.selectByValue("7");
		WebElement year=ref.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("1992");
		//WebElement gender=ref.findElement(By.id("u_3_5_bs"));
		//gender.click();
		//ref.get("");
		ref.findElement(By.xpath("//input[@value='2']")).click();
	}
	}