package testcases;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Common.Excelconfig;
import Common.Seleniumbasics;
import Pages.Createquote;
import Pages.myConfigurationpage;
import Pages.myLoginPage;
import Pages.myLogout;
import Pages.myviewQuote;

public class TestNGBaseclass extends Seleniumbasics {
	
	// Karthika
	public WebDriver driver=null;

	public myLoginPage _myloginPage= null;
	public myConfigurationpage _myConfigurationpage=null;
	public Createquote _myCreatequote=null;
	public myviewQuote _myviewQuote =null;
	public myLogout _mylogout= null;
	public  Excelconfig excel;
	public Map<String, String> Hmap = new HashedMap<String, String>();
	@BeforeMethod
	public void beforeMethod() 
	{
		driver = browserStart("https://bptravel.blueprism.com/");
		// className obj = new ClassName();
		//_loginPage = new LoginPage(driver);
		_myConfigurationpage = PageFactory.initElements(driver, myConfigurationpage.class);
		_myloginPage = PageFactory.initElements(driver, myLoginPage.class);
		_myCreatequote =PageFactory.initElements(driver, Createquote.class);
		_myviewQuote=PageFactory.initElements(driver, myviewQuote.class);
		_mylogout=PageFactory.initElements(driver, myLogout.class);
	}
	@AfterMethod
	public void browserclose() 
	{

	browserClose(driver);
	}

}
