package upskill.amazon.stepDef;

import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonSearchResultActions;

public class AmazonSearchResultSteps {
	
	AmazonSearchResultActions AmazonSearchResultActionsObj = new AmazonSearchResultActions();
	
	@When("^click on Payment, charges or gift cards$")
	public void click_on_Payment_charges_or_gift_cards() throws Throwable {
		AmazonSearchResultActionsObj.clickPaymentbtn();

	}
	
	@When("^click on eGift Cards$")
	public void click_on_eGift_Cards() throws Throwable {
		AmazonSearchResultActionsObj.eGiftCard();
	}
	

}
