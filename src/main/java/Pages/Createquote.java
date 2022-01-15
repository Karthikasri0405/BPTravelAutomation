package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.Seleniumbasics;

public class Createquote extends Seleniumbasics{
	@FindBy(linkText = "Create Quote")
	WebElement createquote;
	@FindBy(id="from")
	WebElement fromele;
	@FindBy(id ="to")
	WebElement toele;
	@FindBy(className = "text")
	WebElement departingele;
	@FindBy(id="oneway")
	WebElement onewayele;
	@FindBy(id="returning")
	WebElement returnele;
	@FindBy(id="adults")
	WebElement adultele;
	@FindBy(id="children")
	WebElement childrenele;
	@FindBy(id="name")
	
	
	WebElement nameele;
	@FindBy(id="postcode")
	WebElement postele;
	@FindBy(id ="telephone")
	WebElement telephoneele;
	@FindBy(id="email")
	WebElement idele;
	@FindBy (className ="button")
	WebElement createquoteEle; 
	public void createQuote(int fromelement,String toelemt,String departing ,String returnelemt,int adultval,int childval,String nameval,String postal,String teleno,String email)
	{
		clickElement(createquote);
		selectByIndex(fromele, fromelement);
		selectByVisibleText(toele, toelemt);
			

		enterText(departingele, departing);//date format 

		if(onewayele.isSelected()==true) 
		{
			System.out.println("Oneway is selected");
			//enterText(returnele, returnelemt);

		}
		else
		{
			//clickElement(onewayele);
			enterText(returnele, returnelemt);
		}
		selectByIndex(adultele, adultval);
		selectByIndex(childrenele, childval);
		enterText(nameele, nameval);
		enterText(postele,postal );
		enterText(telephoneele, teleno);//telephone number passed as string ,in enter text parameters passed as string 
		enterText(idele, email);
		clickElement(createquoteEle);


	}


}
