package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
    //Elements 
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span") WebElement lnkMyaccount;
	
	@FindBy(linkText="Register") WebElement lnkRegister;
	
	@FindBy(linkText="Login") WebElement lnkLogin;
	
	//Action methods
	
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	public void clickRegister() {
		lnkRegister.click();
	}
	public void clickLogin() {
		lnkLogin.click();
	}
	
}
