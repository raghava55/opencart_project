package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	//Elements 
	@FindBy(name="firstname") WebElement txtFirstName;
	
	@FindBy(name="lastname") WebElement txtLastName;
	
	@FindBy(name="email") WebElement txtEmail;
	
	@FindBy(name="password") WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"input-newsletter\"]") WebElement toggleSubscribe;
	
	@FindBy(xpath="//*[@id=\"form-register\"]/div/div/input") WebElement togglePrivacy;
	
	@FindBy(xpath="//*[@id=\"form-register\"]/div/button") WebElement btnContinue;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1") WebElement msgConfirmation;
	
	
	
	//Action Methods 
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void clickSubscribe() {
		//radioButtonYes.click();
		js.executeScript("arguments[0].click", toggleSubscribe);
	}


	public void clickTogglePrivacy() {
		js.executeScript("arguments[0].click()", togglePrivacy);
	}
	public void clickContinue() {
		js.executeScript("arguments[0].click()", btnContinue);
	}
	public String getConfirmationMsg() {
		
		try {
		return (msgConfirmation.getText()); 
		} 
		catch (Exception e) {
		return (e.getMessage());
		}
	}
	
	
}
