package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOutpage;
import org.testing.Pages.LoginPage;
import org.testng.annotations.Test;

public class TestCase1 extends Base {

	@Test
	public void testCase() throws Exception
	{
		//Login/trending click/singout
		LoginPage login=new LoginPage(driver,pr); 
		login.signin("deepaktest31792@gmail.com","Deepak@123");
		HomePage home=new HomePage(driver,pr);
		//home.clickTrending();
		LogOutpage lgoutt=new LogOutpage(driver,pr);
	//	lgoutt.Lgout();
	}
}
	


