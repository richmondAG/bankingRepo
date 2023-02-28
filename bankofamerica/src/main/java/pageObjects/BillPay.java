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
public class BillPay extends BaseTest{
	
	Action ac= new Action();
	
	
	
	
	
	@FindBy(id= "amount7778")
	private WebElement aaAutoAmount;
	
	@FindBy(xpath = "//input[@id='7778']")
	private WebElement aaDeliverBy;
	
	@FindBy(id= "amount8899")
	private WebElement aTTAmount;
	
	@FindBy(xpath = "//*[@id='8899']")
	private WebElement aTTDeliverBy;
	
	
	@FindBy(id= "amount5555")
	private WebElement visaAmount;
	
	@FindBy(xpath = "//*[@id='5555']")
	private WebElement visaDeliverBy;
	
	
	
	@FindBy(id= "amount9999")
	private WebElement dukeAmount;
	
	@FindBy(xpath = "//*[@id='9999']")
	private WebElement dukeDeliverBy;
	
	@FindBy(id= "amount3597")
	private WebElement insuranceAmount;
	
	@FindBy(xpath = "//*[@id='3597']")
	private WebElement insuranceDeliverBy;
	
	
	public BillPay() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	
	
	public void alldata(String a, String b, String c,String d,String e,String f,String g,String h,String i,String j) {
		
		    ac.type(aaAutoAmount, a);
			ac.type(aaDeliverBy, b);
			ac.type(aTTAmount, c);
			ac.type(aTTDeliverBy, d);
			ac.type(visaAmount, e);
			ac.type(visaDeliverBy, f);
			ac.type(dukeAmount, g);
			ac.type(dukeDeliverBy, h);
			ac.type(insuranceAmount, i);
			ac.type(insuranceDeliverBy, j);

	
		
		
	}
	
	

}
