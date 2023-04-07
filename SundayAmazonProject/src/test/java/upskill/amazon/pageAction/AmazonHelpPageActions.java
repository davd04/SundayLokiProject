package upskill.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.AmazonHelpPageLocators;
import upskill.utilities.SetupDrivers;

public class AmazonHelpPageActions {
	AmazonHelpPageLocators AmazonHelpPageLocatorsObj;
	
	public AmazonHelpPageActions(){
		AmazonHelpPageLocatorsObj = new AmazonHelpPageLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHelpPageLocatorsObj);
	}
	
	public void verifySignIn() throws Exception{
		AmazonHelpPageLocatorsObj.txtSignIn.isDisplayed();
		Thread.sleep(2000);
	}

}
