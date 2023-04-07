package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch; 
	
	//Search Button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//a[1][contains(text(),'My eBay')]")
	public WebElement linkMyEbay; 
	
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummary;
}
