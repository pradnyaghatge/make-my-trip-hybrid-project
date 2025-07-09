package utilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerUtils implements ITestListener{
      
	ExtentReports extentreport;
	
	ExtentTest extenttest;

	@Override
	public void onStart(ITestContext context) {
		String suit=context.getSuite().getName();
		 
		extentreport=new ExtentReports();
		
		String path=System.getProperty("user.dir")+"//ExtentReprt//"+Handledateformat.dateformat("yyyy")+"//"
		+Handledateformat.dateformat("MMMyyyy")+"//"+Handledateformat.dateformat("ddMMMyyyy")+"//"
		+suit+Handledateformat.dateformat("ddMMMyyyy_HHmmss")+".html";
		
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter(path);
		extentreport.attachReporter(sparkreporter);

		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		extenttest=extentreport.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String method=result.getMethod().getMethodName();
		extenttest.log(Status.PASS, method);
	    extenttest.addScreenCaptureFromPath(HandleScreenshot.getscreenshot("passed", method));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String method=result.getMethod().getMethodName();
		extenttest.log(Status.FAIL,method);
		extenttest.addScreenCaptureFromPath(HandleScreenshot.getscreenshot("Failed", method));
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String method=result.getMethod().getMethodName();
	
		extenttest.addScreenCaptureFromPath(HandleScreenshot.getscreenshot("skipped", method));
		}
	
	@Override
	public void onFinish(ITestContext context) {
		
		String suit=context.getSuite().getName();
		System.out.println(suit);
		extentreport.flush();
		
	}
	
	

}
