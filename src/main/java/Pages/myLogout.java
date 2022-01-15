package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.Seleniumbasics;

public class myLogout extends Seleniumbasics{
	@FindBy(linkText="Log Out")
	WebElement Logoutele;
	
	public void Logoutfun()
	{
		clickElement(Logoutele);
	}
	

}
