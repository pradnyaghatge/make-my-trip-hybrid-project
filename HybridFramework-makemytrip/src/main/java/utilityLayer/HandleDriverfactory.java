package utilityLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleDriverfactory {

	private static ThreadLocal<WebDriver> td;

	public  WebDriver getdriver() 
	{
		td = new ThreadLocal<WebDriver>();
		return td.get();

	}

	public void setdriver(String browesername) {
		if (browesername.equalsIgnoreCase("chrome")) {
			td.set(new ChromeDriver());
		} else if (browesername.equalsIgnoreCase("Edge")) {
			td.set(new EdgeDriver());
		}
		if (browesername.equalsIgnoreCase("incognito")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));

		}
		if (browesername.equalsIgnoreCase("headless")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
		} else if (browesername.equalsIgnoreCase("private")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--private")));

		} else {
			System.out.println("enter valid browser");
		}
	

	}

}
