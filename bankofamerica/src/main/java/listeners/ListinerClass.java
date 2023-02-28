package listeners;






import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import actionInterface.Action;
import baseTest.BaseTest;
import utility.ExtendReport;

public class ListinerClass extends ExtendReport implements ITestListener {
	
	Action action= new Action();
	
	public void onTestStart(ITestResult result) {
			test = extent.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			 test.log(Status.PASS, "Pass Test case is:" + result.getName());
		}
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			String imgPath = action.screenShot(BaseTest.getDriver(), result.getName());
			test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}														
		}
	}

	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test case is:" + result.getName());
		}
	}

	public void onStart(ITestContext context) {
		setExtent();
	}

	public void onFinish(ITestContext context) {
		endReport();
	}

}
