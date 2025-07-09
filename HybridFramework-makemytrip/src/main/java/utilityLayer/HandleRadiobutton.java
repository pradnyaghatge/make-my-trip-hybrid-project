package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class HandleRadiobutton extends BaseClass {

	public static void selectRadiobutton(List<WebElement> wb, String expectedvalue) {
		
		for (WebElement button : wait.visibilityOfAllElements(wb)) {
		
			String actualbutton = HandleWebElement.gettext(button);
			
			if (actualbutton.contains(expectedvalue)) {
			
				HandleWebElement.click(button);
				
				break;
			}
		}
	}
}
