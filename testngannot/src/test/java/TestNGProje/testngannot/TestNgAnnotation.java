package TestNGProje.testngannot;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("After suite annotation");
	}
    @AfterTest
    public void atest()
	{
		System.out.println("After Test annotation");
	}
   @AfterClass
    public void aclass()
   	{
   		System.out.println("After Class annotation");
   	}
   @AfterMethod
   public void amethod()
  	{
  		System.out.println("After Method annotation");
  	}
   @Test
   public void tc()
  	{
  		System.out.println("Test case annotation");
  	}
    	
  @Test(dependsOnMethods="xyz")
  // @Test(priority=1)
   public void abc()
  	{
  		System.out.println("Test case1 annotation");
  	}
   @Test (priority=0) 
   public void xyz()  
  	{
  		System.out.println("Test case2 annotation");
  	}
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before suite annotation");
	}
    @BeforeTest
    public void btest()
	{
		System.out.println("Before Test annotation");
	} 
   @BeforeClass 
    public void bclass()
   	{
   		System.out.println("Before Class annotation");
   	}
   @BeforeMethod 
   public void bmethod()
  	{
  		System.out.println("Before Method annotation");
  	}
}
