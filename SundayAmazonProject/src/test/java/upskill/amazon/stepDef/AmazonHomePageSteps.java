package upskill.amazon.stepDef;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonHomePageActions;
import upskill.utilities.SetupDrivers;

public class AmazonHomePageSteps {
	
	AmazonHomePageActions AmazonHomePageActionsobj = new AmazonHomePageActions();
	
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {

	}

	@When("^click on Help$")
	public void click_on_Help() throws Throwable {
		AmazonHomePageActionsobj.clickHelpbtn();

	}
	
	@When("^mouse hover over language$")
	public void mouse_hover_over_language() throws Throwable {
		AmazonHomePageActionsobj.languagehover();
	}

	@When("^click Spanish$")
	public void click_Spanish() throws Throwable {
		AmazonHomePageActionsobj.selectSpanish();
	}
	
	@Then("^webpage should reload in Spanish$")
	public void webpage_should_reload_in_Spanish() throws Throwable {
		AmazonHomePageActionsobj.verifySpanish();
	}
	
	@When("^click on Gift Cards$")
	public void click_on_Gift_Cards() throws Throwable {
		AmazonHomePageActionsobj.clickGiftCard();
	}
	



}
