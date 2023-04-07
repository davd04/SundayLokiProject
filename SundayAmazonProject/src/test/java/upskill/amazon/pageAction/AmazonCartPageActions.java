package upskill.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.AmazonCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class AmazonCartPageActions {
	
	AmazonCartLocators AmazonCartLocatorsObj;
	
	public AmazonCartPageActions(){
		AmazonCartLocatorsObj = new AmazonCartLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonCartLocatorsObj);
	}
	
	public void GiftCardDesign(){
		AmazonCartLocatorsObj.GiftCardDesign.click();
	}
	
	public void CardDesign(){
		AmazonCartLocatorsObj.CardDesign.click();
	}
	
	public void amount(){
		AmazonCartLocatorsObj.amount.click();
	}
	
	public void delivery(){
		AmazonCartLocatorsObj.delivery.click();
	}
	
	public void enterto() throws Exception{
		AmazonCartLocatorsObj.to.click();
		AmazonCartLocatorsObj.to.sendKeys(ReadExcelSheet.getMapData("To"));
		Thread.sleep(2000);
	}
	
	public void enterfrom() throws Exception{
		AmazonCartLocatorsObj.from.click();
		AmazonCartLocatorsObj.from.sendKeys(ReadExcelSheet.getMapData("From"));
		Thread.sleep(2000);
	}
	
	public void entermessage() throws Exception{
		AmazonCartLocatorsObj.message.clear();
		AmazonCartLocatorsObj.message.sendKeys(ReadExcelSheet.getMapData("Message"));
		Thread.sleep(2000);
	}
	
	public void quantity() throws Exception{
		AmazonCartLocatorsObj.quantity.click();
		AmazonCartLocatorsObj.quantity.clear();
		AmazonCartLocatorsObj.quantity.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		Thread.sleep(2000);
	}
	
	public void deliverydate() throws Exception{
		AmazonCartLocatorsObj.DeliveryDate.click();
		AmazonCartLocatorsObj.Date.click();
		Thread.sleep(2000);
	}
	
	public void addtocart() throws Exception{
		AmazonCartLocatorsObj.addtocart.click();
		Thread.sleep(2000);
	}

}
