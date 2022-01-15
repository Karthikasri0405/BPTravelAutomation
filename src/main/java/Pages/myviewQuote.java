package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.Seleniumbasics;

public class myviewQuote extends Seleniumbasics {
	@FindBy(id ="quoteRadio")
	WebElement Quotereference;
	@FindBy(id="orderRadio")
	WebElement  bookingreference;
	@FindBy(id="nameRadio")
	WebElement namesearch;
	@FindBy(className = "text")
	WebElement Searchtext;
	@FindBy(linkText = "View Quote")
	WebElement viewquote;
	@FindBy(className = "button")
	WebElement submitbut;
	
	
	public void selectviewquote()
	{

		clickElement(viewquote);
	}
	public void searchQuote(String searchval, String searchinput)
	{


		if(searchval.equals("Quotereference"))
		{
			clickElement(Quotereference);
		}
		else if(searchval.equals("bookingreference"))
		{
			clickElement(bookingreference);
		}
		else if(searchval.equalsIgnoreCase("name"))
		{
			clickElement(namesearch);
		}
		enterText(Searchtext, searchinput);
		clickElement(submitbut); 
	}


}
