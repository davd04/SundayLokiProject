package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonCartPageActions;

public class AmazonCartPageSteps {
	
	AmazonCartPageActions AmazonCartPageActionsObj = new AmazonCartPageActions();
	
	@When("^select Gift Card Design$")
	public void select_Gift_Card_Design() throws Throwable {
		AmazonCartPageActionsObj.GiftCardDesign();
	}

	@When("^select Design$")
	public void select_Design() throws Throwable {
		AmazonCartPageActionsObj.CardDesign();
	}

	@When("^select amount$")
	public void select_amount() throws Throwable {
		AmazonCartPageActionsObj.amount();
	}

	@When("^select delivery$")
	public void select_delivery() throws Throwable {
		AmazonCartPageActionsObj.delivery();
	}

	@When("^select to$")
	public void select_to() throws Throwable {
		AmazonCartPageActionsObj.enterto();
	}

	@When("^select from$")
	public void select_from() throws Throwable {
		AmazonCartPageActionsObj.enterfrom();
	}

	@When("^select message$")
	public void select_message() throws Throwable {
		AmazonCartPageActionsObj.entermessage();
	}

	@When("^select quantity$")
	public void select_quantity() throws Throwable {
		AmazonCartPageActionsObj.quantity();
	}

	@When("^select delivery date$")
	public void select_delivery_date() throws Throwable {
		AmazonCartPageActionsObj.deliverydate();
	}

	@Then("^add to cart$")
	public void add_to_cart() throws Throwable {
		AmazonCartPageActionsObj.addtocart();
	}


}
