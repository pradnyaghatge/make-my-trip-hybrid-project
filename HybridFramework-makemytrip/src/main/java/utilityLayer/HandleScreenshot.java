package utilityLayer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseLayer.BaseClass;

public class HandleScreenshot extends BaseClass {
	
	public static String getscreenshot(String foldername,String testcasename)
	{
		String path=System.getProperty("user.dir")+"//screenshot//"+Handledateformat.dateformat("yyyy")
		+"//"+Handledateformat.dateformat("MMMyyyy")+"//"+Handledateformat.dateformat("ddMMMyyyy")
		+"//"+foldername+"//"+testcasename+Handledateformat.dateformat("ddMMMyyyy_ssmmHH")+".png";
	
		
		
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File src=ts.getScreenshotAs(OutputType.FILE);
		//File dest=new File(path);
		//FileUtils.copyFile(src, dest);
		try {
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File(path));
	
		}catch(Exception e) 
		{
			e.getLocalizedMessage();
		}
		return path;
		}
	}
		
		


