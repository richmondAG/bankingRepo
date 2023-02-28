/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.BaseTest;

/**
 * @author richm
 *
 */
public class UnrecognizedPage2 extends BaseTest{
	
	@FindBy(xpath= "//*[@id=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath= "//input[@id=\"passcode\"]")
	private WebElement password;
	
	@FindBy(xpath ="//a[contains(@class, 'link button')]")
	private WebElement unClick;
	
	public UnrecognizedPage2() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	public RequestAuthorizationCode3 unrecognizedPageSignIn() {
		
		username.click();
		password.click();
		unClick.click();
		return new RequestAuthorizationCode3();
		
	}
	
	
	
	
	
	public String validatingClick() {
		username.click();
		return username.getAttribute("value");
	}
	
}
