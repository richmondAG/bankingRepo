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
public class RequestAuthorizationCode3 extends BaseTest {
	
	Action ac = new Action();

	@FindBy(xpath="//*[@id=\"mainContent\"]/div/div/div[2]/div/div/div[1]/div[2]/label/input")
	private WebElement phoneCallRadioBtn;
	
	@FindBy(xpath="//div//a//strong[text()=\"Send Code\"]")
	private WebElement sendCodeBtn;
	
	@FindBy(xpath= "//a[@class=\"link\"]")
	private WebElement quickHelp;
	
	
	
	public RequestAuthorizationCode3() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	public boolean validatingQuickHelp() {
		
	return	ac.isEnabled(getDriver(), quickHelp);
		
	}
	
	
	public boolean validatingRadioPH() {
		phoneCallRadioBtn.click();
		return ac.isSelected(getDriver(), phoneCallRadioBtn);
	}
	
	public AuthorizationCodeEntry4  clickingOnSendCode() {
	sendCodeBtn.click();
	return new AuthorizationCodeEntry4 ();	
	}
}
