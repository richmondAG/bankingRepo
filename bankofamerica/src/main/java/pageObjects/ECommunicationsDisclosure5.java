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
public class ECommunicationsDisclosure5 extends BaseTest{
	
	Action ac = new Action();
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[2]/div/div/div/div[2]/label/input")
	private WebElement agreeClick;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[2]/div/div/div/div[3]/a[1]/strong")
	private WebElement continueAgree;
	
	@FindBy(xpath= "//*[@id=\"mainContent\"]/div[2]/div/div/div/div[1]/label/input")
	private WebElement consent;
	
	
	
	public ECommunicationsDisclosure5 () {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public HomePage5 clickingCountinue() {
		consent.click();
		agreeClick.click();
		continueAgree.click();
		
		return new HomePage5();
		
	}

}
