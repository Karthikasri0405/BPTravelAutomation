

package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import Common.Excelconfig;
import Common.Seleniumbasics;
import Pages.Createquote;
import Pages.myConfigurationpage;
import Pages.myLoginPage;
import Pages.myLogout;
import Pages.myviewQuote;

public class RegressTest extends TestNGBaseclass
{

	public RegressTest()
	{
		excel= new Excelconfig();
		
	}

	


	@Test
	public void validateConfigurationResetFunctionality() throws IOException 
	
	{
	excel.Excelread("C:\\Users\\Karthika\\Desktop\\Logindetails.xlsx", "TestLogin");
		//_myConfigurationpage.clickConfigurationLink();
		//_myConfigurationpage.SelectConfigvalues(2,1,0,2,3);//Doubt in passing the parameter 
		//_myConfigurationpage.clickResetDefault();
		//_myConfigurationpage.validateDefaultConfigValue("None", "7 days from today", "90 days from today", "None", "3 days from today");
		//_myConfigurationpage.NavigateBack(driver);
		_myloginPage.loginWithINValidCredentials("admin","admin","https://bptravel.blueprism.com/");//URL doubt
	
		//_myCreatequote.createQuote(1, "Andorra - Andorra (ALV)", "20/02/2022", "22/02/2022",2,1,"karthika", "AD500", "9187654321", "karthikabalu04@gmail.com");
		//_myviewQuote.selectviewquote();
		//_myviewQuote.searchQuote("Booking Reference", "123");
		//_mylogout.Logoutfun();
		//_myConfigurationpage.deleteuserdata();

		//	  _ConfigurationPage.setRandomConfigurationValues();
		//	  _ConfigurationPage.resetDefault();
		//	  _ConfigurationPage.checkDefaultValues();

	}
	
	
}



