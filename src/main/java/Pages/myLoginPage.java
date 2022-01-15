
package Pages;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Common.PrintUtills;
import Common.Seleniumbasics;

public class myLoginPage extends Seleniumbasics{

	private WebDriver driver;


	public myLoginPage(WebDriver pageDriver) 
	{
		this.driver=pageDriver;
	}


	//public WebElement UserNameEle = driver.findElement(By.id("username"));
	//public WebElement PasswordEl7 = driver.findElement(By.id("password"));

	// Loacting the page webelements 
	@FindBy( id = "username")
	WebElement UserNameEle;

	@FindBy(id = "password")
	WebElement PasswordEle;

	@FindBy(xpath = "//div[@id='body']/table/tbody/tr[3]/td[2]/span")
	WebElement LogInButtonEle;

	@FindBy(id = "message")
	WebElement errortextEle;




	// Pagemethods 

	public void loginWithValidCredentials(String userName, String password, String URL) 
	{

		enterText(UserNameEle, userName);
		enterText(PasswordEle, password);
		clickElement(LogInButtonEle);

		String actualURL = getCurrentURL(driver);
		if(actualURL.equals(URL))
		{
			PrintUtills.logMsg("Application successfully logged in with given credentialss");

		}else 
		{
			PrintUtills.logError("Application landed to invalid page :: "+actualURL);
		}
	}

	public void loginWithINValidCredentials(String userName, String password, String expectedErrorText) 
	{
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		enterText(UserNameEle, userName);
		enterText(PasswordEle, password);
		clickElement(LogInButtonEle);

		String actualErrorMsg= getText(errortextEle);
		if(actualErrorMsg.equals(expectedErrorText))
		{
			PrintUtills.logMsg("Application not logged in.");

		}else 
		{
			PrintUtills.logError("Application logged in successfully :: "+actualErrorMsg);
		}
	}
	
}







