package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	@Test(groups={"Sanity","Master"})
	public void test_login() {
		
		try {
		logger.info("Starting TC_002_LoginTest...");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		logger.info("Clicking on Login Button");
		
		lp.clickLogin(); 
		logger.info("Clicked on Login Button");
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
		Assert.assertEquals(targetpage, true, "invalid data provided");
		}
		catch(Exception e){
			Assert.fail();
			System.out.println(e.getMessage());	
		}
		
		logger.info("***Finished TC_002_LoginTest***");
	}

}
