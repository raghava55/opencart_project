package testCases;
import testBase.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void test_account_Registration() throws InterruptedException {
		
		logger.debug("application logs");
		//logger.info("***Starting TC_001_AccountRegistrationTest***");
		try {
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		hp.clickRegister();
		logger.info("Clicked on Register");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing customer data");
		
		regpage.setFirstName(randomString());
		regpage.setLastName(randomString());
		regpage.setEmail(randomString()+"@gmail.com");
	    regpage.setPassword("resdgh");
		regpage.clickTogglePrivacy();
		regpage.clickContinue();
		logger.info("Clicked Continue button");
		
		Thread.sleep(2000);
		String confmsg=regpage.getConfirmationMsg();
		
		logger.info("validating message");
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			
	    logger.error("test failed");
		Assert.fail();
		
	    }
		logger.info("***Finished TC_001_AccountRegistrationTest***");
	
	}
	
	 

}
