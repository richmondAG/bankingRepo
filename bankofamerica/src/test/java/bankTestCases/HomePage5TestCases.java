/**
 * 
 */
package bankTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseTest.BaseTest;
import pageObjects.AuthorizationCodeEntry4;
import pageObjects.ECommunicationsDisclosure5;
import pageObjects.HomePage5;
import pageObjects.OLBSimulator1;
import pageObjects.RequestAuthorizationCode3;
import pageObjects.UnrecognizedPage2;
import utility.ExtendReport;

/**
 * @author richm
 *
 */
public class HomePage5TestCases extends BaseTest{
	
	OLBSimulator1 ol;
	UnrecognizedPage2 re;
	RequestAuthorizationCode3 ra;
	AuthorizationCodeEntry4 ac;
	ECommunicationsDisclosure5 ed;
	HomePage5 hp;
	
	
	

	
	@Test
	public void homepage() {
		
		
		ol= new OLBSimulator1();
		ExtendReport.test.log(Status.INFO, "Clicking On  Unreconginze Device");
	    re=	ol.clickingOnSignIn();
	    ExtendReport.test.log(Status.INFO, "Clicking On Sign ");
	    ra= re.unrecognizedPageSignIn();
	    ExtendReport.test.log(Status.INFO, "Clicking On SendCode");
	    ac=  ra.clickingOnSendCode();
	    ExtendReport.test.log(Status.INFO, "Clicking On Continue");
	    ed= ac.continuebttn();
	    ExtendReport.test.log(Status.INFO, "Clicking On eCommunications Disclosure Continue Button");
	    hp= ed.clickingCountinue();
	    ExtendReport.test.log(Status.INFO, "Clicking On Remind Me Later Button");
	    hp.popUpclickRemindMeLater();
	    ExtendReport.test.log(Status.INFO, "Verifying RemindMeLaterButton with GetTitle");
	    String tittle= hp.getTitle();
	    System.out.println(tittle);
	    Assert.assertEquals(tittle, "Accounts Overview | Online Banking Simulator");
		
	}

}
