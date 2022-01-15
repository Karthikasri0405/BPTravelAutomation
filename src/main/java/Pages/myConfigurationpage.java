package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.PrintUtills;
import Common.Seleniumbasics;

public class myConfigurationpage extends Seleniumbasics{
	private WebDriver driver;
	
	public myConfigurationpage(WebDriver pageDriver) 
	{
		this.driver=pageDriver;
	}
	
	
	// Elements locate
	@FindBy( linkText = "Configuration")
	WebElement ConfigEle;
	
	@FindBy(id = "delay")
	WebElement navigationEle;
	@FindBy(id="quoteDepartureMinimum")
	WebElement DepminEle;
	@FindBy(id ="quoteDepartureMaximum")
	WebElement DepmaxEle;
	@FindBy(id ="quoteReturnMaximum")
	WebElement DepRetEle;
	@FindBy(id ="bookingDepartureMinimum")
	WebElement bookDepminEle;
	@FindBy(className ="button")
	WebElement ResetEle;
	@FindBy(xpath = "//div[@id='body']/table/tbody/tr[3]/td[2]/span")
	WebElement LogInButtonEle;
	@FindBy(className ="button")
	WebElement deleteEle;
	@FindBy(xpath="//a[text()='Configuration']")
	WebElement configEle;
	
	
	//Page methods
	
	public void setRandomConfigurationValues() 
	{
		
	}
	public void clickConfigurationLink()
	{
		
		clickElement(configEle);
	}
	
	
	public void SelectConfigvalues( int NaviDelay, int depMinimum, int DepMax,int Depreturn,int Bookdep) 
	
	{
//How to pass multiple parameters
		selectByIndex(navigationEle, NaviDelay);
		selectByIndex(DepminEle, depMinimum);
		selectByIndex(DepmaxEle,DepMax);
		selectByIndex(DepRetEle,Depreturn);
		selectByIndex(bookDepminEle,Bookdep);		
	}
	
	public void clickResetDefault() 
	{
		clickElement(ResetEle);
	}
	
	public void validateDefaultConfigValue(String defaultNaviExpectedVal,String defaultDepminexp,String defaultDepmaxexp,String defaultreturnexp,String defultbookdepexp) 
	{
		String defaultNaviValue= getDefaultDropdownValue(navigationEle);
		String defaultDepminEleValue= getDefaultDropdownValue(DepminEle);
		String defaultDepmaxEleValue= getDefaultDropdownValue(DepmaxEle);
		String defaultDepRetEleValue= getDefaultDropdownValue(DepRetEle);
		String defaultbookDepminEleValue= getDefaultDropdownValue(bookDepminEle);
		if (defaultNaviValue.equals(defaultNaviExpectedVal) && 
				defaultDepminEleValue.equals(defaultDepminexp) && defaultDepmaxEleValue.equals(defaultDepmaxexp)&& defaultDepRetEleValue.equals(defaultreturnexp) && defaultbookDepminEleValue.equals(defultbookdepexp) )
		{
			PrintUtills.logMsg("Default values matched");
		
	   }else 
	   {
		   PrintUtills.logError("Default values not matched");
	   }
		
		}
	public void deleteuserdata()
	{
		clickElement(deleteEle);
	}
	

	public void checkDefaultValues() 
	{
		
	}
}



