package utilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLayer.BaseClass;


public class wait extends   BaseClass {

	public static WebElement visibilityof(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(wb));
	}

	public static WebElement toBeClickable(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(wb));
	}

	public static List<WebElement> visibilityOfAllElements(List<WebElement> wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOfAllElements(wb));

	}

	public static WebDriver frameToBeAvailable(String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));

	}

	public static WebDriver frameToBeAvailable(int index) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));

	}

	public static WebDriver frameToBeAvailable(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));

	}
}
