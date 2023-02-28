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
public class AuthorizationCodeEntry4  extends BaseTest{
	
	Action ac = new Action();
	
	@FindBy(id="authorizatonCode")
	private WebElement authorizatonCode;
	
	@FindBy(name="radio1")
	private WebElement securityQuestionYesradio1;
	
	@FindBy(xpath= "//div//a//strong[text()=\"Continue\"]")
	private WebElement continueBtn;
	
	public AuthorizationCodeEntry4() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	public ECommunicationsDisclosure5 continuebttn() {
		authorizatonCode.click();
		securityQuestionYesradio1.click();
		continueBtn.click();
		return new ECommunicationsDisclosure5();
	}
	
	public boolean validatingsecutityQuesRadioBtn() {
		securityQuestionYesradio1.click();
		return ac.isSelected(getDriver(), 	securityQuestionYesradio1);
		
	}

}
