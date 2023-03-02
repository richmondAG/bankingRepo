package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.BaseTest;

public class IwanToTransferMoney extends BaseTest {
	
	
	@FindBy(xpath= "//*[@id=\"mainContent\"]/div/div[1]/div/div/div[2]/ul/li[1]/a/div/div[1]")
	private WebElement btweenmyaccount;
	
	
	public  IwanToTransferMoney() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	

	public Transfer clickBetweenAccount() {
		
		btweenmyaccount.click();
		
		return new Transfer();
	}
	
}
