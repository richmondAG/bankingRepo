/**
 * 
 */
package bankTestCases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseTest.BaseTest;
import dataProvider.DataProviders;
import pageObjects.AuthorizationCodeEntry4;
import pageObjects.BillPay;
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
public class BillPayTestCases extends BaseTest {
	
	OLBSimulator1 ol;
	UnrecognizedPage2 re;
	RequestAuthorizationCode3 ra;
	AuthorizationCodeEntry4 ac;
	ECommunicationsDisclosure5 ed;
	HomePage5 hp;
	BillPay bp;
	
	
	
	
	@Test(dataProvider="payBillData", dataProviderClass= DataProviders.class)
	//public void billPay(String a, String b, String c,String d,String e,String f,String g,String h,String i,String j) 
	public void billPay(HashMap<String, String> ho){
		
		ol= new OLBSimulator1();
		//ExtendReport.test.log(Status.INFO, "Clicking On  Unreconginze Device");
	    re=	ol.clickingOnSignIn();
	  //  ExtendReport.test.log(Status.INFO, "Clicking On Sign ");
	    ra= re.unrecognizedPageSignIn();
	  //  ExtendReport.test.log(Status.INFO, "Clicking On SendCode");
	    ac=  ra.clickingOnSendCode();
	  //  ExtendReport.test.log(Status.INFO, "Clicking On Continue");
	    ed= ac.continuebttn();
	  //  ExtendReport.test.log(Status.INFO, "Clicking On eCommunications Disclosure Continue Button");
	    hp= ed.clickingCountinue();
	  //  ExtendReport.test.log(Status.INFO, "Clicking On Remind Me Later Button");
	    hp.popUpclickRemindMeLater();
	    bp= hp.clickingOnBillPayTab();
	     bp.alldata(
//	    		 a, b,
//	    		 c, d,
//	    		 e, f,
//	    		 g, h,
//	    		 i, j
	    		 
	    		 
	    	ho.get("A")	,
	    	ho.get("B"),
	    	ho.get("C"),
	    	ho.get("D"),
	    	ho.get("E"),
	    	ho.get("F"),
	    	ho.get("G"),
	    	ho.get("H"),
	    	ho.get("I"),
	    	ho.get("J"));
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    	
		
		
	}
	
	
	
	

}
