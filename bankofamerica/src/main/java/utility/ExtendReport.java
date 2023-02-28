/**
 * 
 */
package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author richm
 *
 */
public class ExtendReport {

	
	public static ExtentHtmlReporter htmlRepoter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static String getCurrentTime() {
		
		 String currentDate= new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		 return currentDate;
	}
	
	
	public static void setExtent() {
		
		
		htmlRepoter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentRepots/"+"MyReport_"+getCurrentTime() +".html");
		
		htmlRepoter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		
		//htmlRepoter.config().setDocumentTitle("Automation Test Report");
		//htmlRepoter.config().setReportName("OrangeHRM Test Automation Report");
		//htmlRepoter.config().setTheme(Theme.STANDARD);
		
		
	    extent = new ExtentReports();
	    extent.attachReporter(htmlRepoter);
	    
	    extent.setSystemInfo("HostName", "MyHost");
	    extent.setSystemInfo("ProjectName", "BankOfAmerica");
	    extent.setSystemInfo("Tester", "Rich");
	    extent.setSystemInfo("Browser", "Chrome");
	
		
		
	}
	
    
	public static void endReport() {
		extent.flush();
		
		
		
	}
	
	
	
	
	
	
	
}
