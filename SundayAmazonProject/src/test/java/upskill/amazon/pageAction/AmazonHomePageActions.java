package upskill.amazon.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.amazon.pageElements.AmazonHomePageLocators;
import upskill.utilities.SetupDrivers;

public class AmazonHomePageActions {
	
	AmazonHomePageLocators AmazonHomePageLocatorsObj;
	
	public AmazonHomePageActions(){
		AmazonHomePageLocatorsObj = new AmazonHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHomePageLocatorsObj);
	}
	
	public void clickHelpbtn() throws Exception{
		
		AmazonHomePageLocatorsObj.helpbtn.click();
		Thread.sleep(2000);
	}
	
	public void languagehover() throws Exception{
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonHomePageLocatorsObj.languagehover);
		actions.perform();
		Thread.sleep(2000);
	}
	
	public void selectSpanish(){
		AmazonHomePageLocatorsObj.spanish.click();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void verifySpanish() throws Exception{
		AmazonHomePageLocatorsObj.spanishtxt.isDisplayed();
		Thread.sleep(2000);
	}
	
	public void clickGiftCard(){
		AmazonHomePageLocatorsObj.GiftCard.click();
		
	}
	
	

}
