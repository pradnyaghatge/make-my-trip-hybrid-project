package utilityLayer;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;


public class HandleWebElement extends BaseClass {
	public static void sendkeys(WebElement wb, String expectedvalue) {
		wait.visibilityof(wb).sendKeys(expectedvalue);
		

	}

	public static void click(WebElement wb) {
		wait.toBeClickable(wb).click();
	}

	public static String gettext(WebElement wb) {
		return wait.visibilityof(wb).getText();
	}
}