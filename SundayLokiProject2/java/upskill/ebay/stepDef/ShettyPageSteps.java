package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.ShettyPageActions;
import upskill.utilities.SetupDrivers;

public class ShettyPageSteps {
	
	ShettyPageActions ShettyPageActionsObj = new ShettyPageActions();
	
	@Given("^Open Shetty Homepage$")
	public void open_Shetty_Homepage() throws Throwable {
		ShettyPageActionsObj.loadShettyHomepage();
	}

	@When("^Click on \"([^\"]*)\"$")
	public void click_on(String Button) throws Throwable {
		ShettyPageActionsObj.AlertButton(Button);
	}

	@Then("^Click_on \"([^\"]*)\"$")
	public void click_on1(String Alert) throws Throwable {
		ShettyPageActionsObj.handlealert(Alert);
	}
	
	@When("^Click on iFrame Home$")
	public void click_on_iFrame_Home() throws Throwable {
		ShettyPageActionsObj.clickIframeHome();
	}

	@Then("^It should reload iframe homepage$")
	public void it_should_relo_ad_iframe_homepage() throws Throwable {
		ShettyPageActionsObj.verifyShettyHome();
	}
	

}
