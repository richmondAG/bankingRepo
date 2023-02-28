/**
 * 
 */
package bankTestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseTest.BaseTest;
import pageObjects.OLBSimulator1;
import pageObjects.UnrecognizedPage2;
import utility.ExtendReport;


/**
 * @author richm
 *
 */
public class OLBSimulatorTestCase extends BaseTest{
	OLBSimulator1 ol;
	UnrecognizedPage2 re;
	
	

	

	@Test(groups={"Smoke", "Sanity"})
	public void test1() {
		ol = new OLBSimulator1();
		re = ol.clickingOnSignIn();
		
		//ExtendReport.test.log(Status.INFO, "Verifying if user is able to click sign in");
		String checIfClickWorks = re.validatingClick();
		System.out.println("Real"+ ""+ checIfClickWorks);
		Assert.assertEquals(checIfClickWorks, "The1bank");
	}
	

}
