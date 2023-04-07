package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import upskill.amazon.pageAction.AmazonHelpPageActions;

public class AmazonHelpPageSteps {
	
	AmazonHelpPageActions AmazonHelpPageActionsObj = new AmazonHelpPageActions();
	
	@Then("^user should be asked to Sign In$")
	public void user_should_be_asked_to_Sign_In() throws Throwable {
		AmazonHelpPageActionsObj.verifySignIn();
	}

}
