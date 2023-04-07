package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.ebay.pageElements.EbaySearchResultsLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultsLocators EbaySearchResultsLocatorsObj;
	
	public EbaySearchResultActions(){
		
		EbaySearchResultsLocatorsObj = new EbaySearchResultsLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultsLocatorsObj);
		
	}
	
	public void verifyShoesItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultsLocatorsObj.txtShoes.isDisplayed());
		
		//Option 2
		//Assert.assertEquals("Shoes", EbaySearchResultsLocatorsObj.txtShoes.getText());
		
		//Option 3
		//EbaySearchResultsLocatorsObj.txtShoes.isDisplayed();
	}
	
	public void verifyShirtsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultsLocatorsObj.txtShirts.isDisplayed());
		
		//Option 2
		//Assert.assertEquals("Shoes", EbaySearchResultsLocatorsObj.txtShirts.getText());
		
		//Option 3
		//EbaySearchResultsLocatorsObj.txtShirts.isDisplayed();
	}
	
	public void verifyPantsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultsLocatorsObj.txtPants.isDisplayed());
		
		//Option 2
		//Assert.assertEquals("Shoes", EbaySearchResultsLocatorsObj.txtPants.getText());
		
		//Option 3
		//EbaySearchResultsLocatorsObj.txtPants.isDisplayed();
	}
	
	public void filterBrand(String Brand){
		
		if(Brand.equals("Nike")){
		EbaySearchResultsLocatorsObj.cbxNike.click();
		} 
		else if (Brand.equals("Adidas")){
		EbaySearchResultsLocatorsObj.cbxAdidas.click();
		} 
		else if (Brand.equals("Unbranded")){
		EbaySearchResultsLocatorsObj.cbxUnbranded.click(); 
		} else {
			System.out.println("Brand not found");
		}
	}
	
	public void verifyBrand(String Brand){
		
		if(Brand.equals("Nike")){
			Assert.assertTrue(EbaySearchResultsLocatorsObj.txtShoes.isDisplayed());
		} else if (Brand.equals("Adidas")) {		
			Assert.assertTrue(EbaySearchResultsLocatorsObj.txtShirts.isDisplayed());
		}else if (Brand.equals("Unbranded")){
		Assert.assertTrue(EbaySearchResultsLocatorsObj.txtPants.isDisplayed());
		} else {
			System.out.println("Brand not found");
		}
		
	}
	
	public void filterColor(String Color){
		if(Color.equals("Black")){
			EbaySearchResultsLocatorsObj.cbxBlack.click();
		} else if (Color.equals("White")) {
			EbaySearchResultsLocatorsObj.cbxWhite.click();
		} else if (Color.equals("Blue")) {
			EbaySearchResultsLocatorsObj.cbxBlue.click();
		} else {
			System.out.println("Color not found");
		}
	}
	
	public void verifyColor(String Color){
		if (Color.equals("Black")) {
			EbaySearchResultsLocatorsObj.txtShoes.isDisplayed();
		} else if (Color.equals("White")) {
			EbaySearchResultsLocatorsObj.txtShirts.isDisplayed();
		} else if (Color.equals("Blue")) {
			EbaySearchResultsLocatorsObj.txtPants.isDisplayed();
		} else {
			System.out.println("Color not found");
		}
	}
	
	public void selectCottonTee(){
		EbaySearchResultsLocatorsObj.linkShirtItems.click();
	}
}
