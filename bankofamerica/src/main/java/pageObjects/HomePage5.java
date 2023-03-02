/**
 * 
 */
package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionInterface.Action;
import baseTest.BaseTest;

/**
 * @author richm
 *
 */
public class HomePage5 extends BaseTest {
	Action ac= new Action();
	
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div/div/div/div[2]/div/button[2]")
	private WebElement HomePagePopOut;
	
	@FindBy(xpath = "//*[@id='root']/div/div/header/div/div[3]/div/nav/ul/li[2]/a")
	private WebElement billpayTab;
	
	@FindBy(xpath= "//*[text()='Transfer | Zelle®']")
	private WebElement transferTab;
	
	public  HomePage5() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	public void popUpclickRemindMeLater()  {
		ac.JSClick(getDriver(), HomePagePopOut);
	
	}
	
	public String getTitle() {
		return getDriver().getTitle();
	}
	
	
	public BillPay clickingOnBillPayTab() {
	
		ac.click(billpayTab, getDriver());
		return new BillPay();
	}

	
	public IwanToTransferMoney clickingTransferTab() {
		ac.click(transferTab, getDriver());
		
		return new IwanToTransferMoney();
	}
}
