package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.BaseTest;

public class Transfer extends BaseTest{
	
	
	
	
	
	@FindBy(xpath= "//*[@id=\"payTo\"]/span")
	private WebElement  toTab;
	
	@FindBy(xpath= "//*[@id=\"payTo\"]/div/ul/li[2]/div")
	private WebElement bankAmericaSaving;
	
	@FindBy(xpath="//*[@id=\"payAmount\"]")
	private WebElement amount;
	
	@FindBy(xpath="//*[@id=\"payHowOften\"]/span")
	private WebElement frequency;
	
	@FindBy(xpath= "//*[text()='One time, immediately']")
	private WebElement oneTimeImediately;
	
	@FindBy(xpath= "//*[@class='btn blue-btn-active mb-4 mt-4']")
	private WebElement next;
	
	@FindBy(xpath="//*[text()='Review Your Transfer Details']")
	private WebElement review;
	
	
	
	public Transfer() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	public void transferProcess() {
		
		toTab.click();
		bankAmericaSaving.click();
		amount.click();
		frequency.click();
		oneTimeImediately.click();
		next.click();
		
		
	}
	
	public String verifyingtoclickNext() {
		
		 return review.getText();
	}
	
	
	
	

}
