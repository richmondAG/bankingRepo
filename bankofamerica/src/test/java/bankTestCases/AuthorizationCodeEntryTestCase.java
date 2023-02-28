/**
 * 
 */
package bankTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageObjects.AuthorizationCodeEntry4;
import pageObjects.OLBSimulator1;
import pageObjects.RequestAuthorizationCode3;
import pageObjects.UnrecognizedPage2;

/**
 * @author richm
 *
 */
public class AuthorizationCodeEntryTestCase extends BaseTest {

	OLBSimulator1 ol;
	UnrecognizedPage2 re;
	RequestAuthorizationCode3 ra;
	AuthorizationCodeEntry4 ac;
	
	

	
	@Test(groups= "Smoke")
	public void validatesecutityQuesRadioBtn() {
		ol= new OLBSimulator1();
	    re=	ol.clickingOnSignIn();
	    ra= re.unrecognizedPageSignIn();
	    ac=  ra.clickingOnSendCode();
	    boolean radio=     ac.validatingsecutityQuesRadioBtn();
	    Assert.assertTrue(radio);
	    
		
		
	}
	
	
	
	
}
