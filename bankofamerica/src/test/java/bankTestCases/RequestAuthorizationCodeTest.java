/**
 * 
 */
package bankTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;

import pageObjects.OLBSimulator1;

import pageObjects.RequestAuthorizationCode3;
import pageObjects.UnrecognizedPage2;

/**
 * @author richm
 *
 */
public class RequestAuthorizationCodeTest extends BaseTest {
	
	OLBSimulator1 ol;
	UnrecognizedPage2 re;
	RequestAuthorizationCode3 rc;
	
	
	@Test(priority=1)
	public void validateQuickHelp() {
		ol= new OLBSimulator1();
	    re=	ol.clickingOnSignIn();
	    rc=	re.unrecognizedPageSignIn();
	    boolean qh=	rc.validatingQuickHelp();
	    Assert.assertTrue(qh);
		
		
		
	}
	
	@Test(priority=2)
	public void validatePhoneRadio() {
		
		ol= new OLBSimulator1();
	    re=	ol.clickingOnSignIn();
	    rc=	re.unrecognizedPageSignIn();
	    boolean phradio=   rc.validatingRadioPH();
	    Assert.assertTrue(phradio);
		
	}
	

}
