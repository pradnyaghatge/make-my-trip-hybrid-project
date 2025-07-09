package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;


public class HandleDropDown extends  BaseClass{
	public static void dropdown(List <WebElement> listdate,String expectedvalue)
	{
		for(WebElement date:wait.visibilityOfAllElements(listdate))
		{
			String actualvalue1=HandleWebElement.gettext(date);
			if(actualvalue1.equalsIgnoreCase(expectedvalue))
			{
				HandleWebElement.click(date);
				break;
			}
			
		}
	}

}
