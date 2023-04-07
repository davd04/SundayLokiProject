package upskill.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.AmazonSearchResultLocators;
import upskill.utilities.SetupDrivers;

public class AmazonSearchResultActions {
	
	AmazonSearchResultLocators AmazonSearchResultLocatorsObj;
	
	public AmazonSearchResultActions(){
		AmazonSearchResultLocatorsObj = new AmazonSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonSearchResultLocatorsObj);
	}
	
	public void clickPaymentbtn() throws Exception{
		AmazonSearchResultLocatorsObj.Paymentbtn.click();
		Thread.sleep(2000);
	}
	
	public void eGiftCard(){
		AmazonSearchResultLocatorsObj.eGiftCard.click();
	}
	

}
