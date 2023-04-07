package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultsLocators {
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(),'shoes')]")
	public WebElement txtShoes;
	
	//Validate Shirts Items
	@FindBy(xpath="//span[2][contains(text(),'shirts')]")
	public WebElement txtShirts;
	
	//Validate Pants Items
	@FindBy(xpath="//span[2][contains(text(),'pants')]")
	public WebElement txtPants;
	
	//check box brand Nike
	@FindBy(xpath = "//input[@aria-label = 'Nike']")
	public WebElement cbxNike;
	
	@FindBy(xpath = "//input[@aria-label = 'adidas']")
	public WebElement cbxAdidas;
	
	@FindBy(xpath = "//input[@aria-label = 'Unbranded']")
	public WebElement cbxUnbranded;
	
	@FindBy (xpath = "//input[@aria-label = 'Black']")
	public WebElement cbxBlack;
	
	@FindBy (xpath = "//input[@aria-label = 'White']")
	public WebElement cbxWhite;
	
	@FindBy (xpath = "//input[@aria-label = 'Blue']")
	public WebElement cbxBlue;
	
	@FindBy (xpath = "//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With & without')]")
	public WebElement linkShirtItems;
		
}
