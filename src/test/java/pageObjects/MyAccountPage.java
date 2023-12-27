package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor js=(JavascriptExecutor) driver;
	@FindBy(xpath = "//*[@id=\"content\"]/h2[1]") // MyAccount Page heading
	WebElement msgHeading;
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]") WebElement lnkLogout;

	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public void clickLogout() {
		js.executeScript("arguments[0].click()", lnkLogout);
	}

}
