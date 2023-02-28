/**
 * 
 */
package pageObjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionInterface.Action;
import baseTest.BaseTest;



/**
 * @author richm
 *
 */
public class OLBSimulator1 extends BaseTest{
	Action ac= new Action();
	
	 @FindBy(id= "landing_sign")
     private WebElement signIOptionClick;
    
    @FindBy(xpath="//*[@id=\"signinOptions\"]/li[2]/a")
    private WebElement unrecongizeClick;
	
public OLBSimulator1() {
	
	PageFactory.initElements(getDriver(), this);
}




  public UnrecognizedPage2 clickingOnSignIn() {
	 // ac.scrollByVisibilityOfElement(getDriver(), signIOptionClick);
	 //ac.implicitWait(getDriver(), 3);
	  signIOptionClick.click();
	  unrecongizeClick.click();
	  return new UnrecognizedPage2();
  }
  


	
	}
	
	


