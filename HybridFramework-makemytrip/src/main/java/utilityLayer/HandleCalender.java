package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;



public class HandleCalender extends  BaseClass{
	public static void selectMonthYear(WebElement monthyear,WebElement next,String expectedmonthyear)
	{
		while(true)
		{
			String actualmonthyear=monthyear.getText();
			if(actualmonthyear.equalsIgnoreCase(expectedmonthyear))
			{
		            break;
			}
			else
			{
			HandleWebElement.click(next);
			}
		}
	}


public static void selectdate(List <WebElement> listdate,String expectedvalue)
{
	for(WebElement date:listdate)
	{
		String actualdate= HandleWebElement.gettext(date);
		if(actualdate.contains(expectedvalue))
		{
			 HandleWebElement.click(date);
			 break;
		}
	}
}
}

