package utilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseLayer.BaseClass;

public class HandleAction extends BaseClass
{
	public static void sendKeys(WebElement wb,String expectedvalue)
	{
		Actions act=new Actions(driver);
		act.sendKeys(wait.visibilityof(wb), expectedvalue).build().perform();
	}
	}
