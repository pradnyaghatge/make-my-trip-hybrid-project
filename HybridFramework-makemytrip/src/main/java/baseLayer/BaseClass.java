package baseLayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class BaseClass {
		protected static WebDriver driver;
		public  void initialization()
		{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://www.makemytrip.com/");
		}

	}





